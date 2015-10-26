.class public final Lauq;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Lblp;

.field private b:Ljava/util/Map;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 30
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Lblp;

    const-string v1, "UserSettings"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lauq;->a:Lblp;

    .line 28
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lauq;->b:Ljava/util/Map;

    .line 30
    return-void
.end method

.method public constructor <init>(Ldck;)V
    .locals 2

    .prologue
    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 26
    new-instance v0, Lblp;

    const-string v1, "UserSettings"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lauq;->a:Lblp;

    .line 28
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lauq;->b:Ljava/util/Map;

    .line 33
    invoke-virtual {p0, p1}, Lauq;->a(Ldck;)V

    .line 34
    return-void
.end method


# virtual methods
.method public final a()Ldck;
    .locals 3

    .prologue
    .line 95
    iget-object v0, p0, Lauq;->b:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    new-array v0, v0, [Ldci;

    .line 96
    new-instance v1, Ldck;

    invoke-direct {v1}, Ldck;-><init>()V

    .line 98
    iget-object v2, p0, Lauq;->b:Ljava/util/Map;

    invoke-interface {v2}, Ljava/util/Map;->values()Ljava/util/Collection;

    move-result-object v2

    invoke-interface {v2, v0}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ldci;

    iput-object v0, v1, Ldck;->a:[Ldci;

    .line 99
    return-object v1
.end method

.method public final a(Ldck;)V
    .locals 6

    .prologue
    .line 40
    iget-object v1, p1, Ldck;->a:[Ldci;

    .line 41
    array-length v2, v1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v2, :cond_1

    aget-object v3, v1, v0

    .line 42
    if-eqz v3, :cond_0

    iget-object v4, v3, Ldci;->c:Ljava/lang/String;

    if-eqz v4, :cond_0

    .line 43
    iget-object v4, p0, Lauq;->b:Ljava/util/Map;

    iget-object v5, v3, Ldci;->c:Ljava/lang/String;

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 41
    :cond_0
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 46
    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/String;Z)V
    .locals 2

    .prologue
    .line 49
    invoke-virtual {p0, p1}, Lauq;->c(Ljava/lang/String;)Ldci;

    move-result-object v0

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v1

    iput-object v1, v0, Ldci;->a:Ljava/lang/Boolean;

    .line 50
    return-void
.end method

.method public final a(I)Z
    .locals 2

    .prologue
    .line 61
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lauq;->c(Ljava/lang/String;)Ldci;

    move-result-object v0

    iget-object v0, v0, Ldci;->a:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 2

    .prologue
    .line 57
    invoke-virtual {p0, p1}, Lauq;->c(Ljava/lang/String;)Ldci;

    move-result-object v0

    iget-object v0, v0, Ldci;->a:Ljava/lang/Boolean;

    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b(Ljava/lang/String;)[Ldca;
    .locals 1

    .prologue
    .line 77
    invoke-virtual {p0, p1}, Lauq;->c(Ljava/lang/String;)Ldci;

    move-result-object v0

    iget-object v0, v0, Ldci;->b:[Ldca;

    return-object v0
.end method

.method public c(Ljava/lang/String;)Ldci;
    .locals 3

    .prologue
    .line 85
    iget-object v0, p0, Lauq;->b:Ljava/util/Map;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldci;

    .line 86
    if-nez v0, :cond_0

    .line 87
    new-instance v0, Ldci;

    invoke-direct {v0}, Ldci;-><init>()V

    .line 88
    iput-object p1, v0, Ldci;->c:Ljava/lang/String;

    .line 89
    iget-object v1, p0, Lauq;->b:Ljava/util/Map;

    iget-object v2, v0, Ldci;->c:Ljava/lang/String;

    invoke-interface {v1, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 91
    :cond_0
    return-object v0
.end method
