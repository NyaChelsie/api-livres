package com.example.api_livres.modele;

import io.swagger.v3.oas.annotations.media.Schema;

public record Livre(
        @Schema(description = "Identifiant unique", example = "3") Long id,
        @Schema(description = "Titre du livre", example = "Le Petit Prince") String titre,
        @Schema(description = "Auteur du livre", example = "Antoine de Saint-Exupéry") String auteur) {
}