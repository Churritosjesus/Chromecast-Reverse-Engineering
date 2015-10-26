.class public Lzr;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field public final a:Landroid/view/View;

.field public b:I

.field public c:I

.field d:J

.field public e:I

.field f:I

.field public g:Lzr;

.field public h:Lzr;

.field i:I

.field j:Lzl;

.field private k:I


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    const/4 v2, -0x1

    .line 8029
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7937
    iput v2, p0, Lzr;->b:I

    .line 7938
    iput v2, p0, Lzr;->c:I

    .line 7939
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lzr;->d:J

    .line 7940
    iput v2, p0, Lzr;->e:I

    .line 7941
    iput v2, p0, Lzr;->f:I

    .line 7944
    iput-object v3, p0, Lzr;->g:Lzr;

    .line 7946
    iput-object v3, p0, Lzr;->h:Lzr;

    .line 8017
    const/4 v0, 0x0

    iput v0, p0, Lzr;->k:I

    .line 8021
    iput-object v3, p0, Lzr;->j:Lzl;

    .line 8030
    if-nez p1, :cond_0

    .line 8031
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "itemView may not be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 8033
    :cond_0
    iput-object p1, p0, Lzr;->a:Landroid/view/View;

    .line 8034
    return-void
.end method

.method static synthetic a(Lzr;)Z
    .locals 1

    .prologue
    .line 7935
    .line 9319
    iget v0, p0, Lzr;->i:I

    and-int/lit8 v0, v0, 0x10

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    .line 7935
    goto :goto_0
.end method


# virtual methods
.method public final a()V
    .locals 1

    .prologue
    const/4 v0, -0x1

    .line 8059
    iput v0, p0, Lzr;->c:I

    .line 8060
    iput v0, p0, Lzr;->f:I

    .line 8061
    return-void
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 8238
    iget v0, p0, Lzr;->i:I

    or-int/2addr v0, p1

    iput v0, p0, Lzr;->i:I

    .line 8239
    return-void
.end method

.method final a(II)V
    .locals 2

    .prologue
    .line 8234
    iget v0, p0, Lzr;->i:I

    xor-int/lit8 v1, p2, -0x1

    and-int/2addr v0, v1

    and-int v1, p1, p2

    or-int/2addr v0, v1

    iput v0, p0, Lzr;->i:I

    .line 8235
    return-void
.end method

.method public final a(IZ)V
    .locals 2

    .prologue
    const/4 v1, -0x1

    .line 8043
    iget v0, p0, Lzr;->c:I

    if-ne v0, v1, :cond_0

    .line 8044
    iget v0, p0, Lzr;->b:I

    iput v0, p0, Lzr;->c:I

    .line 8046
    :cond_0
    iget v0, p0, Lzr;->f:I

    if-ne v0, v1, :cond_1

    .line 8047
    iget v0, p0, Lzr;->b:I

    iput v0, p0, Lzr;->f:I

    .line 8049
    :cond_1
    if-eqz p2, :cond_2

    .line 8050
    iget v0, p0, Lzr;->f:I

    add-int/2addr v0, p1

    iput v0, p0, Lzr;->f:I

    .line 8052
    :cond_2
    iget v0, p0, Lzr;->b:I

    add-int/2addr v0, p1

    iput v0, p0, Lzr;->b:I

    .line 8053
    iget-object v0, p0, Lzr;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 8054
    iget-object v0, p0, Lzr;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lzi;->e:Z

    .line 8056
    :cond_3
    return-void
.end method

.method public final a(Z)V
    .locals 3

    .prologue
    .line 8285
    if-eqz p1, :cond_1

    iget v0, p0, Lzr;->k:I

    add-int/lit8 v0, v0, -0x1

    :goto_0
    iput v0, p0, Lzr;->k:I

    .line 8286
    iget v0, p0, Lzr;->k:I

    if-gez v0, :cond_2

    .line 8287
    const/4 v0, 0x0

    iput v0, p0, Lzr;->k:I

    .line 8292
    const-string v0, "View"

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 8302
    :cond_0
    :goto_1
    return-void

    .line 8285
    :cond_1
    iget v0, p0, Lzr;->k:I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 8294
    :cond_2
    if-nez p1, :cond_3

    iget v0, p0, Lzr;->k:I

    const/4 v1, 0x1

    if-ne v0, v1, :cond_3

    .line 8295
    iget v0, p0, Lzr;->i:I

    or-int/lit8 v0, v0, 0x10

    iput v0, p0, Lzr;->i:I

    goto :goto_1

    .line 8296
    :cond_3
    if-eqz p1, :cond_0

    iget v0, p0, Lzr;->k:I

    if-nez v0, :cond_0

    .line 8297
    iget v0, p0, Lzr;->i:I

    and-int/lit8 v0, v0, -0x11

    iput v0, p0, Lzr;->i:I

    goto :goto_1
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 8070
    iget v0, p0, Lzr;->i:I

    and-int/lit16 v0, v0, 0x80

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final c()I
    .locals 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .prologue
    .line 8083
    iget v0, p0, Lzr;->f:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lzr;->b:I

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lzr;->f:I

    goto :goto_0
.end method

.method public final d()I
    .locals 2

    .prologue
    .line 8109
    iget v0, p0, Lzr;->f:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    iget v0, p0, Lzr;->b:I

    :goto_0
    return v0

    :cond_0
    iget v0, p0, Lzr;->f:I

    goto :goto_0
.end method

.method final e()Z
    .locals 1

    .prologue
    .line 8174
    iget-object v0, p0, Lzr;->j:Lzl;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final f()V
    .locals 1

    .prologue
    .line 8178
    iget-object v0, p0, Lzr;->j:Lzl;

    invoke-virtual {v0, p0}, Lzl;->b(Lzr;)V

    .line 8179
    return-void
.end method

.method final g()Z
    .locals 1

    .prologue
    .line 8182
    iget v0, p0, Lzr;->i:I

    and-int/lit8 v0, v0, 0x20

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final h()V
    .locals 1

    .prologue
    .line 8186
    iget v0, p0, Lzr;->i:I

    and-int/lit8 v0, v0, -0x21

    iput v0, p0, Lzr;->i:I

    .line 8187
    return-void
.end method

.method public final i()V
    .locals 1

    .prologue
    .line 8190
    iget v0, p0, Lzr;->i:I

    and-int/lit16 v0, v0, -0x101

    iput v0, p0, Lzr;->i:I

    .line 8191
    return-void
.end method

.method public final j()Z
    .locals 1

    .prologue
    .line 8202
    iget v0, p0, Lzr;->i:I

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final k()Z
    .locals 1

    .prologue
    .line 8206
    iget v0, p0, Lzr;->i:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final l()Z
    .locals 1

    .prologue
    .line 8210
    iget v0, p0, Lzr;->i:I

    and-int/lit8 v0, v0, 0x40

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final m()Z
    .locals 1

    .prologue
    .line 8214
    iget v0, p0, Lzr;->i:I

    and-int/lit8 v0, v0, 0x1

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final n()Z
    .locals 1

    .prologue
    .line 8218
    iget v0, p0, Lzr;->i:I

    and-int/lit8 v0, v0, 0x8

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final o()Z
    .locals 1

    .prologue
    .line 8226
    iget v0, p0, Lzr;->i:I

    and-int/lit16 v0, v0, 0x100

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method final p()V
    .locals 5

    .prologue
    const/4 v4, 0x0

    const/4 v3, 0x0

    const/4 v2, -0x1

    .line 8242
    iput v3, p0, Lzr;->i:I

    .line 8243
    iput v2, p0, Lzr;->b:I

    .line 8244
    iput v2, p0, Lzr;->c:I

    .line 8245
    const-wide/16 v0, -0x1

    iput-wide v0, p0, Lzr;->d:J

    .line 8246
    iput v2, p0, Lzr;->f:I

    .line 8247
    iput v3, p0, Lzr;->k:I

    .line 8248
    iput-object v4, p0, Lzr;->g:Lzr;

    .line 8249
    iput-object v4, p0, Lzr;->h:Lzr;

    .line 8250
    return-void
.end method

.method public final q()Z
    .locals 1

    .prologue
    .line 8310
    iget v0, p0, Lzr;->i:I

    and-int/lit8 v0, v0, 0x10

    if-nez v0, :cond_0

    iget-object v0, p0, Lzr;->a:Landroid/view/View;

    invoke-static {v0}, Lgt;->c(Landroid/view/View;)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .prologue
    .line 8254
    new-instance v1, Ljava/lang/StringBuilder;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "ViewHolder{"

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " position="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Lzr;->b:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, " id="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget-wide v2, p0, Lzr;->d:J

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", oldPos="

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Lzr;->c:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ", pLpos:"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    iget v2, p0, Lzr;->f:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8257
    invoke-virtual {p0}, Lzr;->e()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string v0, " scrap"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8258
    :cond_0
    invoke-virtual {p0}, Lzr;->j()Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, " invalid"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8259
    :cond_1
    invoke-virtual {p0}, Lzr;->m()Z

    move-result v0

    if-nez v0, :cond_2

    const-string v0, " unbound"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8260
    :cond_2
    invoke-virtual {p0}, Lzr;->k()Z

    move-result v0

    if-eqz v0, :cond_3

    const-string v0, " update"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8261
    :cond_3
    invoke-virtual {p0}, Lzr;->n()Z

    move-result v0

    if-eqz v0, :cond_4

    const-string v0, " removed"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8262
    :cond_4
    invoke-virtual {p0}, Lzr;->b()Z

    move-result v0

    if-eqz v0, :cond_5

    const-string v0, " ignored"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8263
    :cond_5
    invoke-virtual {p0}, Lzr;->l()Z

    move-result v0

    if-eqz v0, :cond_6

    const-string v0, " changed"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8264
    :cond_6
    invoke-virtual {p0}, Lzr;->o()Z

    move-result v0

    if-eqz v0, :cond_7

    const-string v0, " tmpDetached"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8265
    :cond_7
    invoke-virtual {p0}, Lzr;->q()Z

    move-result v0

    if-nez v0, :cond_8

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, " not recyclable("

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lzr;->k:I

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v2, ")"

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 9230
    :cond_8
    iget v0, p0, Lzr;->i:I

    and-int/lit16 v0, v0, 0x200

    if-nez v0, :cond_9

    invoke-virtual {p0}, Lzr;->j()Z

    move-result v0

    if-eqz v0, :cond_c

    :cond_9
    const/4 v0, 0x1

    .line 8266
    :goto_0
    if-eqz v0, :cond_a

    const-string v0, "undefined adapter position"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8268
    :cond_a
    iget-object v0, p0, Lzr;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    if-nez v0, :cond_b

    const-string v0, " no parent"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8269
    :cond_b
    const-string v0, "}"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 8270
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    .line 9230
    :cond_c
    const/4 v0, 0x0

    goto :goto_0
.end method
