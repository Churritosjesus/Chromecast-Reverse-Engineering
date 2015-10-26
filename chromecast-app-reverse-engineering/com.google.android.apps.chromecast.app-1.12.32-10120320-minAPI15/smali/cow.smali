.class public Lcow;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/util/List;

.field final g:Lcox;

.field public final h:Lcou;


# direct methods
.method public constructor <init>(Lcox;Lcac;)V
    .locals 2

    .prologue
    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, La;->c(Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p1, p0, Lcow;->g:Lcox;

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lcow;->a:Ljava/util/List;

    new-instance v0, Lcou;

    invoke-direct {v0, p0, p2}, Lcou;-><init>(Lcow;Lcac;)V

    .line 1000
    const/4 v1, 0x1

    iput-boolean v1, v0, Lcou;->g:Z

    .line 0
    iput-object v0, p0, Lcow;->h:Lcou;

    return-void
.end method


# virtual methods
.method public a()Lcou;
    .locals 1

    iget-object v0, p0, Lcow;->h:Lcou;

    invoke-virtual {v0}, Lcou;->a()Lcou;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcow;->b(Lcou;)V

    return-object v0
.end method

.method public a(Lcou;)V
    .locals 0

    return-void
.end method

.method public final b(Lcou;)V
    .locals 2

    iget-object v0, p0, Lcow;->a:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    goto :goto_0

    :cond_0
    return-void
.end method
