.class public final Latc;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public a:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 1

    .prologue
    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 64
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Latc;->a:Ljava/util/Map;

    .line 65
    return-void
.end method

.method private c(ILjava/lang/String;)Late;
    .locals 2

    .prologue
    .line 90
    new-instance v0, Latd;

    invoke-direct {v0, p1, p2}, Latd;-><init>(ILjava/lang/String;)V

    .line 91
    iget-object v1, p0, Latc;->a:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Late;

    return-object v0
.end method


# virtual methods
.method public final a(ILjava/lang/String;)Ljava/util/List;
    .locals 1

    .prologue
    .line 95
    invoke-direct {p0, p1, p2}, Latc;->c(ILjava/lang/String;)Late;

    move-result-object v0

    .line 96
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 1053
    :cond_0
    iget-object v0, v0, Late;->a:Ljava/util/List;

    goto :goto_0
.end method

.method public final b(ILjava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 100
    invoke-direct {p0, p1, p2}, Latc;->c(ILjava/lang/String;)Late;

    move-result-object v0

    .line 101
    if-nez v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    return-object v0

    .line 2053
    :cond_0
    iget-object v0, v0, Late;->b:Ljava/lang/String;

    goto :goto_0
.end method
