.class public final Lto;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Landroid/os/Bundle;

.field private b:Ljava/util/ArrayList;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 268
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 269
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    iput-object v0, p0, Lto;->a:Landroid/os/Bundle;

    .line 1300
    iget-object v0, p0, Lto;->a:Landroid/os/Bundle;

    const-string v1, "id"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1312
    iget-object v0, p0, Lto;->a:Landroid/os/Bundle;

    const-string v1, "name"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 272
    return-void
.end method

.method public constructor <init>(Ltn;)V
    .locals 2

    .prologue
    .line 278
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 279
    if-nez p1, :cond_0

    .line 280
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "descriptor must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 283
    :cond_0
    new-instance v0, Landroid/os/Bundle;

    .line 2038
    iget-object v1, p1, Ltn;->a:Landroid/os/Bundle;

    .line 283
    invoke-direct {v0, v1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object v0, p0, Lto;->a:Landroid/os/Bundle;

    .line 3038
    invoke-virtual {p1}, Ltn;->i()V

    .line 4038
    iget-object v0, p1, Ltn;->b:Ljava/util/List;

    .line 286
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 287
    new-instance v0, Ljava/util/ArrayList;

    .line 5038
    iget-object v1, p1, Ltn;->b:Ljava/util/List;

    .line 287
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lto;->b:Ljava/util/ArrayList;

    .line 289
    :cond_1
    return-void
.end method


# virtual methods
.method public final a()Ltn;
    .locals 3

    .prologue
    .line 461
    iget-object v0, p0, Lto;->b:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    .line 462
    iget-object v0, p0, Lto;->a:Landroid/os/Bundle;

    const-string v1, "controlFilters"

    iget-object v2, p0, Lto;->b:Ljava/util/ArrayList;

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putParcelableArrayList(Ljava/lang/String;Ljava/util/ArrayList;)V

    .line 464
    :cond_0
    new-instance v0, Ltn;

    iget-object v1, p0, Lto;->a:Landroid/os/Bundle;

    iget-object v2, p0, Lto;->b:Ljava/util/ArrayList;

    .line 6038
    invoke-direct {v0, v1, v2}, Ltn;-><init>(Landroid/os/Bundle;Ljava/util/List;)V

    .line 464
    return-object v0
.end method

.method public final a(I)Lto;
    .locals 2

    .prologue
    .line 403
    iget-object v0, p0, Lto;->a:Landroid/os/Bundle;

    const-string v1, "playbackType"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 404
    return-object p0
.end method

.method public final a(Ljava/util/Collection;)Lto;
    .locals 3

    .prologue
    .line 387
    if-nez p1, :cond_0

    .line 388
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "filters must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 391
    :cond_0
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_4

    .line 392
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/IntentFilter;

    .line 5370
    if-nez v0, :cond_2

    .line 5371
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "filter must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 5374
    :cond_2
    iget-object v2, p0, Lto;->b:Ljava/util/ArrayList;

    if-nez v2, :cond_3

    .line 5375
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, p0, Lto;->b:Ljava/util/ArrayList;

    .line 5377
    :cond_3
    iget-object v2, p0, Lto;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 5378
    iget-object v2, p0, Lto;->b:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    .line 396
    :cond_4
    return-object p0
.end method

.method public final b(I)Lto;
    .locals 2

    .prologue
    .line 411
    iget-object v0, p0, Lto;->a:Landroid/os/Bundle;

    const-string v1, "playbackStream"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 412
    return-object p0
.end method

.method public final c(I)Lto;
    .locals 2

    .prologue
    .line 419
    iget-object v0, p0, Lto;->a:Landroid/os/Bundle;

    const-string v1, "volume"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 420
    return-object p0
.end method

.method public final d(I)Lto;
    .locals 2

    .prologue
    .line 427
    iget-object v0, p0, Lto;->a:Landroid/os/Bundle;

    const-string v1, "volumeMax"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 428
    return-object p0
.end method

.method public final e(I)Lto;
    .locals 2

    .prologue
    .line 435
    iget-object v0, p0, Lto;->a:Landroid/os/Bundle;

    const-string v1, "volumeHandling"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 436
    return-object p0
.end method

.method public final f(I)Lto;
    .locals 2

    .prologue
    .line 443
    iget-object v0, p0, Lto;->a:Landroid/os/Bundle;

    const-string v1, "presentationDisplayId"

    invoke-virtual {v0, v1, p1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 444
    return-object p0
.end method
