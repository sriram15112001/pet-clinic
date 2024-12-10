package com.deepak.pet_clinic.bootstrap;

import com.deepak.pet_clinic.model.Owner;
import com.deepak.pet_clinic.model.Pet;
import com.deepak.pet_clinic.model.PetType;
import com.deepak.pet_clinic.model.Vet;
import com.deepak.pet_clinic.service.OwnerService;
import com.deepak.pet_clinic.service.PetService;
import com.deepak.pet_clinic.service.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrap implements CommandLineRunner {

    private final OwnerService ownerService;
    private final PetService petService;
    private final VetService vetService;

    @Autowired
    public BootStrap(OwnerService ownerService, PetService petService, VetService vetService) {
        this.ownerService = ownerService;
        this.petService = petService;
        this.vetService = vetService;
    }

    @Override
    public void run(String... args) throws Exception {
        Owner owner1 = new Owner();
        owner1.setFirstName("Deepak");
        owner1.setLastName("Sriram");

        Owner owner2 = new Owner();
        owner2.setFirstName("Virat");
        owner2.setLastName("Kohli");

        ownerService.save(owner1);
        ownerService.save(owner2);

        System.out.println("Owner loaded");
        System.out.println("Owner size : " + ownerService.size());

        Vet vet1 = new Vet();
        vet1.setFirstName("damaal");
        vet1.setLastName("damaal");

        Vet vet2 = new Vet();
        vet2.setFirstName("dumeel");
        vet2.setLastName("dumeel");

        vetService.save(vet1);
        vetService.save(vet2);

        System.out.println("Vet loaded");
        System.out.println("Vet size : " + vetService.size());


    }
}
