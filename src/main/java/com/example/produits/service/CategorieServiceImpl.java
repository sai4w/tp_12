package com.example.produits.service;

import java.util.List;

import com.example.produits.entities.Categorie;
import com.example.produits.repos.CategorieRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategorieServiceImpl implements CategorieService {
	@Autowired
	CategorieRepository categorieRepository;

	
	
	@Override
	public List<Categorie> getAllCategories() {
		return categorieRepository.findAll();
	}

}
