.class public final Laxq;
.super Lyz;
.source "PG"

# interfaces
.implements Lbct;


# instance fields
.field final b:Landroid/content/Context;

.field final c:Ljava/util/List;

.field public d:Landroid/support/v7/widget/RecyclerView;

.field public e:Lbcm;

.field final f:I

.field g:I

.field private final h:Lblp;

.field private final i:Z

.field private j:[Ldau;

.field private k:[I

.field private final l:Lyz;

.field private m:Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;


# direct methods
.method public constructor <init>(Landroid/content/Context;Z)V
    .locals 2

    .prologue
    .line 73
    invoke-direct {p0}, Lyz;-><init>()V

    .line 52
    new-instance v0, Lblp;

    const-string v1, "ShelfAdapter"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Laxq;->h:Lblp;

    .line 57
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Laxq;->c:Ljava/util/List;

    .line 59
    const/4 v0, 0x0

    iput-object v0, p0, Laxq;->d:Landroid/support/v7/widget/RecyclerView;

    .line 74
    iput-object p1, p0, Laxq;->b:Landroid/content/Context;

    .line 75
    iput-boolean p2, p0, Laxq;->i:Z

    .line 76
    check-cast p1, Landroid/app/Activity;

    invoke-static {p1}, Lblx;->a(Landroid/app/Activity;)I

    move-result v0

    iput v0, p0, Laxq;->f:I

    .line 77
    new-instance v0, Laxr;

    invoke-direct {v0, p0}, Laxr;-><init>(Laxq;)V

    iput-object v0, p0, Laxq;->l:Lyz;

    .line 129
    return-void
.end method

.method private b()Z
    .locals 1

    .prologue
    .line 222
    iget-object v0, p0, Laxq;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    if-lez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method


# virtual methods
.method public final a()I
    .locals 2

    .prologue
    .line 208
    const/4 v0, 0x0

    .line 209
    iget-object v1, p0, Laxq;->j:[Ldau;

    if-eqz v1, :cond_0

    .line 210
    iget-object v0, p0, Laxq;->j:[Ldau;

    array-length v0, v0

    add-int/lit8 v0, v0, 0x0

    .line 212
    :cond_0
    iget-boolean v1, p0, Laxq;->i:Z

    if-eqz v1, :cond_1

    .line 213
    add-int/lit8 v0, v0, 0x1

    .line 215
    :cond_1
    invoke-direct {p0}, Laxq;->b()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 216
    add-int/lit8 v0, v0, 0x1

    .line 218
    :cond_2
    return v0
.end method

.method public final a(I)I
    .locals 1

    .prologue
    .line 227
    invoke-direct {p0}, Laxq;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    if-nez p1, :cond_0

    .line 229
    const/4 v0, 0x5

    .line 246
    :goto_0
    return v0

    .line 231
    :cond_0
    iget-boolean v0, p0, Laxq;->i:Z

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Laxq;->a()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_1

    .line 232
    const/4 v0, 0x4

    goto :goto_0

    .line 235
    :cond_1
    invoke-direct {p0}, Laxq;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 236
    add-int/lit8 p1, p1, -0x1

    .line 238
    :cond_2
    iget-object v0, p0, Laxq;->j:[Ldau;

    if-eqz v0, :cond_7

    iget-object v0, p0, Laxq;->j:[Ldau;

    array-length v0, v0

    if-ge p1, v0, :cond_7

    .line 239
    iget-object v0, p0, Laxq;->j:[Ldau;

    aget-object v0, v0, p1

    iget-object v0, v0, Ldau;->a:Ldaq;

    if-eqz v0, :cond_3

    .line 240
    const/4 v0, 0x0

    goto :goto_0

    .line 241
    :cond_3
    iget-object v0, p0, Laxq;->j:[Ldau;

    aget-object v0, v0, p1

    iget-object v0, v0, Ldau;->c:Ldav;

    if-eqz v0, :cond_4

    .line 242
    const/4 v0, 0x1

    goto :goto_0

    .line 243
    :cond_4
    iget-object v0, p0, Laxq;->j:[Ldau;

    aget-object v0, v0, p1

    iget-object v0, v0, Ldau;->d:Ldbf;

    if-eqz v0, :cond_5

    .line 244
    const/4 v0, 0x2

    goto :goto_0

    .line 245
    :cond_5
    iget-object v0, p0, Laxq;->j:[Ldau;

    aget-object v0, v0, p1

    iget-object v0, v0, Ldau;->b:Ldbn;

    if-eqz v0, :cond_6

    .line 246
    const/4 v0, 0x3

    goto :goto_0

    .line 248
    :cond_6
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 251
    :cond_7
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0
.end method

.method public final a(Landroid/view/ViewGroup;I)Lzr;
    .locals 5

    .prologue
    const/4 v3, 0x0

    .line 301
    packed-switch p2, :pswitch_data_0

    .line 319
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V

    throw v0

    .line 303
    :pswitch_0
    new-instance v0, Lbau;

    iget-object v1, p0, Laxq;->b:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, La;->fq:I

    .line 304
    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lbau;-><init>(Landroid/view/View;)V

    .line 317
    :goto_0
    return-object v0

    .line 306
    :pswitch_1
    new-instance v0, Lbax;

    iget-object v1, p0, Laxq;->b:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, La;->fH:I

    .line 307
    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lbax;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 309
    :pswitch_2
    new-instance v0, Laxy;

    iget-object v1, p0, Laxq;->b:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, La;->fO:I

    .line 310
    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Laxy;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 312
    :pswitch_3
    new-instance v0, Lbbd;

    iget-object v1, p0, Laxq;->b:Landroid/content/Context;

    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, La;->gC:I

    .line 313
    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    invoke-direct {v0, v1}, Lbbd;-><init>(Landroid/view/View;)V

    goto :goto_0

    .line 315
    :pswitch_4
    new-instance v0, Laxw;

    .line 19363
    iget-object v1, p0, Laxq;->b:Landroid/content/Context;

    .line 19364
    invoke-static {v1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    sget v2, La;->fn:I

    invoke-virtual {v1, v2, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 19365
    new-instance v2, Laxv;

    invoke-direct {v2, p0}, Laxv;-><init>(Laxq;)V

    invoke-virtual {v1, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 315
    invoke-direct {v0, p0, v1}, Laxw;-><init>(Laxq;Landroid/view/View;)V

    goto :goto_0

    .line 20324
    :pswitch_5
    iget-object v0, p0, Laxq;->b:Landroid/content/Context;

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, La;->gq:I

    .line 20325
    invoke-virtual {v0, v1, p1, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;

    iput-object v0, p0, Laxq;->m:Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;

    .line 20326
    iget-object v0, p0, Laxq;->m:Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;

    iget-object v1, p0, Laxq;->l:Lyz;

    invoke-virtual {v0, v1}, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;->a(Lyz;)V

    .line 20328
    new-instance v0, Lxw;

    iget-object v1, p0, Laxq;->b:Landroid/content/Context;

    invoke-direct {v0, v1}, Lxw;-><init>(Landroid/content/Context;)V

    .line 20329
    invoke-virtual {v0, v3}, Lxw;->a(I)V

    .line 20330
    iget-object v1, p0, Laxq;->m:Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;

    invoke-virtual {v1, v0}, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;->a(Lzh;)V

    .line 20331
    iget-object v0, p0, Laxq;->b:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    .line 20332
    iget-object v0, p0, Laxq;->b:Landroid/content/Context;

    check-cast v0, Landroid/app/Activity;

    invoke-static {v0}, Lblx;->a(Landroid/app/Activity;)I

    move-result v0

    .line 20333
    sget v2, La;->dT:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 20334
    sget v3, La;->dS:I

    invoke-virtual {v1, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    .line 20335
    sget v4, La;->dR:I

    invoke-virtual {v1, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v1

    .line 20337
    mul-int/lit8 v4, v2, 0x2

    add-int/2addr v3, v4

    mul-int/lit8 v4, v2, 0x2

    add-int/2addr v1, v4

    .line 20338
    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 20337
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    iput v0, p0, Laxq;->g:I

    .line 20339
    iget-object v0, p0, Laxq;->m:Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;

    new-instance v1, Laxt;

    invoke-direct {v1, p0, v2}, Laxt;-><init>(Laxq;I)V

    invoke-virtual {v0, v1}, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;->a(Lzf;)V

    .line 20347
    iget-object v0, p0, Laxq;->m:Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;

    iget v1, p0, Laxq;->g:I

    .line 21042
    iput v1, v0, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;->s:I

    .line 20348
    iget-object v0, p0, Laxq;->m:Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v0

    check-cast v0, Lzi;

    .line 20349
    iget v1, p0, Laxq;->g:I

    int-to-float v1, v1

    const v2, 0x3edb6db7

    mul-float/2addr v1, v2

    float-to-int v1, v1

    iput v1, v0, Lzi;->height:I

    .line 20350
    iget-object v1, p0, Laxq;->m:Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;

    invoke-virtual {v1, v0}, Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 20351
    iget-object v0, p0, Laxq;->m:Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;

    new-instance v1, Laxu;

    invoke-direct {v1, p0}, Laxu;-><init>(Laxq;)V

    .line 21229
    iget-object v2, v0, Landroid/support/v7/widget/RecyclerView;->p:Ljava/util/List;

    if-nez v2, :cond_0

    .line 21230
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    iput-object v2, v0, Landroid/support/v7/widget/RecyclerView;->p:Ljava/util/List;

    .line 21232
    :cond_0
    iget-object v0, v0, Landroid/support/v7/widget/RecyclerView;->p:Ljava/util/List;

    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 20359
    new-instance v0, Laxw;

    iget-object v1, p0, Laxq;->m:Lcom/google/android/apps/chromecast/app/widget/SnappingRecyclerView;

    invoke-direct {v0, p0, v1}, Laxw;-><init>(Laxq;Landroid/view/View;)V

    goto/16 :goto_0

    .line 301
    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_1
        :pswitch_2
        :pswitch_3
        :pswitch_4
        :pswitch_5
    .end packed-switch
.end method

.method public final a(Lbcd;I)V
    .locals 5

    .prologue
    const v4, 0x7fffffff

    const/4 v0, 0x1

    const/4 v2, 0x0

    .line 185
    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    .line 186
    iget-object v0, p0, Laxq;->l:Lyz;

    invoke-virtual {v0}, Lyz;->a()I

    move-result v0

    .line 187
    iget-object v1, p0, Laxq;->c:Ljava/util/List;

    monitor-enter v1

    .line 188
    :try_start_0
    iget-object v2, p0, Laxq;->c:Ljava/util/List;

    invoke-interface {v2, p1}, Ljava/util/List;->indexOf(Ljava/lang/Object;)I

    move-result v2

    .line 189
    const/4 v3, -0x1

    if-eq v2, v3, :cond_0

    .line 190
    iget-object v3, p0, Laxq;->c:Ljava/util/List;

    invoke-interface {v3, v2}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 191
    iget-object v2, p0, Laxq;->c:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_1

    if-lez v0, :cond_1

    .line 193
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Laxq;->d(I)V

    .line 203
    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    .line 194
    :cond_1
    if-ne v0, v4, :cond_2

    iget-object v0, p0, Laxq;->l:Lyz;

    .line 195
    invoke-virtual {v0}, Lyz;->a()I

    move-result v0

    if-eq v0, v4, :cond_2

    .line 197
    iget-object v0, p0, Laxq;->l:Lyz;

    .line 10380
    iget-object v0, v0, Lyz;->a:Lza;

    invoke-virtual {v0}, Lza;->a()V

    goto :goto_0

    .line 203
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 199
    :cond_2
    const/4 v0, 0x1

    :try_start_1
    new-array v0, v0, [Ljava/lang/Object;

    const/4 v2, 0x0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v0, v2

    .line 200
    iget-object v0, p0, Laxq;->l:Lyz;

    invoke-virtual {v0, p2}, Lyz;->d(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method public final a(Ljava/util/List;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 156
    const/4 v0, 0x1

    new-array v0, v0, [Ljava/lang/Object;

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    aput-object v1, v0, v2

    .line 157
    iget-object v1, p0, Laxq;->c:Ljava/util/List;

    monitor-enter v1

    .line 158
    :try_start_0
    iget-object v0, p0, Laxq;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_1

    .line 160
    iget-object v0, p0, Laxq;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 162
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Laxq;->c(I)V

    .line 163
    iget-object v0, p0, Laxq;->l:Lyz;

    .line 7380
    iget-object v0, v0, Lyz;->a:Lza;

    invoke-virtual {v0}, Lza;->a()V

    .line 164
    iget-object v0, p0, Laxq;->d:Landroid/support/v7/widget/RecyclerView;

    if-eqz v0, :cond_0

    .line 165
    iget-object v0, p0, Laxq;->d:Landroid/support/v7/widget/RecyclerView;

    const/4 v2, 0x0

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/RecyclerView;->a(I)V

    .line 180
    :cond_0
    :goto_0
    monitor-exit v1

    return-void

    .line 167
    :cond_1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_2

    iget-object v0, p0, Laxq;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 170
    iget-object v0, p0, Laxq;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 171
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Laxq;->d(I)V

    .line 172
    iget-object v0, p0, Laxq;->l:Lyz;

    .line 8380
    iget-object v0, v0, Lyz;->a:Lza;

    invoke-virtual {v0}, Lza;->a()V

    goto :goto_0

    .line 180
    :catchall_0
    move-exception v0

    monitor-exit v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 173
    :cond_2
    :try_start_1
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Laxq;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    .line 175
    iget-object v0, p0, Laxq;->c:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->clear()V

    .line 176
    iget-object v0, p0, Laxq;->c:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 177
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Laxq;->b(I)V

    .line 178
    iget-object v0, p0, Laxq;->l:Lyz;

    .line 9380
    iget-object v0, v0, Lyz;->a:Lza;

    invoke-virtual {v0}, Lza;->a()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0
.end method

.method public final a(Lzr;I)V
    .locals 18

    .prologue
    .line 257
    invoke-direct/range {p0 .. p0}, Laxq;->b()Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v2, p2, -0x1

    move v8, v2

    .line 258
    :goto_0
    move-object/from16 v0, p0

    move/from16 v1, p2

    invoke-virtual {v0, v1}, Laxq;->a(I)I

    move-result v2

    packed-switch v2, :pswitch_data_0

    .line 295
    new-instance v2, Ljava/lang/IllegalStateException;

    invoke-direct {v2}, Ljava/lang/IllegalStateException;-><init>()V

    throw v2

    :cond_0
    move/from16 v8, p2

    .line 257
    goto :goto_0

    .line 260
    :pswitch_0
    check-cast p1, Lbau;

    move-object/from16 v0, p0

    iget-object v2, v0, Laxq;->j:[Ldau;

    aget-object v2, v2, v8

    iget-object v12, v2, Ldau;->a:Ldaq;

    .line 11050
    move-object/from16 v0, p1

    iget-object v2, v0, Lbau;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, La;->dL:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    .line 11052
    move-object/from16 v0, p1

    iget-object v2, v0, Lbau;->k:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->i()Latf;

    move-result-object v3

    .line 11197
    iget-object v3, v3, Latf;->m:Laer;

    .line 11052
    iget-object v4, v12, Ldaq;->a:Ldbj;

    iget-object v4, v4, Ldbj;->a:Ljava/lang/String;

    const/4 v5, 0x0

    move v7, v6

    invoke-virtual/range {v2 .. v7}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->a(Laer;Ljava/lang/String;ZII)V

    .line 11055
    move-object/from16 v0, p1

    iget-object v2, v0, Lbau;->a:Landroid/view/View;

    move-object/from16 v0, p1

    iget-object v3, v0, Lbau;->a:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lb;->z:I

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    iget-object v7, v12, Ldaq;->b:Ljava/lang/String;

    aput-object v7, v5, v6

    invoke-virtual {v3, v4, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 11057
    move-object/from16 v0, p1

    iget-object v2, v0, Lbau;->l:Landroid/widget/TextView;

    iget-object v3, v12, Ldaq;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 11058
    iget-object v2, v12, Ldaq;->d:Ljava/lang/Boolean;

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    if-ne v2, v3, :cond_1

    .line 11059
    move-object/from16 v0, p1

    iget-object v2, v0, Lbau;->n:Landroid/widget/TextView;

    const/4 v3, 0x2

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 11060
    move-object/from16 v0, p1

    iget-object v2, v0, Lbau;->m:Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 11065
    :goto_1
    iget-object v2, v12, Ldaq;->c:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 11066
    move-object/from16 v0, p1

    iget-object v2, v0, Lbau;->n:Landroid/widget/TextView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 11072
    :goto_2
    const/16 v2, 0x7d

    .line 11073
    invoke-static {v2}, Lapg;->a(I)Lapg;

    move-result-object v2

    iget-object v3, v12, Ldaq;->g:Ljava/lang/String;

    .line 12084
    iput-object v3, v2, Lapg;->b:Ljava/lang/String;

    .line 11075
    invoke-virtual {v2}, Lapg;->a()Lapd;

    move-result-object v2

    .line 11076
    move-object/from16 v0, p1

    iget-object v3, v0, Lbau;->o:Landroid/widget/TextView;

    iget-object v4, v12, Ldaq;->e:Ljava/lang/String;

    invoke-static {v3, v4}, Lblx;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 11077
    move-object/from16 v0, p1

    iget-object v3, v0, Lbau;->a:Landroid/view/View;

    new-instance v4, Lbav;

    move-object/from16 v0, p1

    invoke-direct {v4, v0, v12, v2}, Lbav;-><init>(Lbau;Ldaq;Lapd;)V

    invoke-virtual {v3, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11087
    move-object/from16 v0, p1

    iget-object v2, v0, Lbau;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    .line 11088
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 11089
    sget v4, La;->dJ:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v11

    .line 11090
    check-cast v2, Landroid/app/Activity;

    invoke-static {v2}, Lblx;->a(Landroid/app/Activity;)I

    move-result v2

    shl-int/lit8 v4, v11, 0x1

    sub-int/2addr v2, v4

    sget v4, La;->dV:I

    .line 11091
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    shl-int/lit8 v4, v4, 0x1

    sub-int v5, v2, v4

    .line 11094
    sget v2, La;->ec:I

    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    .line 11095
    const/4 v3, 0x0

    .line 11096
    const/4 v9, 0x0

    .line 11097
    iget-object v7, v12, Ldaq;->h:[Ldar;

    array-length v10, v7

    const/4 v2, 0x0

    move v4, v2

    :goto_3
    if-ge v4, v10, :cond_4

    aget-object v2, v7, v4

    .line 11098
    iget-object v13, v2, Ldar;->a:Ldbj;

    invoke-static {v13}, Lbau;->a(Ldbj;)Z

    move-result v13

    if-eqz v13, :cond_14

    .line 11100
    iget-object v13, v2, Ldar;->a:Ldbj;

    iget-object v13, v13, Ldbj;->b:Ljava/lang/Integer;

    invoke-virtual {v13}, Ljava/lang/Integer;->intValue()I

    move-result v13

    mul-int/2addr v13, v6

    iget-object v2, v2, Ldar;->a:Ldbj;

    iget-object v2, v2, Ldbj;->c:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    div-int/2addr v13, v2

    if-nez v9, :cond_3

    .line 11101
    const/4 v2, 0x0

    :goto_4
    add-int/2addr v13, v2

    .line 11104
    add-int v2, v3, v13

    if-gt v2, v5, :cond_4

    .line 11107
    add-int/lit8 v2, v9, 0x1

    .line 11108
    add-int/2addr v3, v13

    .line 11097
    :goto_5
    add-int/lit8 v4, v4, 0x1

    move v9, v2

    goto :goto_3

    .line 11062
    :cond_1
    move-object/from16 v0, p1

    iget-object v2, v0, Lbau;->n:Landroid/widget/TextView;

    const/4 v3, 0x3

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 11063
    move-object/from16 v0, p1

    iget-object v2, v0, Lbau;->m:Landroid/widget/TextView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_1

    .line 11068
    :cond_2
    move-object/from16 v0, p1

    iget-object v2, v0, Lbau;->n:Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 11069
    move-object/from16 v0, p1

    iget-object v2, v0, Lbau;->n:Landroid/widget/TextView;

    iget-object v3, v12, Ldaq;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto/16 :goto_2

    :cond_3
    move v2, v11

    .line 11101
    goto :goto_4

    .line 11115
    :cond_4
    if-nez v3, :cond_5

    iget-object v2, v12, Ldaq;->h:[Ldar;

    array-length v2, v2

    if-lez v2, :cond_5

    iget-object v2, v12, Ldaq;->h:[Ldar;

    const/4 v4, 0x0

    aget-object v2, v2, v4

    iget-object v2, v2, Ldar;->a:Ldbj;

    invoke-static {v2}, Lbau;->a(Ldbj;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 11116
    iget-object v2, v12, Ldaq;->h:[Ldar;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    .line 11117
    iget-object v3, v2, Ldar;->a:Ldbj;

    iget-object v3, v3, Ldbj;->b:Ljava/lang/Integer;

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    mul-int/2addr v3, v6

    iget-object v2, v2, Ldar;->a:Ldbj;

    iget-object v2, v2, Ldbj;->c:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    div-int/2addr v3, v2

    .line 11121
    :cond_5
    if-nez v3, :cond_7

    const/4 v7, 0x0

    .line 11123
    :goto_6
    if-nez v9, :cond_8

    .line 11124
    move-object/from16 v0, p1

    iget-object v2, v0, Lbau;->p:Landroid/widget/LinearLayout;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 262
    :cond_6
    const/16 v2, 0x7c

    invoke-static {v2}, Lapg;->a(I)Lapg;

    move-result-object v2

    .line 263
    invoke-virtual {v2, v8}, Lapg;->b(I)Lapg;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Laxq;->j:[Ldau;

    aget-object v3, v3, v8

    iget-object v3, v3, Ldau;->a:Ldaq;

    iget-object v3, v3, Ldaq;->g:Ljava/lang/String;

    .line 13084
    iput-object v3, v2, Lapg;->b:Ljava/lang/String;

    .line 265
    invoke-virtual {v2}, Lapg;->b()V

    .line 293
    :goto_7
    :pswitch_1
    return-void

    .line 11121
    :cond_7
    mul-int v2, v5, v6

    div-int v7, v2, v3

    goto :goto_6

    .line 11126
    :cond_8
    move-object/from16 v0, p1

    iget-object v2, v0, Lbau;->p:Landroid/widget/LinearLayout;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 11127
    move-object/from16 v0, p1

    iget-object v2, v0, Lbau;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v2}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 11128
    move-object/from16 v0, p1

    iget-object v2, v0, Lbau;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v13

    .line 11129
    const/4 v2, 0x0

    move v10, v2

    :goto_8
    if-ge v10, v9, :cond_6

    .line 11130
    sget v2, La;->fP:I

    const/4 v3, 0x0

    invoke-virtual {v13, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v14

    .line 11131
    if-eqz v10, :cond_9

    .line 11132
    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-virtual {v14, v11, v2, v3, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 11134
    :cond_9
    iget-object v15, v12, Ldaq;->g:Ljava/lang/String;

    iget-object v2, v12, Ldaq;->h:[Ldar;

    aget-object v16, v2, v10

    .line 12152
    sget v2, Lf;->al:I

    .line 12153
    invoke-virtual {v14, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    .line 12154
    invoke-virtual {v2}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, La;->ef:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    .line 12155
    move-object/from16 v0, v16

    iget-object v3, v0, Ldar;->b:Ljava/lang/String;

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_a

    .line 12156
    sget v3, Lf;->em:I

    invoke-virtual {v14, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 12157
    move-object/from16 v0, v16

    iget-object v5, v0, Ldar;->b:Ljava/lang/String;

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12158
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v17, 0x0

    move/from16 v0, v17

    invoke-virtual {v3, v5, v4, v6, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 12159
    move-object/from16 v0, v16

    iget-object v3, v0, Ldar;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 12162
    :cond_a
    sget v3, Lf;->ed:I

    invoke-virtual {v14, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 12163
    move-object/from16 v0, v16

    iget-object v5, v0, Ldar;->d:Ldbb;

    if-eqz v5, :cond_c

    move-object/from16 v0, v16

    iget-object v5, v0, Ldar;->d:Ldbb;

    iget-object v5, v5, Ldbb;->e:Ljava/lang/String;

    if-eqz v5, :cond_c

    .line 12164
    move-object/from16 v0, v16

    iget-object v5, v0, Ldar;->d:Ldbb;

    iget-object v5, v5, Ldbb;->e:Ljava/lang/String;

    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12165
    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v17, 0x0

    move/from16 v0, v17

    invoke-virtual {v3, v5, v4, v6, v0}, Landroid/widget/TextView;->setPadding(IIII)V

    .line 12166
    const/4 v4, 0x0

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setVisibility(I)V

    .line 12171
    :goto_9
    move-object/from16 v0, v16

    iget-object v3, v0, Ldar;->a:Ldbj;

    invoke-static {v3}, Lbau;->a(Ldbj;)Z

    move-result v3

    if-eqz v3, :cond_b

    .line 12172
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->i()Latf;

    move-result-object v3

    .line 12197
    iget-object v3, v3, Latf;->m:Laer;

    .line 12172
    move-object/from16 v0, v16

    iget-object v4, v0, Ldar;->a:Ldbj;

    iget-object v4, v4, Ldbj;->a:Ljava/lang/String;

    const/4 v5, 0x0

    move-object/from16 v0, v16

    iget-object v6, v0, Ldar;->a:Ldbj;

    iget-object v6, v6, Ldbj;->b:Ljava/lang/Integer;

    .line 12173
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    mul-int/2addr v6, v7

    move-object/from16 v0, v16

    iget-object v0, v0, Ldar;->a:Ldbj;

    move-object/from16 v17, v0

    move-object/from16 v0, v17

    iget-object v0, v0, Ldbj;->c:Ljava/lang/Integer;

    move-object/from16 v17, v0

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Integer;->intValue()I

    move-result v17

    div-int v6, v6, v17

    .line 12172
    invoke-virtual/range {v2 .. v7}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->a(Laer;Ljava/lang/String;ZII)V

    .line 12174
    new-instance v3, Lbaw;

    move-object/from16 v0, p1

    move-object/from16 v1, v16

    invoke-direct {v3, v0, v1, v15, v8}, Lbaw;-><init>(Lbau;Ldar;Ljava/lang/String;I)V

    invoke-virtual {v2, v3}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 11135
    :cond_b
    move-object/from16 v0, p1

    iget-object v2, v0, Lbau;->p:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v14}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 11129
    add-int/lit8 v2, v10, 0x1

    move v10, v2

    goto/16 :goto_8

    .line 12168
    :cond_c
    const/16 v4, 0x8

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_9

    .line 268
    :pswitch_2
    check-cast p1, Lbax;

    move-object/from16 v0, p0

    iget-object v2, v0, Laxq;->j:[Ldau;

    aget-object v2, v2, v8

    iget-object v10, v2, Ldau;->c:Ldav;

    .line 14043
    move-object/from16 v0, p1

    iget-object v2, v0, Lbax;->l:Landroid/widget/TextView;

    iget-object v3, v10, Ldav;->c:Ljava/lang/String;

    iget-object v4, v10, Ldav;->d:Ljava/lang/String;

    const/16 v5, 0x7f

    .line 14044
    invoke-static {v5}, Lapg;->a(I)Lapg;

    move-result-object v5

    .line 14045
    invoke-virtual {v5, v8}, Lapg;->b(I)Lapg;

    move-result-object v5

    .line 14046
    invoke-virtual {v5}, Lapg;->a()Lapd;

    move-result-object v5

    .line 14043
    invoke-static {v2, v3, v4, v5}, Lblx;->a(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Lapd;)V

    .line 14047
    move-object/from16 v0, p1

    iget-object v2, v0, Lbax;->a:Landroid/view/View;

    move-object/from16 v0, p1

    iget-object v3, v0, Lbax;->a:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lb;->A:I

    const/4 v5, 0x2

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    iget-object v7, v10, Ldav;->a:Ljava/lang/String;

    aput-object v7, v5, v6

    const/4 v6, 0x1

    iget-object v7, v10, Ldav;->b:Ljava/lang/String;

    aput-object v7, v5, v6

    invoke-virtual {v3, v4, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Landroid/view/View;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 14049
    move-object/from16 v0, p1

    iget-object v2, v0, Lbax;->m:Landroid/widget/TextView;

    iget-object v3, v10, Ldav;->a:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14050
    iget-object v2, v10, Ldav;->b:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_e

    .line 14051
    move-object/from16 v0, p1

    iget-object v2, v0, Lbax;->n:Landroid/widget/TextView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14057
    :goto_a
    move-object/from16 v0, p1

    iget-object v2, v0, Lbax;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 14058
    move-object/from16 v0, p1

    iget-object v2, v0, Lbax;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    check-cast v2, Landroid/app/Activity;

    invoke-static {v2}, Lblx;->a(Landroid/app/Activity;)I

    move-result v2

    sget v4, La;->dV:I

    .line 14059
    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    shl-int/lit8 v4, v4, 0x1

    sub-int/2addr v2, v4

    .line 14060
    sget v4, La;->dJ:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    .line 14061
    sget v5, La;->dL:I

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    .line 14062
    sget v6, La;->dM:I

    invoke-virtual {v3, v6}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    .line 14063
    iget-object v6, v10, Ldav;->e:[Ldaw;

    array-length v6, v6

    mul-int/lit8 v7, v4, 0x2

    add-int/2addr v5, v7

    div-int v5, v2, v5

    .line 14064
    invoke-static {v6, v5}, Ljava/lang/Math;->min(II)I

    move-result v11

    .line 14065
    div-int/2addr v2, v11

    mul-int/lit8 v4, v4, 0x2

    sub-int/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->min(II)I

    move-result v6

    .line 14067
    if-nez v11, :cond_f

    .line 14068
    move-object/from16 v0, p1

    iget-object v2, v0, Lbax;->k:Landroid/widget/LinearLayout;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 270
    :cond_d
    const/16 v2, 0x7c

    invoke-static {v2}, Lapg;->a(I)Lapg;

    move-result-object v2

    .line 271
    invoke-virtual {v2, v8}, Lapg;->b(I)Lapg;

    move-result-object v2

    .line 272
    invoke-virtual {v2}, Lapg;->b()V

    goto/16 :goto_7

    .line 14053
    :cond_e
    move-object/from16 v0, p1

    iget-object v2, v0, Lbax;->n:Landroid/widget/TextView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setVisibility(I)V

    .line 14054
    move-object/from16 v0, p1

    iget-object v2, v0, Lbax;->n:Landroid/widget/TextView;

    iget-object v3, v10, Ldav;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_a

    .line 14070
    :cond_f
    move-object/from16 v0, p1

    iget-object v2, v0, Lbax;->k:Landroid/widget/LinearLayout;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 14071
    move-object/from16 v0, p1

    iget-object v2, v0, Lbax;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v2}, Landroid/widget/LinearLayout;->removeAllViews()V

    .line 14072
    const/4 v2, 0x0

    move v9, v2

    :goto_b
    if-ge v9, v11, :cond_d

    .line 14073
    iget-object v2, v10, Ldav;->e:[Ldaw;

    aget-object v12, v2, v9

    .line 14080
    move-object/from16 v0, p1

    iget-object v2, v0, Lbax;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v2

    .line 14081
    sget v3, La;->ft:I

    const/4 v4, 0x0

    invoke-virtual {v2, v3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v13

    .line 14082
    sget v2, Lf;->o:I

    invoke-virtual {v13, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/TextView;

    .line 14083
    sget v3, Lf;->m:I

    invoke-virtual {v13, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/TextView;

    .line 14084
    sget v4, Lf;->bB:I

    invoke-virtual {v13, v4}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/TextView;

    .line 14086
    new-instance v5, Landroid/widget/LinearLayout$LayoutParams;

    const/4 v7, -0x2

    invoke-direct {v5, v6, v7}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V

    .line 14088
    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 14089
    invoke-virtual {v3, v5}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 14090
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 14092
    iget-object v5, v12, Ldaw;->b:Ljava/lang/String;

    invoke-virtual {v2, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14093
    iget-object v2, v12, Ldaw;->c:Ljava/lang/String;

    invoke-virtual {v3, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14094
    iget-object v2, v12, Ldaw;->d:Ljava/lang/String;

    invoke-static {v4, v2}, Lblx;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 14096
    const/16 v2, 0x7d

    .line 14097
    invoke-static {v2}, Lapg;->a(I)Lapg;

    move-result-object v2

    iget-object v3, v12, Ldaw;->f:Ljava/lang/String;

    .line 15084
    iput-object v3, v2, Lapg;->b:Ljava/lang/String;

    .line 14099
    invoke-virtual {v2, v8}, Lapg;->b(I)Lapg;

    move-result-object v2

    .line 14100
    invoke-virtual {v2}, Lapg;->a()Lapd;

    move-result-object v14

    .line 14101
    sget v2, Lf;->r:I

    invoke-virtual {v13, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    .line 14102
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->i()Latf;

    move-result-object v3

    .line 15197
    iget-object v3, v3, Latf;->m:Laer;

    .line 14102
    iget-object v4, v12, Ldaw;->a:Ldbj;

    iget-object v4, v4, Ldbj;->a:Ljava/lang/String;

    const/4 v5, 0x0

    move v7, v6

    invoke-virtual/range {v2 .. v7}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->a(Laer;Ljava/lang/String;ZII)V

    .line 14104
    new-instance v2, Lbay;

    move-object/from16 v0, p1

    invoke-direct {v2, v0, v12, v14}, Lbay;-><init>(Lbax;Ldaw;Lapd;)V

    invoke-virtual {v13, v2}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 14111
    move-object/from16 v0, p1

    iget-object v2, v0, Lbax;->k:Landroid/widget/LinearLayout;

    invoke-virtual {v2, v13}, Landroid/widget/LinearLayout;->addView(Landroid/view/View;)V

    .line 14072
    add-int/lit8 v2, v9, 0x1

    move v9, v2

    goto/16 :goto_b

    .line 275
    :pswitch_3
    check-cast p1, Laxy;

    move-object/from16 v0, p0

    iget-object v2, v0, Laxq;->j:[Ldau;

    aget-object v2, v2, v8

    iget-object v9, v2, Ldau;->d:Ldbf;

    move-object/from16 v0, p0

    iget-object v10, v0, Laxq;->k:[I

    .line 16074
    move-object/from16 v0, p1

    iget-object v2, v0, Laxy;->k:Landroid/widget/TextView;

    iget-object v3, v9, Ldbf;->b:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 16076
    const/16 v2, 0x76

    .line 16077
    invoke-static {v2}, Lapg;->a(I)Lapg;

    move-result-object v2

    iget-object v3, v9, Ldbf;->e:Ljava/lang/String;

    .line 17084
    iput-object v3, v2, Lapg;->b:Ljava/lang/String;

    .line 16079
    invoke-virtual {v2}, Lapg;->a()Lapd;

    move-result-object v11

    .line 16080
    iget-object v2, v9, Ldbf;->a:Ldbj;

    if-eqz v2, :cond_10

    .line 16081
    move-object/from16 v0, p1

    iget-object v2, v0, Laxy;->l:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    const/4 v3, 0x0

    invoke-virtual {v2, v3}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->setVisibility(I)V

    .line 16082
    move-object/from16 v0, p1

    iget-object v2, v0, Laxy;->l:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    invoke-virtual {v2}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, La;->dY:I

    .line 16083
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v7

    .line 16084
    move-object/from16 v0, p1

    iget-object v2, v0, Laxy;->l:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->i()Latf;

    move-result-object v3

    .line 17197
    iget-object v3, v3, Latf;->m:Laer;

    .line 16084
    iget-object v4, v9, Ldbf;->a:Ldbj;

    iget-object v4, v4, Ldbj;->a:Ljava/lang/String;

    const/4 v5, 0x1

    const/4 v6, 0x0

    invoke-virtual/range {v2 .. v7}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->a(Laer;Ljava/lang/String;ZII)V

    .line 16086
    move-object/from16 v0, p1

    iget-object v2, v0, Laxy;->l:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    new-instance v3, Laya;

    move-object/from16 v0, p1

    invoke-direct {v3, v0, v9, v11}, Laya;-><init>(Laxy;Ldbf;Lapd;)V

    invoke-virtual {v2, v3}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16093
    move-object/from16 v0, p1

    iget-object v2, v0, Laxy;->l:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    move-object/from16 v0, p1

    iget-object v3, v0, Laxy;->l:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    invoke-virtual {v3}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->getContext()Landroid/content/Context;

    move-result-object v3

    sget v4, Lb;->E:I

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v6, 0x0

    iget-object v7, v9, Ldbf;->d:Ljava/lang/String;

    aput-object v7, v5, v6

    invoke-virtual {v3, v4, v5}, Landroid/content/Context;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 16099
    :goto_c
    iget v2, v9, Ldbf;->f:I

    const/4 v3, 0x2

    if-ne v2, v3, :cond_11

    iget-object v2, v9, Ldbf;->c:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_11

    .line 16102
    move-object/from16 v0, p1

    iget-object v2, v0, Laxy;->n:Landroid/widget/Button;

    iget-object v3, v9, Ldbf;->c:Ljava/lang/String;

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V

    .line 16103
    move-object/from16 v0, p1

    iget-object v2, v0, Laxy;->n:Landroid/widget/Button;

    new-instance v3, Layb;

    move-object/from16 v0, p1

    invoke-direct {v3, v0}, Layb;-><init>(Laxy;)V

    invoke-virtual {v2, v3}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 16118
    :goto_d
    move-object/from16 v0, p1

    iget-object v2, v0, Laxy;->a:Landroid/view/View;

    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 16119
    sget v2, La;->dI:I

    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    .line 16120
    sget v2, La;->dH:I

    invoke-virtual {v3, v2}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    .line 16123
    move-object/from16 v0, p1

    iget-object v2, v0, Laxy;->m:Landroid/support/v7/widget/RecyclerView;

    .line 16124
    invoke-virtual {v2}, Landroid/support/v7/widget/RecyclerView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v2

    check-cast v2, Landroid/widget/RelativeLayout$LayoutParams;

    .line 16125
    iget v4, v9, Ldbf;->f:I

    packed-switch v4, :pswitch_data_1

    .line 16151
    sget v4, La;->dQ:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    .line 16152
    add-int v3, v4, v5

    .line 16153
    add-int v5, v3, v7

    iput v5, v2, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 16154
    move-object/from16 v0, p1

    iget-object v5, v0, Laxy;->m:Landroid/support/v7/widget/RecyclerView;

    move-object/from16 v0, p1

    iget-object v6, v0, Laxy;->o:Lxw;

    invoke-virtual {v5, v6}, Landroid/support/v7/widget/RecyclerView;->a(Lzh;)V

    .line 16157
    :goto_e
    move-object/from16 v0, p1

    iget-object v5, v0, Laxy;->m:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v5, v2}, Landroid/support/v7/widget/RecyclerView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 16158
    move-object/from16 v0, p1

    iget-object v2, v0, Laxy;->m:Landroid/support/v7/widget/RecyclerView;

    new-instance v5, Laxx;

    move-object/from16 v0, p1

    iget-object v6, v0, Laxy;->m:Landroid/support/v7/widget/RecyclerView;

    .line 16159
    invoke-virtual {v6}, Landroid/support/v7/widget/RecyclerView;->getContext()Landroid/content/Context;

    move-result-object v6

    sub-int/2addr v3, v7

    invoke-direct {v5, v6, v9, v4, v3}, Laxx;-><init>(Landroid/content/Context;Ldbf;II)V

    .line 16158
    invoke-virtual {v2, v5}, Landroid/support/v7/widget/RecyclerView;->a(Lyz;)V

    .line 16161
    if-eqz v10, :cond_12

    array-length v2, v10

    if-le v2, v8, :cond_12

    .line 16164
    new-instance v2, Landroid/os/Handler;

    invoke-direct {v2}, Landroid/os/Handler;-><init>()V

    new-instance v3, Layc;

    move-object/from16 v0, p1

    invoke-direct {v3, v0, v10, v8, v9}, Layc;-><init>(Laxy;[IILdbf;)V

    invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 280
    :goto_f
    const/16 v2, 0x74

    invoke-static {v2}, Lapg;->a(I)Lapg;

    move-result-object v2

    .line 281
    invoke-virtual {v2, v8}, Lapg;->b(I)Lapg;

    move-result-object v2

    move-object/from16 v0, p0

    iget-object v3, v0, Laxq;->j:[Ldau;

    aget-object v3, v3, v8

    iget-object v3, v3, Ldau;->d:Ldbf;

    iget-object v3, v3, Ldbf;->e:Ljava/lang/String;

    .line 18084
    iput-object v3, v2, Lapg;->b:Ljava/lang/String;

    .line 283
    invoke-virtual {v2}, Lapg;->b()V

    goto/16 :goto_7

    .line 16096
    :cond_10
    move-object/from16 v0, p1

    iget-object v2, v0, Laxy;->l:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->setVisibility(I)V

    goto/16 :goto_c

    .line 16114
    :cond_11
    move-object/from16 v0, p1

    iget-object v2, v0, Laxy;->n:Landroid/widget/Button;

    iget-object v3, v9, Ldbf;->c:Ljava/lang/String;

    iget-object v4, v9, Ldbf;->d:Ljava/lang/String;

    invoke-static {v2, v3, v4, v11}, Lblx;->a(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Lapd;)V

    goto/16 :goto_d

    .line 16127
    :pswitch_4
    sget v4, La;->dA:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v6

    .line 16128
    sget v4, La;->dz:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    .line 16129
    sget v5, La;->dB:I

    invoke-virtual {v3, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    .line 16130
    mul-int/lit8 v4, v4, 0x2

    add-int v11, v6, v4

    .line 16131
    add-int v5, v11, v3

    .line 16134
    move-object/from16 v0, p1

    iget-object v3, v0, Laxy;->a:Landroid/view/View;

    invoke-virtual {v3}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v4

    move-object v3, v4

    .line 16135
    check-cast v3, Landroid/app/Activity;

    invoke-static {v3}, Lblx;->a(Landroid/app/Activity;)I

    move-result v3

    div-int/2addr v3, v11

    .line 16138
    iget-object v11, v9, Ldbf;->g:[Ldbg;

    array-length v11, v11

    add-int/2addr v11, v3

    add-int/lit8 v11, v11, -0x1

    div-int/2addr v11, v3

    .line 16139
    new-instance v12, Lxq;

    invoke-direct {v12, v4, v3}, Lxq;-><init>(Landroid/content/Context;I)V

    .line 16140
    move-object/from16 v0, p1

    iget-object v3, v0, Laxy;->m:Landroid/support/v7/widget/RecyclerView;

    invoke-virtual {v3, v12}, Landroid/support/v7/widget/RecyclerView;->a(Lzh;)V

    .line 16141
    mul-int v3, v5, v11

    iput v3, v2, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    move v3, v5

    move v4, v6

    .line 16142
    goto/16 :goto_e

    .line 16144
    :pswitch_5
    sget v4, La;->dG:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    .line 16145
    add-int v3, v4, v5

    .line 16146
    add-int v5, v3, v7

    iput v5, v2, Landroid/widget/RelativeLayout$LayoutParams;->height:I

    .line 16147
    move-object/from16 v0, p1

    iget-object v5, v0, Laxy;->m:Landroid/support/v7/widget/RecyclerView;

    move-object/from16 v0, p1

    iget-object v6, v0, Laxy;->o:Lxw;

    invoke-virtual {v5, v6}, Landroid/support/v7/widget/RecyclerView;->a(Lzh;)V

    goto/16 :goto_e

    .line 16191
    :cond_12
    move-object/from16 v0, p1

    iget-object v2, v0, Laxy;->m:Landroid/support/v7/widget/RecyclerView;

    new-instance v3, Laye;

    move-object/from16 v0, p1

    invoke-direct {v3, v0, v8, v9}, Laye;-><init>(Laxy;ILdbf;)V

    .line 17216
    iput-object v3, v2, Landroid/support/v7/widget/RecyclerView;->o:Lzj;

    goto/16 :goto_f

    .line 286
    :pswitch_6
    check-cast p1, Lbbd;

    move-object/from16 v0, p0

    iget-object v2, v0, Laxq;->j:[Ldau;

    aget-object v2, v2, v8

    iget-object v2, v2, Ldau;->b:Ldbn;

    .line 19029
    move-object/from16 v0, p1

    iget-object v3, v0, Lbbd;->l:Landroid/widget/TextView;

    iget-object v4, v2, Ldbn;->b:Ljava/lang/String;

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 19030
    move-object/from16 v0, p1

    iget-object v3, v0, Lbbd;->m:Ljava/lang/String;

    iget-object v4, v2, Ldbn;->a:Ldbj;

    iget-object v4, v4, Ldbj;->a:Ljava/lang/String;

    invoke-static {v3, v4}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_13

    .line 19031
    iget-object v2, v2, Ldbn;->a:Ldbj;

    iget-object v2, v2, Ldbj;->a:Ljava/lang/String;

    move-object/from16 v0, p1

    iput-object v2, v0, Lbbd;->m:Ljava/lang/String;

    .line 19032
    invoke-static {}, Lcom/google/android/apps/chromecast/app/SetupApplication;->i()Latf;

    move-result-object v2

    move-object/from16 v0, p1

    iget-object v3, v0, Lbbd;->m:Ljava/lang/String;

    move-object/from16 v0, p1

    iget-object v4, v0, Lbbd;->k:Landroid/widget/ImageView;

    const/4 v5, 0x0

    invoke-virtual {v2, v3, v4, v5}, Latf;->a(Ljava/lang/String;Landroid/widget/ImageView;Z)Laex;

    .line 287
    :cond_13
    const/16 v2, 0x7c

    invoke-static {v2}, Lapg;->a(I)Lapg;

    move-result-object v2

    .line 288
    invoke-virtual {v2, v8}, Lapg;->b(I)Lapg;

    move-result-object v2

    .line 289
    invoke-virtual {v2}, Lapg;->b()V

    goto/16 :goto_7

    :cond_14
    move v2, v9

    goto/16 :goto_5

    .line 258
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
        :pswitch_2
        :pswitch_3
        :pswitch_6
        :pswitch_1
        :pswitch_1
    .end packed-switch

    .line 16125
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_5
        :pswitch_4
    .end packed-switch
.end method

.method public final a([Ldau;[I)V
    .locals 1

    .prologue
    .line 149
    iput-object p1, p0, Laxq;->j:[Ldau;

    .line 150
    iput-object p2, p0, Laxq;->k:[I

    .line 6380
    iget-object v0, p0, Lyz;->a:Lza;

    invoke-virtual {v0}, Lza;->a()V

    .line 152
    return-void
.end method
