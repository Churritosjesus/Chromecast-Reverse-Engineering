.class final Ljs;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Ljw;


# instance fields
.field private synthetic a:Ljn;


# direct methods
.method constructor <init>(Ljr;Ljn;)V
    .locals 0

    .prologue
    .line 89
    iput-object p2, p0, Ljs;->a:Ljn;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 112
    invoke-static {}, Ljn;->a()Ljd;

    .line 115
    const/4 v0, 0x0

    return-object v0
.end method

.method public final a(Ljava/lang/String;I)Ljava/util/List;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 99
    invoke-static {}, Ljn;->c()Ljava/util/List;

    .line 101
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 102
    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v3

    .line 103
    const/4 v0, 0x0

    move v1, v0

    :goto_0
    if-ge v1, v3, :cond_0

    .line 104
    invoke-interface {v4, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljd;

    .line 2660
    iget-object v0, v0, Ljd;->b:Ljava/lang/Object;

    .line 105
    invoke-interface {v2, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_0

    .line 107
    :cond_0
    return-object v2
.end method

.method public final a(IILandroid/os/Bundle;)Z
    .locals 1

    .prologue
    .line 93
    invoke-static {}, Ljn;->b()Z

    move-result v0

    return v0
.end method

.method public final b(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 123
    invoke-static {}, Ljn;->d()Ljd;

    .line 125
    const/4 v0, 0x0

    return-object v0
.end method
