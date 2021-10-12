package com.denis.appForSibersTeam.forJsonParse;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u00c9\u0001\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u0012\u0006\u0010\r\u001a\u00020\u0006\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003\u0012\u0006\u0010\u0014\u001a\u00020\u0011\u0012\u0006\u0010\u0015\u001a\u00020\u0006\u0012\u000e\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u0012\u0006\u0010\u0017\u001a\u00020\b\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0003\u0012\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003\u0012\u0006\u0010\u001e\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\u001fJ\u000f\u00107\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003H\u00c6\u0003J\t\u00109\u001a\u00020\u0011H\u00c6\u0003J\t\u0010:\u001a\u00020\u0006H\u00c6\u0003J\u0011\u0010;\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\bH\u00c6\u0003J\t\u0010=\u001a\u00020\u0019H\u00c6\u0003J\u000f\u0010>\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0003H\u00c6\u0003J\u000f\u0010?\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0006H\u00c6\u0003J\t\u0010A\u001a\u00020\u0006H\u00c6\u0003J\u000f\u0010B\u001a\b\u0012\u0004\u0012\u00020\b0\u0003H\u00c6\u0003J\u000f\u0010C\u001a\b\u0012\u0004\u0012\u00020\n0\u0003H\u00c6\u0003J\t\u0010D\u001a\u00020\u0006H\u00c6\u0003J\u0011\u0010E\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003H\u00c6\u0003J\t\u0010F\u001a\u00020\u0006H\u00c6\u0003J\t\u0010G\u001a\u00020\u000fH\u00c6\u0003J\t\u0010H\u001a\u00020\u0011H\u00c6\u0003J\u00f1\u0001\u0010I\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\b\b\u0002\u0010\r\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u000e\b\u0002\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u00032\b\b\u0002\u0010\u0014\u001a\u00020\u00112\b\b\u0002\u0010\u0015\u001a\u00020\u00062\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00032\b\b\u0002\u0010\u0017\u001a\u00020\b2\b\b\u0002\u0010\u0018\u001a\u00020\u00192\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00032\u000e\b\u0002\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00032\b\b\u0002\u0010\u001e\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010J\u001a\u00020\u000f2\b\u0010K\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010L\u001a\u00020MH\u00d6\u0001J\t\u0010N\u001a\u00020\u0011H\u00d6\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010!R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010!R\u0011\u0010\u000b\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0019\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010!R\u0011\u0010\r\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010)R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010!R\u0011\u0010\u0014\u001a\u00020\u0011\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010+R\u0011\u0010\u0015\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0019\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010!R\u0011\u0010\u0017\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0011\u0010\u0018\u001a\u00020\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u00103R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001b0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010!R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010!R\u0011\u0010\u001e\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010#\u00a8\u0006O"}, d2 = {"Lcom/denis/appForSibersTeam/forJsonParse/PokeDeserialization;", "", "abilities", "", "Lcom/denis/appForSibersTeam/forJsonParse/Ability;", "base_experience", "", "forms", "Lcom/denis/appForSibersTeam/forJsonParse/Species;", "game_indices", "Lcom/denis/appForSibersTeam/forJsonParse/GameIndex;", "height", "held_items", "id", "is_default", "", "location_area_encounters", "", "moves", "Lcom/denis/appForSibersTeam/forJsonParse/Move;", "name", "order", "past_types", "species", "sprites", "Lcom/denis/appForSibersTeam/forJsonParse/Sprites;", "stats", "Lcom/denis/appForSibersTeam/forJsonParse/Stat;", "types", "Lcom/denis/appForSibersTeam/forJsonParse/Type;", "weight", "(Ljava/util/List;JLjava/util/List;Ljava/util/List;JLjava/util/List;JZLjava/lang/String;Ljava/util/List;Ljava/lang/String;JLjava/util/List;Lcom/denis/appForSibersTeam/forJsonParse/Species;Lcom/denis/appForSibersTeam/forJsonParse/Sprites;Ljava/util/List;Ljava/util/List;J)V", "getAbilities", "()Ljava/util/List;", "getBase_experience", "()J", "getForms", "getGame_indices", "getHeight", "getHeld_items", "getId", "()Z", "getLocation_area_encounters", "()Ljava/lang/String;", "getMoves", "getName", "getOrder", "getPast_types", "getSpecies", "()Lcom/denis/appForSibersTeam/forJsonParse/Species;", "getSprites", "()Lcom/denis/appForSibersTeam/forJsonParse/Sprites;", "getStats", "getTypes", "getWeight", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_release"})
public final class PokeDeserialization {
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denis.appForSibersTeam.forJsonParse.Ability> abilities = null;
    private final long base_experience = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denis.appForSibersTeam.forJsonParse.Species> forms = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denis.appForSibersTeam.forJsonParse.GameIndex> game_indices = null;
    private final long height = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> held_items = null;
    private final long id = 0L;
    private final boolean is_default = false;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String location_area_encounters = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denis.appForSibersTeam.forJsonParse.Move> moves = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String name = null;
    private final long order = 0L;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<java.lang.Object> past_types = null;
    @org.jetbrains.annotations.NotNull()
    private final com.denis.appForSibersTeam.forJsonParse.Species species = null;
    @org.jetbrains.annotations.NotNull()
    private final com.denis.appForSibersTeam.forJsonParse.Sprites sprites = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denis.appForSibersTeam.forJsonParse.Stat> stats = null;
    @org.jetbrains.annotations.NotNull()
    private final java.util.List<com.denis.appForSibersTeam.forJsonParse.Type> types = null;
    private final long weight = 0L;
    
    @org.jetbrains.annotations.NotNull()
    public final com.denis.appForSibersTeam.forJsonParse.PokeDeserialization copy(@org.jetbrains.annotations.NotNull()
    java.util.List<com.denis.appForSibersTeam.forJsonParse.Ability> abilities, long base_experience, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denis.appForSibersTeam.forJsonParse.Species> forms, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denis.appForSibersTeam.forJsonParse.GameIndex> game_indices, long height, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> held_items, long id, boolean is_default, @org.jetbrains.annotations.NotNull()
    java.lang.String location_area_encounters, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denis.appForSibersTeam.forJsonParse.Move> moves, @org.jetbrains.annotations.NotNull()
    java.lang.String name, long order, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> past_types, @org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.forJsonParse.Species species, @org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.forJsonParse.Sprites sprites, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denis.appForSibersTeam.forJsonParse.Stat> stats, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denis.appForSibersTeam.forJsonParse.Type> types, long weight) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public PokeDeserialization(@org.jetbrains.annotations.NotNull()
    java.util.List<com.denis.appForSibersTeam.forJsonParse.Ability> abilities, long base_experience, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denis.appForSibersTeam.forJsonParse.Species> forms, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denis.appForSibersTeam.forJsonParse.GameIndex> game_indices, long height, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> held_items, long id, boolean is_default, @org.jetbrains.annotations.NotNull()
    java.lang.String location_area_encounters, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denis.appForSibersTeam.forJsonParse.Move> moves, @org.jetbrains.annotations.NotNull()
    java.lang.String name, long order, @org.jetbrains.annotations.NotNull()
    java.util.List<? extends java.lang.Object> past_types, @org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.forJsonParse.Species species, @org.jetbrains.annotations.NotNull()
    com.denis.appForSibersTeam.forJsonParse.Sprites sprites, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denis.appForSibersTeam.forJsonParse.Stat> stats, @org.jetbrains.annotations.NotNull()
    java.util.List<com.denis.appForSibersTeam.forJsonParse.Type> types, long weight) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denis.appForSibersTeam.forJsonParse.Ability> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denis.appForSibersTeam.forJsonParse.Ability> getAbilities() {
        return null;
    }
    
    public final long component2() {
        return 0L;
    }
    
    public final long getBase_experience() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denis.appForSibersTeam.forJsonParse.Species> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denis.appForSibersTeam.forJsonParse.Species> getForms() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denis.appForSibersTeam.forJsonParse.GameIndex> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denis.appForSibersTeam.forJsonParse.GameIndex> getGame_indices() {
        return null;
    }
    
    public final long component5() {
        return 0L;
    }
    
    public final long getHeight() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getHeld_items() {
        return null;
    }
    
    public final long component7() {
        return 0L;
    }
    
    public final long getId() {
        return 0L;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean is_default() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLocation_area_encounters() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denis.appForSibersTeam.forJsonParse.Move> component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denis.appForSibersTeam.forJsonParse.Move> getMoves() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final long component12() {
        return 0L;
    }
    
    public final long getOrder() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<java.lang.Object> getPast_types() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denis.appForSibersTeam.forJsonParse.Species component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denis.appForSibersTeam.forJsonParse.Species getSpecies() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denis.appForSibersTeam.forJsonParse.Sprites component15() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.denis.appForSibersTeam.forJsonParse.Sprites getSprites() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denis.appForSibersTeam.forJsonParse.Stat> component16() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denis.appForSibersTeam.forJsonParse.Stat> getStats() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denis.appForSibersTeam.forJsonParse.Type> component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.denis.appForSibersTeam.forJsonParse.Type> getTypes() {
        return null;
    }
    
    public final long component18() {
        return 0L;
    }
    
    public final long getWeight() {
        return 0L;
    }
}