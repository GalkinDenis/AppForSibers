package com.denis.appForSibersTeam.forJsonParse;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001By\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\u0002\u0010\u0010J\t\u0010!\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0000H\u00c6\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\t\u0010%\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\t\u0010\'\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\t\u0010)\u001a\u00020\u0003H\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fH\u00c6\u0003J\u0085\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0007\u001a\u00020\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\t\u001a\u00020\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0000H\u00c6\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010/\u001a\u000200H\u00d6\u0001J\t\u00101\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0000\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0001\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 \u00a8\u00062"}, d2 = {"Lcom/denis/appForSibersTeam/forJsonParse/Sprites;", "", "back_default", "", "back_female", "back_shiny", "back_shiny_female", "front_default", "front_female", "front_shiny", "front_shiny_female", "other", "Lcom/denis/appForSibersTeam/forJsonParse/Other;", "versions", "Lcom/denis/appForSibersTeam/forJsonParse/Versions;", "animated", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/Object;Lcom/denis/appForSibersTeam/forJsonParse/Other;Lcom/denis/appForSibersTeam/forJsonParse/Versions;Lcom/denis/appForSibersTeam/forJsonParse/Sprites;)V", "getAnimated", "()Lcom/denis/appForSibersTeam/forJsonParse/Sprites;", "getBack_default", "()Ljava/lang/String;", "getBack_female", "()Ljava/lang/Object;", "getBack_shiny", "getBack_shiny_female", "getFront_default", "getFront_female", "getFront_shiny", "getFront_shiny_female", "getOther", "()Lcom/denis/appForSibersTeam/forJsonParse/Other;", "getVersions", "()Lcom/denis/appForSibersTeam/forJsonParse/Versions;", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "hashCode", "", "toString", "app_release"})
public final class Sprites {
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String back_default = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object back_female = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String back_shiny = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object back_shiny_female = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String front_default = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object front_female = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String front_shiny = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Object front_shiny_female = null;
    @org.jetbrains.annotations.Nullable()
    private final com.denis.appForSibersTeam.forJsonParse.Other other = null;
    @org.jetbrains.annotations.Nullable()
    private final com.denis.appForSibersTeam.forJsonParse.Versions versions = null;
    @org.jetbrains.annotations.Nullable()
    private final com.denis.appForSibersTeam.forJsonParse.Sprites animated = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.denis.appForSibersTeam.forJsonParse.Sprites copy(@org.jetbrains.annotations.NotNull()
    java.lang.String back_default, @org.jetbrains.annotations.Nullable()
    java.lang.Object back_female, @org.jetbrains.annotations.NotNull()
    java.lang.String back_shiny, @org.jetbrains.annotations.Nullable()
    java.lang.Object back_shiny_female, @org.jetbrains.annotations.NotNull()
    java.lang.String front_default, @org.jetbrains.annotations.Nullable()
    java.lang.Object front_female, @org.jetbrains.annotations.NotNull()
    java.lang.String front_shiny, @org.jetbrains.annotations.Nullable()
    java.lang.Object front_shiny_female, @org.jetbrains.annotations.Nullable()
    com.denis.appForSibersTeam.forJsonParse.Other other, @org.jetbrains.annotations.Nullable()
    com.denis.appForSibersTeam.forJsonParse.Versions versions, @org.jetbrains.annotations.Nullable()
    com.denis.appForSibersTeam.forJsonParse.Sprites animated) {
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
    
    public Sprites(@org.jetbrains.annotations.NotNull()
    java.lang.String back_default, @org.jetbrains.annotations.Nullable()
    java.lang.Object back_female, @org.jetbrains.annotations.NotNull()
    java.lang.String back_shiny, @org.jetbrains.annotations.Nullable()
    java.lang.Object back_shiny_female, @org.jetbrains.annotations.NotNull()
    java.lang.String front_default, @org.jetbrains.annotations.Nullable()
    java.lang.Object front_female, @org.jetbrains.annotations.NotNull()
    java.lang.String front_shiny, @org.jetbrains.annotations.Nullable()
    java.lang.Object front_shiny_female, @org.jetbrains.annotations.Nullable()
    com.denis.appForSibersTeam.forJsonParse.Other other, @org.jetbrains.annotations.Nullable()
    com.denis.appForSibersTeam.forJsonParse.Versions versions, @org.jetbrains.annotations.Nullable()
    com.denis.appForSibersTeam.forJsonParse.Sprites animated) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBack_default() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBack_female() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBack_shiny() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getBack_shiny_female() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFront_default() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFront_female() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFront_shiny() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFront_shiny_female() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.denis.appForSibersTeam.forJsonParse.Other component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.denis.appForSibersTeam.forJsonParse.Other getOther() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.denis.appForSibersTeam.forJsonParse.Versions component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.denis.appForSibersTeam.forJsonParse.Versions getVersions() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.denis.appForSibersTeam.forJsonParse.Sprites component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.denis.appForSibersTeam.forJsonParse.Sprites getAnimated() {
        return null;
    }
}