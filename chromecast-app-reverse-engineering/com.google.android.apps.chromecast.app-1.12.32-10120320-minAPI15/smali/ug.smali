.class public final Lug;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Ltq;

.field public final b:Ljava/util/ArrayList;

.field c:Ltv;

.field private final d:Ltt;


# direct methods
.method constructor <init>(Ltq;)V
    .locals 1

    .prologue
    .line 1364
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1357
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lug;->b:Ljava/util/ArrayList;

    .line 1365
    iput-object p1, p0, Lug;->a:Ltq;

    .line 2113
    iget-object v0, p1, Ltq;->b:Ltt;

    .line 1366
    iput-object v0, p0, Lug;->d:Ltt;

    .line 1367
    return-void
.end method


# virtual methods
.method final a(Ljava/lang/String;)I
    .locals 3

    .prologue
    .line 1423
    iget-object v0, p0, Lug;->b:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v2

    .line 1424
    const/4 v1, 0x0

    :goto_0
    if-ge v1, v2, :cond_1

    .line 1425
    iget-object v0, p0, Lug;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Luh;

    .line 2765
    iget-object v0, v0, Luh;->a:Ljava/lang/String;

    .line 1425
    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v1

    .line 1429
    :goto_1
    return v0

    .line 1424
    :cond_0
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 1429
    :cond_1
    const/4 v0, -0x1

    goto :goto_1
.end method

.method public final a()Ljava/lang/String;
    .locals 1

    .prologue
    .line 1381
    iget-object v0, p0, Lug;->d:Ltt;

    .line 2277
    iget-object v0, v0, Ltt;->a:Landroid/content/ComponentName;

    invoke-virtual {v0}, Landroid/content/ComponentName;->getPackageName()Ljava/lang/String;

    move-result-object v0

    .line 1381
    return-object v0
.end method

.method public final b()Landroid/content/ComponentName;
    .locals 1

    .prologue
    .line 1388
    iget-object v0, p0, Lug;->d:Ltt;

    .line 2284
    iget-object v0, v0, Ltt;->a:Landroid/content/ComponentName;

    .line 1388
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1434
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MediaRouter.RouteProviderInfo{ packageName="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Lug;->a()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, " }"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
