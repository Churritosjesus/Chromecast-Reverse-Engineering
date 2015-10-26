.class public final Lbvz;
.super Ljava/lang/Object;


# instance fields
.field final a:Ljava/util/ArrayList;

.field private final b:Lbwd;

.field private final c:Ls;

.field private final d:Lbwe;

.field private final e:La;


# direct methods
.method public varargs constructor <init>(Ljava/lang/String;Lbwd;Lbwe;[Lcom/google/android/gms/common/api/Scope;)V
    .locals 2

    const/4 v1, 0x0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "Cannot construct an Api with a null ClientBuilder"

    invoke-static {p2, v0}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v0, "Cannot construct an Api with a null ClientKey"

    invoke-static {p3, v0}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iput-object p2, p0, Lbvz;->b:Lbwd;

    iput-object v1, p0, Lbvz;->c:Ls;

    iput-object p3, p0, Lbvz;->d:Lbwe;

    iput-object v1, p0, Lbvz;->e:La;

    new-instance v0, Ljava/util/ArrayList;

    invoke-static {p4}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lbvz;->a:Ljava/util/ArrayList;

    return-void
.end method


# virtual methods
.method public final a()Lbwd;
    .locals 2

    iget-object v0, p0, Lbvz;->b:Lbwd;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "This API was constructed with a SimpleClientBuilder. Use getSimpleClientBuilder"

    invoke-static {v0, v1}, La;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lbvz;->b:Lbwd;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final b()Lbwe;
    .locals 2

    iget-object v0, p0, Lbvz;->d:Lbwe;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    const-string v1, "This API was constructed with a SimpleClientKey. Use getSimpleClientKey"

    invoke-static {v0, v1}, La;->a(ZLjava/lang/Object;)V

    iget-object v0, p0, Lbvz;->d:Lbwe;

    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
