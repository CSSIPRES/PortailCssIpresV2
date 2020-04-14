package com.secusociale.portail.web.rest;

import com.secusociale.portail.PortailCssIpresV2App;
import com.secusociale.portail.domain.Paiement;
import com.secusociale.portail.repository.PaiementRepository;
import com.secusociale.portail.service.PaiementService;
import com.secusociale.portail.web.rest.errors.ExceptionTranslator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.web.PageableHandlerMethodArgumentResolver;
import org.springframework.http.MediaType;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.Base64Utils;
import org.springframework.validation.Validator;

import javax.persistence.EntityManager;
import java.util.List;

import static com.secusociale.portail.web.rest.TestUtil.createFormattingConversionService;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.Matchers.hasItem;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

/**
 * Integration tests for the {@link PaiementResource} REST controller.
 */
@SpringBootTest(classes = PortailCssIpresV2App.class)
public class PaiementResourceIT {

    private static final String DEFAULT_NUMERO_ORDRE_VIREMENT = "AAAAAAAAAA";
    private static final String UPDATED_NUMERO_ORDRE_VIREMENT = "BBBBBBBBBB";

    private static final String DEFAULT_BANQUE_SOURCE = "AAAAAAAAAA";
    private static final String UPDATED_BANQUE_SOURCE = "BBBBBBBBBB";

    private static final String DEFAULT_NUMERO_COMPTE_SOURCE = "AAAAAAAAAA";
    private static final String UPDATED_NUMERO_COMPTE_SOURCE = "BBBBBBBBBB";

    private static final String DEFAULT_BANQUE_DESTINATION = "AAAAAAAAAA";
    private static final String UPDATED_BANQUE_DESTINATION = "BBBBBBBBBB";

    private static final String DEFAULT_NUMERO_COMPTE_DESTINATION = "AAAAAAAAAA";
    private static final String UPDATED_NUMERO_COMPTE_DESTINATION = "BBBBBBBBBB";

    private static final String DEFAULT_REFERENCE_FACTURE = "AAAAAAAAAA";
    private static final String UPDATED_REFERENCE_FACTURE = "BBBBBBBBBB";

    private static final Integer DEFAULT_MONTANT_TOTAL = 1;
    private static final Integer UPDATED_MONTANT_TOTAL = 2;

    private static final Integer DEFAULT_MONTANT_ACCOUNT = 1;
    private static final Integer UPDATED_MONTANT_ACCOUNT = 2;

    private static final String DEFAULT_ETAT = "AAAAAAAAAA";
    private static final String UPDATED_ETAT = "BBBBBBBBBB";

    private static final String DEFAULT_FILE_JOIN = "AAAAAAAAAA";
    private static final String UPDATED_FILE_JOIN = "BBBBBBBBBB";

    @Autowired
    private PaiementRepository paiementRepository;

    @Autowired
    private PaiementService paiementService;

    @Autowired
    private MappingJackson2HttpMessageConverter jacksonMessageConverter;

    @Autowired
    private PageableHandlerMethodArgumentResolver pageableArgumentResolver;

    @Autowired
    private ExceptionTranslator exceptionTranslator;

    @Autowired
    private EntityManager em;

    @Autowired
    private Validator validator;

    private MockMvc restPaiementMockMvc;

    private Paiement paiement;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.initMocks(this);
        final PaiementResource paiementResource = new PaiementResource(paiementService);
        this.restPaiementMockMvc = MockMvcBuilders.standaloneSetup(paiementResource)
            .setCustomArgumentResolvers(pageableArgumentResolver)
            .setControllerAdvice(exceptionTranslator)
            .setConversionService(createFormattingConversionService())
            .setMessageConverters(jacksonMessageConverter)
            .setValidator(validator).build();
    }

    /**
     * Create an entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Paiement createEntity(EntityManager em) {
        Paiement paiement = new Paiement()
            .numeroOrdreVirement(DEFAULT_NUMERO_ORDRE_VIREMENT)
            .banqueSource(DEFAULT_BANQUE_SOURCE)
            .numeroCompteSource(DEFAULT_NUMERO_COMPTE_SOURCE)
            .banqueDestination(DEFAULT_BANQUE_DESTINATION)
            .numeroCompteDestination(DEFAULT_NUMERO_COMPTE_DESTINATION)
            .referenceFacture(DEFAULT_REFERENCE_FACTURE)
            .montantTotal(DEFAULT_MONTANT_TOTAL)
            .montantAccount(DEFAULT_MONTANT_ACCOUNT)
            .etat(DEFAULT_ETAT)
            .fileJoin(DEFAULT_FILE_JOIN);
        return paiement;
    }
    /**
     * Create an updated entity for this test.
     *
     * This is a static method, as tests for other entities might also need it,
     * if they test an entity which requires the current entity.
     */
    public static Paiement createUpdatedEntity(EntityManager em) {
        Paiement paiement = new Paiement()
            .numeroOrdreVirement(UPDATED_NUMERO_ORDRE_VIREMENT)
            .banqueSource(UPDATED_BANQUE_SOURCE)
            .numeroCompteSource(UPDATED_NUMERO_COMPTE_SOURCE)
            .banqueDestination(UPDATED_BANQUE_DESTINATION)
            .numeroCompteDestination(UPDATED_NUMERO_COMPTE_DESTINATION)
            .referenceFacture(UPDATED_REFERENCE_FACTURE)
            .montantTotal(UPDATED_MONTANT_TOTAL)
            .montantAccount(UPDATED_MONTANT_ACCOUNT)
            .etat(UPDATED_ETAT)
            .fileJoin(UPDATED_FILE_JOIN);
        return paiement;
    }

    @BeforeEach
    public void initTest() {
        paiement = createEntity(em);
    }

    @Test
    @Transactional
    public void createPaiement() throws Exception {
        int databaseSizeBeforeCreate = paiementRepository.findAll().size();

        // Create the Paiement
        restPaiementMockMvc.perform(post("/api/paiements")
            .contentType(TestUtil.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(paiement)))
            .andExpect(status().isCreated());

        // Validate the Paiement in the database
        List<Paiement> paiementList = paiementRepository.findAll();
        assertThat(paiementList).hasSize(databaseSizeBeforeCreate + 1);
        Paiement testPaiement = paiementList.get(paiementList.size() - 1);
        assertThat(testPaiement.getNumeroOrdreVirement()).isEqualTo(DEFAULT_NUMERO_ORDRE_VIREMENT);
        assertThat(testPaiement.getBanqueSource()).isEqualTo(DEFAULT_BANQUE_SOURCE);
        assertThat(testPaiement.getNumeroCompteSource()).isEqualTo(DEFAULT_NUMERO_COMPTE_SOURCE);
        assertThat(testPaiement.getBanqueDestination()).isEqualTo(DEFAULT_BANQUE_DESTINATION);
        assertThat(testPaiement.getNumeroCompteDestination()).isEqualTo(DEFAULT_NUMERO_COMPTE_DESTINATION);
        assertThat(testPaiement.getReferenceFacture()).isEqualTo(DEFAULT_REFERENCE_FACTURE);
        assertThat(testPaiement.getMontantTotal()).isEqualTo(DEFAULT_MONTANT_TOTAL);
        assertThat(testPaiement.getMontantAccount()).isEqualTo(DEFAULT_MONTANT_ACCOUNT);
        assertThat(testPaiement.getEtat()).isEqualTo(DEFAULT_ETAT);
        assertThat(testPaiement.getFileJoin()).isEqualTo(DEFAULT_FILE_JOIN);
    }

    @Test
    @Transactional
    public void createPaiementWithExistingId() throws Exception {
        int databaseSizeBeforeCreate = paiementRepository.findAll().size();

        // Create the Paiement with an existing ID
        paiement.setId(1L);

        // An entity with an existing ID cannot be created, so this API call must fail
        restPaiementMockMvc.perform(post("/api/paiements")
            .contentType(TestUtil.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(paiement)))
            .andExpect(status().isBadRequest());

        // Validate the Paiement in the database
        List<Paiement> paiementList = paiementRepository.findAll();
        assertThat(paiementList).hasSize(databaseSizeBeforeCreate);
    }


    @Test
    @Transactional
    public void getAllPaiements() throws Exception {
        // Initialize the database
        paiementRepository.saveAndFlush(paiement);

        // Get all the paiementList
        restPaiementMockMvc.perform(get("/api/paiements?sort=id,desc"))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.[*].id").value(hasItem(paiement.getId().intValue())))
            .andExpect(jsonPath("$.[*].numeroOrdreVirement").value(hasItem(DEFAULT_NUMERO_ORDRE_VIREMENT)))
            .andExpect(jsonPath("$.[*].banqueSource").value(hasItem(DEFAULT_BANQUE_SOURCE)))
            .andExpect(jsonPath("$.[*].numeroCompteSource").value(hasItem(DEFAULT_NUMERO_COMPTE_SOURCE)))
            .andExpect(jsonPath("$.[*].banqueDestination").value(hasItem(DEFAULT_BANQUE_DESTINATION)))
            .andExpect(jsonPath("$.[*].numeroCompteDestination").value(hasItem(DEFAULT_NUMERO_COMPTE_DESTINATION)))
            .andExpect(jsonPath("$.[*].referenceFacture").value(hasItem(DEFAULT_REFERENCE_FACTURE)))
            .andExpect(jsonPath("$.[*].montantTotal").value(hasItem(DEFAULT_MONTANT_TOTAL)))
            .andExpect(jsonPath("$.[*].montantAccount").value(hasItem(DEFAULT_MONTANT_ACCOUNT)))
            .andExpect(jsonPath("$.[*].etat").value(hasItem(DEFAULT_ETAT)))
            .andExpect(jsonPath("$.[*].fileJoin").value(hasItem(DEFAULT_FILE_JOIN.toString())));
    }

    @Test
    @Transactional
    public void getPaiement() throws Exception {
        // Initialize the database
        paiementRepository.saveAndFlush(paiement);

        // Get the paiement
        restPaiementMockMvc.perform(get("/api/paiements/{id}", paiement.getId()))
            .andExpect(status().isOk())
            .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
            .andExpect(jsonPath("$.id").value(paiement.getId().intValue()))
            .andExpect(jsonPath("$.numeroOrdreVirement").value(DEFAULT_NUMERO_ORDRE_VIREMENT))
            .andExpect(jsonPath("$.banqueSource").value(DEFAULT_BANQUE_SOURCE))
            .andExpect(jsonPath("$.numeroCompteSource").value(DEFAULT_NUMERO_COMPTE_SOURCE))
            .andExpect(jsonPath("$.banqueDestination").value(DEFAULT_BANQUE_DESTINATION))
            .andExpect(jsonPath("$.numeroCompteDestination").value(DEFAULT_NUMERO_COMPTE_DESTINATION))
            .andExpect(jsonPath("$.referenceFacture").value(DEFAULT_REFERENCE_FACTURE))
            .andExpect(jsonPath("$.montantTotal").value(DEFAULT_MONTANT_TOTAL))
            .andExpect(jsonPath("$.montantAccount").value(DEFAULT_MONTANT_ACCOUNT))
            .andExpect(jsonPath("$.etat").value(DEFAULT_ETAT))
            .andExpect(jsonPath("$.fileJoin").value(DEFAULT_FILE_JOIN.toString()));
    }

    @Test
    @Transactional
    public void getNonExistingPaiement() throws Exception {
        // Get the paiement
        restPaiementMockMvc.perform(get("/api/paiements/{id}", Long.MAX_VALUE))
            .andExpect(status().isNotFound());
    }

    @Test
    @Transactional
    public void updatePaiement() throws Exception {
        // Initialize the database
        paiementService.save(paiement);

        int databaseSizeBeforeUpdate = paiementRepository.findAll().size();

        // Update the paiement
        Paiement updatedPaiement = paiementRepository.findById(paiement.getId()).get();
        // Disconnect from session so that the updates on updatedPaiement are not directly saved in db
        em.detach(updatedPaiement);
        updatedPaiement
            .numeroOrdreVirement(UPDATED_NUMERO_ORDRE_VIREMENT)
            .banqueSource(UPDATED_BANQUE_SOURCE)
            .numeroCompteSource(UPDATED_NUMERO_COMPTE_SOURCE)
            .banqueDestination(UPDATED_BANQUE_DESTINATION)
            .numeroCompteDestination(UPDATED_NUMERO_COMPTE_DESTINATION)
            .referenceFacture(UPDATED_REFERENCE_FACTURE)
            .montantTotal(UPDATED_MONTANT_TOTAL)
            .montantAccount(UPDATED_MONTANT_ACCOUNT)
            .etat(UPDATED_ETAT)
            .fileJoin(UPDATED_FILE_JOIN);

        restPaiementMockMvc.perform(put("/api/paiements")
            .contentType(TestUtil.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(updatedPaiement)))
            .andExpect(status().isOk());

        // Validate the Paiement in the database
        List<Paiement> paiementList = paiementRepository.findAll();
        assertThat(paiementList).hasSize(databaseSizeBeforeUpdate);
        Paiement testPaiement = paiementList.get(paiementList.size() - 1);
        assertThat(testPaiement.getNumeroOrdreVirement()).isEqualTo(UPDATED_NUMERO_ORDRE_VIREMENT);
        assertThat(testPaiement.getBanqueSource()).isEqualTo(UPDATED_BANQUE_SOURCE);
        assertThat(testPaiement.getNumeroCompteSource()).isEqualTo(UPDATED_NUMERO_COMPTE_SOURCE);
        assertThat(testPaiement.getBanqueDestination()).isEqualTo(UPDATED_BANQUE_DESTINATION);
        assertThat(testPaiement.getNumeroCompteDestination()).isEqualTo(UPDATED_NUMERO_COMPTE_DESTINATION);
        assertThat(testPaiement.getReferenceFacture()).isEqualTo(UPDATED_REFERENCE_FACTURE);
        assertThat(testPaiement.getMontantTotal()).isEqualTo(UPDATED_MONTANT_TOTAL);
        assertThat(testPaiement.getMontantAccount()).isEqualTo(UPDATED_MONTANT_ACCOUNT);
        assertThat(testPaiement.getEtat()).isEqualTo(UPDATED_ETAT);
        assertThat(testPaiement.getFileJoin()).isEqualTo(UPDATED_FILE_JOIN);
    }

    @Test
    @Transactional
    public void updateNonExistingPaiement() throws Exception {
        int databaseSizeBeforeUpdate = paiementRepository.findAll().size();

        // Create the Paiement

        // If the entity doesn't have an ID, it will throw BadRequestAlertException
        restPaiementMockMvc.perform(put("/api/paiements")
            .contentType(TestUtil.APPLICATION_JSON)
            .content(TestUtil.convertObjectToJsonBytes(paiement)))
            .andExpect(status().isBadRequest());

        // Validate the Paiement in the database
        List<Paiement> paiementList = paiementRepository.findAll();
        assertThat(paiementList).hasSize(databaseSizeBeforeUpdate);
    }

    @Test
    @Transactional
    public void deletePaiement() throws Exception {
        // Initialize the database
        paiementService.save(paiement);

        int databaseSizeBeforeDelete = paiementRepository.findAll().size();

        // Delete the paiement
        restPaiementMockMvc.perform(delete("/api/paiements/{id}", paiement.getId())
            .accept(TestUtil.APPLICATION_JSON))
            .andExpect(status().isNoContent());

        // Validate the database contains one less item
        List<Paiement> paiementList = paiementRepository.findAll();
        assertThat(paiementList).hasSize(databaseSizeBeforeDelete - 1);
    }
}
