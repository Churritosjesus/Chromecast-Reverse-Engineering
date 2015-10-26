.class public final Luh;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Ljava/lang/String;

.field final b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:Ljava/lang/String;

.field public e:Z

.field public f:Z

.field public g:Z

.field h:I

.field i:I

.field public j:I

.field public k:I

.field public l:I

.field public m:Landroid/os/Bundle;

.field public n:Landroid/content/IntentSender;

.field o:Ltn;

.field private final p:Lug;

.field private final q:Ljava/util/ArrayList;

.field private r:I


# direct methods
.method constructor <init>(Lug;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 835
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 774
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Luh;->q:Ljava/util/ArrayList;

    .line 781
    const/4 v0, -0x1

    iput v0, p0, Luh;->r:I

    .line 836
    iput-object p1, p0, Luh;->p:Lug;

    .line 837
    iput-object p2, p0, Luh;->a:Ljava/lang/String;

    .line 838
    iput-object p3, p0, Luh;->b:Ljava/lang/String;

    .line 839
    return-void
.end method


# virtual methods
.method final a(Ltn;)I
    .locals 4

    .prologue
    const/4 v1, 0x1

    .line 1272
    const/4 v0, 0x0

    .line 1273
    iget-object v2, p0, Luh;->o:Ltn;

    if-eq v2, p1, :cond_c

    .line 1274
    iput-object p1, p0, Luh;->o:Ltn;

    .line 1275
    if-eqz p1, :cond_c

    .line 1276
    iget-object v2, p0, Luh;->c:Ljava/lang/String;

    invoke-virtual {p1}, Ltn;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ltz;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1277
    invoke-virtual {p1}, Ltn;->b()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Luh;->c:Ljava/lang/String;

    move v0, v1

    .line 1280
    :cond_0
    iget-object v2, p0, Luh;->d:Ljava/lang/String;

    invoke-virtual {p1}, Ltn;->c()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3}, Ltz;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    .line 1281
    invoke-virtual {p1}, Ltn;->c()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Luh;->d:Ljava/lang/String;

    move v0, v1

    .line 1284
    :cond_1
    iget-boolean v2, p0, Luh;->e:Z

    invoke-virtual {p1}, Ltn;->d()Z

    move-result v3

    if-eq v2, v3, :cond_e

    .line 1285
    invoke-virtual {p1}, Ltn;->d()Z

    move-result v0

    iput-boolean v0, p0, Luh;->e:Z

    .line 1288
    :goto_0
    iget-boolean v0, p0, Luh;->f:Z

    invoke-virtual {p1}, Ltn;->e()Z

    move-result v2

    if-eq v0, v2, :cond_2

    .line 1289
    invoke-virtual {p1}, Ltn;->e()Z

    move-result v0

    iput-boolean v0, p0, Luh;->f:Z

    .line 1290
    or-int/lit8 v1, v1, 0x1

    .line 1292
    :cond_2
    iget-object v0, p0, Luh;->q:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ltn;->h()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    .line 1293
    iget-object v0, p0, Luh;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1294
    iget-object v0, p0, Luh;->q:Ljava/util/ArrayList;

    invoke-virtual {p1}, Ltn;->h()Ljava/util/List;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 1295
    or-int/lit8 v1, v1, 0x1

    .line 1297
    :cond_3
    iget v0, p0, Luh;->h:I

    invoke-virtual {p1}, Ltn;->j()I

    move-result v2

    if-eq v0, v2, :cond_4

    .line 1298
    invoke-virtual {p1}, Ltn;->j()I

    move-result v0

    iput v0, p0, Luh;->h:I

    .line 1299
    or-int/lit8 v1, v1, 0x1

    .line 1301
    :cond_4
    iget v0, p0, Luh;->i:I

    invoke-virtual {p1}, Ltn;->k()I

    move-result v2

    if-eq v0, v2, :cond_5

    .line 1302
    invoke-virtual {p1}, Ltn;->k()I

    move-result v0

    iput v0, p0, Luh;->i:I

    .line 1303
    or-int/lit8 v1, v1, 0x1

    .line 1305
    :cond_5
    iget v0, p0, Luh;->j:I

    invoke-virtual {p1}, Ltn;->n()I

    move-result v2

    if-eq v0, v2, :cond_6

    .line 1306
    invoke-virtual {p1}, Ltn;->n()I

    move-result v0

    iput v0, p0, Luh;->j:I

    .line 1307
    or-int/lit8 v1, v1, 0x3

    .line 1309
    :cond_6
    iget v0, p0, Luh;->k:I

    invoke-virtual {p1}, Ltn;->l()I

    move-result v2

    if-eq v0, v2, :cond_7

    .line 1310
    invoke-virtual {p1}, Ltn;->l()I

    move-result v0

    iput v0, p0, Luh;->k:I

    .line 1311
    or-int/lit8 v1, v1, 0x3

    .line 1313
    :cond_7
    iget v0, p0, Luh;->l:I

    invoke-virtual {p1}, Ltn;->m()I

    move-result v2

    if-eq v0, v2, :cond_8

    .line 1314
    invoke-virtual {p1}, Ltn;->m()I

    move-result v0

    iput v0, p0, Luh;->l:I

    .line 1315
    or-int/lit8 v1, v1, 0x3

    .line 1317
    :cond_8
    iget v0, p0, Luh;->r:I

    invoke-virtual {p1}, Ltn;->o()I

    move-result v2

    if-eq v0, v2, :cond_9

    .line 1318
    invoke-virtual {p1}, Ltn;->o()I

    move-result v0

    iput v0, p0, Luh;->r:I

    .line 1320
    or-int/lit8 v1, v1, 0x5

    .line 1322
    :cond_9
    iget-object v0, p0, Luh;->m:Landroid/os/Bundle;

    invoke-virtual {p1}, Ltn;->p()Landroid/os/Bundle;

    move-result-object v2

    invoke-static {v0, v2}, Ltz;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 1323
    invoke-virtual {p1}, Ltn;->p()Landroid/os/Bundle;

    move-result-object v0

    iput-object v0, p0, Luh;->m:Landroid/os/Bundle;

    .line 1324
    or-int/lit8 v1, v1, 0x1

    .line 1326
    :cond_a
    iget-object v0, p0, Luh;->n:Landroid/content/IntentSender;

    invoke-virtual {p1}, Ltn;->g()Landroid/content/IntentSender;

    move-result-object v2

    invoke-static {v0, v2}, Ltz;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    .line 1327
    invoke-virtual {p1}, Ltn;->g()Landroid/content/IntentSender;

    move-result-object v0

    iput-object v0, p0, Luh;->n:Landroid/content/IntentSender;

    .line 1328
    or-int/lit8 v1, v1, 0x1

    .line 1330
    :cond_b
    iget-boolean v0, p0, Luh;->g:Z

    invoke-virtual {p1}, Ltn;->f()Z

    move-result v2

    if-eq v0, v2, :cond_d

    .line 1331
    invoke-virtual {p1}, Ltn;->f()Z

    move-result v0

    iput-boolean v0, p0, Luh;->g:Z

    .line 1332
    or-int/lit8 v0, v1, 0x5

    .line 1336
    :cond_c
    :goto_1
    return v0

    :cond_d
    move v0, v1

    goto :goto_1

    :cond_e
    move v1, v0

    goto/16 :goto_0
.end method

.method public final a(I)V
    .locals 3

    .prologue
    .line 1167
    invoke-static {}, Ltz;->f()V

    .line 1168
    sget-object v0, Ltz;->a:Luc;

    iget v1, p0, Luh;->l:I

    const/4 v2, 0x0

    invoke-static {v2, p1}, Ljava/lang/Math;->max(II)I

    move-result v2

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 2712
    iget-object v2, v0, Luc;->g:Luh;

    if-ne p0, v2, :cond_0

    iget-object v2, v0, Luc;->h:Ltu;

    if-eqz v2, :cond_0

    .line 2713
    iget-object v0, v0, Luc;->h:Ltu;

    invoke-virtual {v0, v1}, Ltu;->b(I)V

    .line 1169
    :cond_0
    return-void
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 918
    invoke-static {}, Ltz;->f()V

    .line 919
    sget-object v0, Ltz;->a:Luc;

    invoke-virtual {v0}, Luc;->b()Luh;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Ljava/lang/String;)Z
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 988
    invoke-static {}, Ltz;->f()V

    .line 990
    iget-object v0, p0, Luh;->q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v3

    move v2, v1

    .line 991
    :goto_0
    if-ge v2, v3, :cond_1

    .line 992
    iget-object v0, p0, Luh;->q:Ljava/util/ArrayList;

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/IntentFilter;

    invoke-virtual {v0, p1}, Landroid/content/IntentFilter;->hasCategory(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 993
    const/4 v0, 0x1

    .line 996
    :goto_1
    return v0

    .line 991
    :cond_0
    add-int/lit8 v0, v2, 0x1

    move v2, v0

    goto :goto_0

    :cond_1
    move v0, v1

    .line 996
    goto :goto_1
.end method

.method public final a(Ltx;)Z
    .locals 2

    .prologue
    .line 959
    if-nez p1, :cond_0

    .line 960
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "selector must not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 962
    :cond_0
    invoke-static {}, Ltz;->f()V

    .line 963
    iget-object v0, p0, Luh;->q:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ltx;->a(Ljava/util/List;)Z

    move-result v0

    return v0
.end method

.method public final b(I)V
    .locals 2

    .prologue
    .line 1181
    invoke-static {}, Ltz;->f()V

    .line 1182
    if-eqz p1, :cond_0

    .line 1183
    sget-object v0, Ltz;->a:Luc;

    .line 2718
    iget-object v1, v0, Luc;->g:Luh;

    if-ne p0, v1, :cond_0

    iget-object v1, v0, Luc;->h:Ltu;

    if-eqz v1, :cond_0

    .line 2719
    iget-object v0, v0, Luc;->h:Ltu;

    invoke-virtual {v0, p1}, Ltu;->c(I)V

    .line 1185
    :cond_0
    return-void
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 930
    invoke-static {}, Ltz;->f()V

    .line 931
    sget-object v0, Ltz;->a:Luc;

    invoke-virtual {v0}, Luc;->a()Luh;

    move-result-object v0

    if-ne v0, p0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()V
    .locals 2

    .prologue
    .line 1247
    invoke-static {}, Ltz;->f()V

    .line 1248
    sget-object v0, Ltz;->a:Luc;

    .line 2754
    const/4 v1, 0x3

    invoke-virtual {v0, p0, v1}, Luc;->a(Luh;I)V

    .line 1249
    return-void
.end method

.method final d()Ltq;
    .locals 1

    .prologue
    .line 1344
    iget-object v0, p0, Luh;->p:Lug;

    .line 3373
    invoke-static {}, Ltz;->f()V

    .line 3374
    iget-object v0, v0, Lug;->a:Ltq;

    .line 1344
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .prologue
    .line 1253
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "MediaRouter.RouteInfo{ uniqueId="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Luh;->b:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Luh;->c:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", description="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Luh;->d:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", enabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Luh;->e:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", connecting="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Luh;->f:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", canDisconnect="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-boolean v1, p0, Luh;->g:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", playbackType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Luh;->h:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", playbackStream="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Luh;->i:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", volumeHandling="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Luh;->j:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", volume="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Luh;->k:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", volumeMax="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Luh;->l:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", presentationDisplayId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v1, p0, Luh;->r:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", extras="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Luh;->m:Landroid/os/Bundle;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", settingsIntent="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Luh;->n:Landroid/content/IntentSender;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", providerPackageName="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-object v1, p0, Luh;->p:Lug;

    invoke-virtual {v1}, Lug;->a()Ljava/lang/String;

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
