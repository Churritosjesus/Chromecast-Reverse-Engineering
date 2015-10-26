.class public final Lbwf;
.super Ljava/lang/Object;


# instance fields
.field private final a:Ljava/util/Set;

.field private b:Ljava/lang/String;

.field private c:Ljava/lang/String;

.field private final d:Ljava/util/Map;

.field private final e:Landroid/content/Context;

.field private final f:Ljava/util/Map;

.field private g:I

.field private h:I

.field private i:Landroid/os/Looper;

.field private j:Lbwd;

.field private final k:Ljava/util/Set;

.field private final l:Ljava/util/Set;

.field private m:Lclu;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

    const/4 v1, -0x1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lbwf;->a:Ljava/util/Set;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbwf;->d:Ljava/util/Map;

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lbwf;->f:Ljava/util/Map;

    iput v1, p0, Lbwf;->g:I

    iput v1, p0, Lbwf;->h:I

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lbwf;->k:Ljava/util/Set;

    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lbwf;->l:Ljava/util/Set;

    new-instance v0, Lclu;

    invoke-direct {v0}, Lclu;-><init>()V

    iput-object v0, p0, Lbwf;->m:Lclu;

    iput-object p1, p0, Lbwf;->e:Landroid/content/Context;

    invoke-virtual {p1}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    iput-object v0, p0, Lbwf;->i:Landroid/os/Looper;

    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbwf;->b:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lbwf;->c:Ljava/lang/String;

    sget-object v0, Lclp;->a:Lbwd;

    iput-object v0, p0, Lbwf;->j:Lbwd;

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lbwg;Lbwh;)V
    .locals 1

    invoke-direct {p0, p1}, Lbwf;-><init>(Landroid/content/Context;)V

    const-string v0, "Must provide a connected listener"

    invoke-static {p2, v0}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbwf;->k:Ljava/util/Set;

    invoke-interface {v0, p2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    const-string v0, "Must provide a connection failed listener"

    invoke-static {p3, v0}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbwf;->l:Ljava/util/Set;

    invoke-interface {v0, p3}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-void
.end method


# virtual methods
.method public final a(Lbvz;)Lbwf;
    .locals 2

    .prologue
    .line 0
    iget-object v0, p0, Lbwf;->f:Ljava/util/Map;

    const/4 v1, 0x0

    invoke-interface {v0, p1, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbwf;->a:Ljava/util/Set;

    .line 1000
    iget-object v1, p1, Lbvz;->a:Ljava/util/ArrayList;

    .line 0
    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public final a(Lbvz;Lbwb;)Lbwf;
    .locals 2

    .prologue
    .line 0
    const-string v0, "Null options are not permitted for this Api"

    invoke-static {p2, v0}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbwf;->f:Ljava/util/Map;

    invoke-interface {v0, p1, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v0, p0, Lbwf;->a:Ljava/util/Set;

    .line 2000
    iget-object v1, p1, Lbvz;->a:Ljava/util/ArrayList;

    .line 0
    invoke-interface {v0, v1}, Ljava/util/Set;->addAll(Ljava/util/Collection;)Z

    return-object p0
.end method

.method public final a(Lbwg;)Lbwf;
    .locals 1

    iget-object v0, p0, Lbwf;->k:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final a(Lbwh;)Lbwf;
    .locals 1

    iget-object v0, p0, Lbwf;->l:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final a()Lbyl;
    .locals 9

    const/4 v1, 0x0

    new-instance v0, Lbyl;

    iget-object v2, p0, Lbwf;->a:Ljava/util/Set;

    iget-object v3, p0, Lbwf;->d:Ljava/util/Map;

    const/4 v4, 0x0

    iget-object v6, p0, Lbwf;->b:Ljava/lang/String;

    iget-object v7, p0, Lbwf;->c:Ljava/lang/String;

    iget-object v5, p0, Lbwf;->m:Lclu;

    invoke-virtual {v5}, Lclu;->a()Lclt;

    move-result-object v8

    move-object v5, v1

    invoke-direct/range {v0 .. v8}, Lbyl;-><init>(Landroid/accounts/Account;Ljava/util/Collection;Ljava/util/Map;ILandroid/view/View;Ljava/lang/String;Ljava/lang/String;Lclt;)V

    return-object v0
.end method

.method public final b()Lcom/google/android/gms/common/api/GoogleApiClient;
    .locals 14

    .prologue
    const/4 v11, 0x1

    const/4 v12, 0x0

    const/4 v9, -0x1

    const/4 v13, 0x0

    .line 0
    iget-object v0, p0, Lbwf;->f:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    move v0, v11

    :goto_0
    const-string v1, "must call addApi() to add at least one API"

    invoke-static {v0, v1}, La;->b(ZLjava/lang/Object;)V

    iget v0, p0, Lbwf;->g:I

    if-ltz v0, :cond_4

    .line 3000
    invoke-static {v13}, Lbxn;->a(Lm;)Lbxn;

    move-result-object v10

    new-instance v0, Lbwz;

    iget-object v1, p0, Lbwf;->e:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lbwf;->i:Landroid/os/Looper;

    invoke-virtual {p0}, Lbwf;->a()Lbyl;

    move-result-object v3

    iget-object v4, p0, Lbwf;->j:Lbwd;

    iget-object v5, p0, Lbwf;->f:Ljava/util/Map;

    iget-object v6, p0, Lbwf;->k:Ljava/util/Set;

    iget-object v7, p0, Lbwf;->l:Ljava/util/Set;

    iget v8, p0, Lbwf;->g:I

    invoke-direct/range {v0 .. v9}, Lbwz;-><init>(Landroid/content/Context;Landroid/os/Looper;Lbyl;Lbwd;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;II)V

    iget v1, p0, Lbwf;->g:I

    .line 4000
    const-string v2, "GoogleApiClient instance cannot be null"

    invoke-static {v0, v2}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v2, v10, Lbxn;->c:Landroid/util/SparseArray;

    invoke-virtual {v2, v1}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v2

    if-gez v2, :cond_3

    :goto_1
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Already managing a GoogleApiClient with id "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v11, v2}, La;->a(ZLjava/lang/Object;)V

    new-instance v2, Lbxo;

    invoke-direct {v2, v10, v1, v0, v13}, Lbxo;-><init>(Lbxn;ILcom/google/android/gms/common/api/GoogleApiClient;Lbwh;)V

    iget-object v3, v10, Lbxn;->c:Landroid/util/SparseArray;

    invoke-virtual {v3, v1, v2}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    iget-boolean v1, v10, Lbxn;->a:Z

    if-eqz v1, :cond_0

    iget-boolean v1, v10, Lbxn;->b:Z

    if-nez v1, :cond_0

    invoke-interface {v0}, Lcom/google/android/gms/common/api/GoogleApiClient;->b()V

    :cond_0
    move-object v1, v0

    .line 0
    :cond_1
    :goto_2
    return-object v1

    :cond_2
    move v0, v12

    goto :goto_0

    :cond_3
    move v11, v12

    .line 4000
    goto :goto_1

    .line 0
    :cond_4
    iget v0, p0, Lbwf;->h:I

    if-ltz v0, :cond_8

    .line 5000
    invoke-static {v13}, Lbxq;->a(Lm;)Lbxq;

    move-result-object v0

    iget v1, p0, Lbwf;->h:I

    .line 6612
    iget-object v2, v0, Lj;->y:Lm;

    .line 6000
    if-eqz v2, :cond_6

    invoke-virtual {v0, v1}, Lbxq;->b(I)Lbxr;

    move-result-object v1

    if-eqz v1, :cond_6

    iget-object v1, v1, Lbxr;->e:Lcom/google/android/gms/common/api/GoogleApiClient;

    .line 5000
    :goto_3
    if-nez v1, :cond_5

    new-instance v1, Lbwz;

    iget-object v2, p0, Lbwf;->e:Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    iget-object v3, p0, Lbwf;->i:Landroid/os/Looper;

    invoke-virtual {p0}, Lbwf;->a()Lbyl;

    move-result-object v4

    iget-object v5, p0, Lbwf;->j:Lbwd;

    iget-object v6, p0, Lbwf;->f:Ljava/util/Map;

    iget-object v7, p0, Lbwf;->k:Ljava/util/Set;

    iget-object v8, p0, Lbwf;->l:Ljava/util/Set;

    iget v10, p0, Lbwf;->h:I

    invoke-direct/range {v1 .. v10}, Lbwz;-><init>(Landroid/content/Context;Landroid/os/Looper;Lbyl;Lbwd;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;II)V

    :cond_5
    iget v2, p0, Lbwf;->h:I

    .line 7000
    const-string v3, "GoogleApiClient instance cannot be null"

    invoke-static {v1, v3}, La;->f(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v3, v0, Lbxq;->a:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->indexOfKey(I)I

    move-result v3

    if-gez v3, :cond_7

    :goto_4
    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Already managing a GoogleApiClient with id "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-static {v11, v3}, La;->a(ZLjava/lang/Object;)V

    new-instance v3, Lbxs;

    .line 8000
    invoke-direct {v3, v1, v13}, Lbxs;-><init>(Lcom/google/android/gms/common/api/GoogleApiClient;Lbwh;)V

    .line 7000
    iget-object v4, v0, Lbxq;->a:Landroid/util/SparseArray;

    invoke-virtual {v4, v2, v3}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 8612
    iget-object v3, v0, Lj;->y:Lm;

    .line 7000
    if-eqz v3, :cond_1

    .line 9177
    sput-boolean v12, Lar;->a:Z

    .line 7000
    invoke-virtual {v0}, Lbxq;->h()Lap;

    move-result-object v3

    invoke-virtual {v3, v2, v13, v0}, Lap;->a(ILandroid/os/Bundle;Laq;)Lbi;

    goto :goto_2

    :cond_6
    move-object v1, v13

    .line 6000
    goto :goto_3

    :cond_7
    move v11, v12

    .line 7000
    goto :goto_4

    .line 0
    :cond_8
    new-instance v1, Lbwz;

    iget-object v2, p0, Lbwf;->e:Landroid/content/Context;

    iget-object v3, p0, Lbwf;->i:Landroid/os/Looper;

    invoke-virtual {p0}, Lbwf;->a()Lbyl;

    move-result-object v4

    iget-object v5, p0, Lbwf;->j:Lbwd;

    iget-object v6, p0, Lbwf;->f:Ljava/util/Map;

    iget-object v7, p0, Lbwf;->k:Ljava/util/Set;

    iget-object v8, p0, Lbwf;->l:Ljava/util/Set;

    move v10, v9

    invoke-direct/range {v1 .. v10}, Lbwz;-><init>(Landroid/content/Context;Landroid/os/Looper;Lbyl;Lbwd;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;II)V

    goto/16 :goto_2
.end method
