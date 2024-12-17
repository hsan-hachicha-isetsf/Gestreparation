package Gestion_De_Reparation.App.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import Gestion_De_Reparation.App.Repository.AppareilRepository;
import Gestion_De_Reparation.App.entities.Appareil;

@Service
@Transactional
public class AppareilService implements ImpAppareilService {
    private static final Logger logger = LoggerFactory.getLogger(AppareilService.class);

    @Autowired
    AppareilRepository repository;

    @Override
    public Appareil ajouterAppareil(Appareil A) {
        logger.info("Adding new Appareil: {}", A);
        return repository.save(A);
    }

    @Override
    public void SupprimerAppareil(long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Cannot delete. Appareil with ID " + id + " does not exist.");
        }
        logger.info("Deleting Appareil with ID: {}", id);
        repository.deleteById(id);
    }

    @Override
    public Appareil chercherAppareil(long id) {
		return repository.findById(id).orElse(null);}

    @Override
    public List<Appareil> listerAppareil() {
        logger.info("Listing all Appareils");
        return repository.findAll();
    }
}
