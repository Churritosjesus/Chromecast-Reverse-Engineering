.class public final Lass;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public final a:Ljava/util/Map;

.field public final b:Lblp;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 17
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 21
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    iput-object v0, p0, Lass;->a:Ljava/util/Map;

    .line 24
    new-instance v0, Lblp;

    const-string v1, "CastConnectionManager"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lass;->b:Lblp;

    return-void
.end method


# virtual methods
.method public final a(Laow;)Laqj;
    .locals 2

    .prologue
    .line 49
    .line 1432
    iget-object v0, p1, Laow;->a:Ljava/lang/String;

    .line 49
    if-nez v0, :cond_0

    const/4 v0, 0x0

    .line 50
    :goto_0
    return-object v0

    :cond_0
    iget-object v0, p0, Lass;->a:Ljava/util/Map;

    .line 2432
    iget-object v1, p1, Laow;->a:Ljava/lang/String;

    .line 50
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Laqj;

    goto :goto_0
.end method

.method public final b(Laow;)V
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 54
    invoke-virtual {p0, p1}, Lass;->a(Laow;)Laqj;

    move-result-object v0

    .line 55
    if-eqz v0, :cond_0

    .line 56
    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-virtual {p1}, Laow;->g()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    .line 57
    invoke-virtual {v0}, Laqj;->g()V

    .line 58
    invoke-virtual {v0}, Laqj;->c()V

    .line 59
    iget-object v0, p0, Lass;->a:Ljava/util/Map;

    .line 3432
    iget-object v1, p1, Laow;->a:Ljava/lang/String;

    .line 59
    invoke-interface {v0, v1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    invoke-virtual {p1, v4, v4}, Laow;->b(Ljava/lang/String;Ljava/lang/String;)V

    .line 62
    :cond_0
    return-void
.end method
