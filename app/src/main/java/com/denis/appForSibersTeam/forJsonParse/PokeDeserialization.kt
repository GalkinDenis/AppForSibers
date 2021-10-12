package com.denis.appForSibersTeam.forJsonParse


data class PokeDeserialization (
    val abilities: List<Ability>,
    val base_experience: Long,
    val forms: List<Species>,
    val game_indices: List<GameIndex>,
    val height: Long,
    val held_items: List<Any?>,
    val id: Long,
    val is_default: Boolean,
    val location_area_encounters: String,
    val moves: List<Move>,
    val name: String,
    val order: Long,
    val past_types: List<Any?>,
    val species: Species,
    val sprites: Sprites,
    val stats: List<Stat>,
    val types: List<Type>,
    val weight: Long
)

data class Ability (
    val ability: Species,
    val isHidden: Boolean,
    val slot: Long?
)

data class Species (
    val name: String,
    val url: String
)

data class GameIndex (
    val game_index: Long?,
    val version: Species
)

data class Move (
    val move: Species,
    val version_group_details: List<VersionGroupDetail>
)

data class VersionGroupDetail (
    val level_learnedAt: Long?,
    val move_learn_method: Species,
    val version_group: Species
)

data class GenerationV (
    val black_white: Sprites
)

data class GenerationIv (
    val diamond_pearl: Sprites,
    val heartgold_soulsilver: Sprites,
    val platinum: Sprites
)

data class Versions (
    val generationI: GenerationI,
    val generationIi: GenerationIi,
    val generationIii: GenerationIii,
    val generationIv: GenerationIv,
    val generationV: GenerationV,
    val generationVi: Map<String, GenerationVi>,
    val generationVii: GenerationVii,
    val generationViii: GenerationViii
)

data class Sprites (
    val back_default: String,
    val back_female: Any? = null,
    val back_shiny: String,
    val back_shiny_female: Any? = null,
    val front_default: String,
    val front_female: Any? = null,
    val front_shiny: String,
    val front_shiny_female: Any? = null,
    val other: Other? = null,
    val versions: Versions? = null,
    val animated: Sprites? = null
)

data class GenerationI (
    val red_blue: RedBlue,
    val yellow: RedBlue
)

data class RedBlue (
    val back_default: String,
    val back_gray: String,
    val front_default: String,
    val front_gray: String
)

data class GenerationIi (
    val crystal: Crystal,
    val gold: Crystal,
    val silver: Crystal
)

data class Crystal (
    val back_default: String,
    val back_shiny: String,
    val front_default: String,
    val front_shiny: String
)

data class GenerationIii (
    val emerald: Emerald,
    val firered_leafgreen: Crystal,
    val ruby_sapphire: Crystal
)

data class Emerald (
    val front_default: String,
    val front_shiny: String
)

data class GenerationVi (
    val front_default: String,
    val front_female: Any? = null,
    val front_shiny: String,
    val front_shin_fFemale: Any? = null
)

data class GenerationVii (
    val icons: DreamWorld,
    val ultra_sun_ultra_moon: GenerationVi
)

data class DreamWorld (
    val front_default: String,
    val front_female: Any? = null
)

data class GenerationViii (
    val icons: DreamWorld
)

data class Other (
    val dream_world: DreamWorld,
    val official_artwork: OfficialArtwork
)

data class OfficialArtwork (
    val front_default: String
)

data class Stat (
    val base_stat: Long,
    val effort: Long,
    val stat: Species
)

data class Type (
    val slot: Long,
    val type: Species
)
