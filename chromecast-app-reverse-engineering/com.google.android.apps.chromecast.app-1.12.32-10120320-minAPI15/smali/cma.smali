.class public final Lcma;
.super Ljava/lang/Object;


# instance fields
.field public final a:Ljava/util/List;

.field public b:Ljava/lang/String;

.field public c:I

.field private final d:Ljava/util/Map;


# direct methods
.method constructor <init>()V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcma;->a:Ljava/util/List;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lcma;->d:Ljava/util/Map;

    const-string v0, ""

    iput-object v0, p0, Lcma;->b:Ljava/lang/String;

    const/4 v0, 0x0

    iput v0, p0, Lcma;->c:I

    return-void
.end method


# virtual methods
.method public final a()Lclz;
    .locals 5

    .prologue
    .line 0
    new-instance v0, Lclz;

    iget-object v1, p0, Lcma;->a:Ljava/util/List;

    iget-object v2, p0, Lcma;->d:Ljava/util/Map;

    iget-object v3, p0, Lcma;->b:Ljava/lang/String;

    iget v4, p0, Lcma;->c:I

    .line 2000
    invoke-direct {v0, v1, v2, v3, v4}, Lclz;-><init>(Ljava/util/List;Ljava/util/Map;Ljava/lang/String;I)V

    .line 0
    return-object v0
.end method

.method public final a(Lclx;)Lcma;
    .locals 3

    .prologue
    .line 0
    .line 1000
    iget-object v0, p1, Lclx;->a:Ljava/util/Map;

    invoke-static {v0}, Ljava/util/Collections;->unmodifiableMap(Ljava/util/Map;)Ljava/util/Map;

    move-result-object v0

    .line 0
    sget-object v1, Lcit;->u:Lcit;

    invoke-virtual {v1}, Lcit;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcje;

    invoke-static {v0}, Lcyh;->a(Lcje;)Ljava/lang/String;

    move-result-object v1

    iget-object v0, p0, Lcma;->d:Ljava/util/Map;

    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    if-nez v0, :cond_0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iget-object v2, p0, Lcma;->d:Ljava/util/Map;

    invoke-interface {v2, v1, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method
