.class public final Lard;
.super Landroid/widget/BaseAdapter;
.source "PG"

# interfaces
.implements Lasq;


# instance fields
.field final a:Ljava/util/HashMap;

.field final b:Lash;

.field c:Larh;

.field d:Larg;

.field final e:Lasz;

.field f:Z

.field final g:Ljava/lang/String;

.field h:I

.field final i:Ljava/util/Set;

.field private j:Ljava/util/List;

.field private final k:I

.field private final l:I

.field private final m:Lblp;

.field private final n:Landroid/content/Context;

.field private o:Z

.field private final p:Ldcj;

.field private final q:I

.field private final r:Ljava/lang/Boolean;

.field private final s:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lash;Lasz;Ldcj;Ljava/lang/String;II)V
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 133
    invoke-direct {p0}, Landroid/widget/BaseAdapter;-><init>()V

    .line 93
    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iput-object v0, p0, Lard;->a:Ljava/util/HashMap;

    .line 104
    new-instance v0, Lblp;

    const-string v2, "PhotosAlbumAdapter"

    invoke-direct {v0, v2, v1}, Lblp;-><init>(Ljava/lang/String;Z)V

    iput-object v0, p0, Lard;->m:Lblp;

    .line 111
    iput-boolean v1, p0, Lard;->o:Z

    .line 127
    new-instance v0, Ljava/util/HashSet;

    invoke-direct {v0}, Ljava/util/HashSet;-><init>()V

    iput-object v0, p0, Lard;->i:Ljava/util/Set;

    .line 135
    const-string v0, "layout_inflater"

    .line 136
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    sget v2, La;->gx:I

    const/4 v3, 0x0

    .line 137
    invoke-virtual {v0, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 138
    iput p6, p0, Lard;->k:I

    .line 139
    mul-int/lit8 v2, p6, 0x6

    div-int/lit8 v2, v2, 0x10

    iput v2, p0, Lard;->l:I

    .line 140
    new-instance v2, Landroid/view/ViewGroup$LayoutParams;

    iget v3, p0, Lard;->k:I

    const/4 v4, -0x2

    invoke-direct {v2, v3, v4}, Landroid/view/ViewGroup$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v2}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 143
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v2

    .line 144
    invoke-static {v1, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v3

    .line 142
    invoke-virtual {v0, v2, v3}, Landroid/view/View;->measure(II)V

    .line 146
    iput p7, p0, Lard;->h:I

    .line 148
    iput-object p2, p0, Lard;->b:Lash;

    .line 149
    iput-object p1, p0, Lard;->n:Landroid/content/Context;

    .line 150
    iput-object p4, p0, Lard;->p:Ldcj;

    .line 154
    iget-object v0, p0, Lard;->p:Ldcj;

    iget-object v0, v0, Ldcj;->i:[Ldcj;

    aget-object v0, v0, v1

    iget-object v0, v0, Ldcj;->b:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iput v0, p0, Lard;->q:I

    .line 155
    iget-object v0, p0, Lard;->p:Ldcj;

    iget-object v0, v0, Ldcj;->i:[Ldcj;

    aget-object v0, v0, v1

    iget-object v0, v0, Ldcj;->j:Ljava/lang/String;

    iput-object v0, p0, Lard;->g:Ljava/lang/String;

    .line 156
    iget-object v0, p0, Lard;->p:Ldcj;

    iget-object v0, v0, Ldcj;->i:[Ldcj;

    aget-object v0, v0, v1

    iget-object v0, v0, Ldcj;->q:Ljava/lang/Boolean;

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    iput-object v0, p0, Lard;->r:Ljava/lang/Boolean;

    .line 158
    iput-object p5, p0, Lard;->s:Ljava/lang/String;

    .line 159
    iput-object p3, p0, Lard;->e:Lasz;

    .line 161
    iget-object v0, p0, Lard;->b:Lash;

    iget v1, p0, Lard;->q:I

    iget-object v2, p0, Lard;->s:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lash;->a(ILjava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lard;->j:Ljava/util/List;

    .line 162
    iget-object v0, p0, Lard;->j:Ljava/util/List;

    if-nez v0, :cond_0

    .line 163
    invoke-virtual {p0}, Lard;->a()V

    .line 165
    :cond_0
    iget-object v0, p0, Lard;->b:Lash;

    invoke-virtual {v0}, Lash;->s()Lauq;

    move-result-object v0

    iget-object v1, p0, Lard;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lauq;->b(Ljava/lang/String;)[Ldca;

    move-result-object v0

    invoke-direct {p0, v0}, Lard;->a([Ldca;)V

    .line 166
    return-void

    .line 157
    :cond_1
    iget-object v0, p0, Lard;->p:Ldcj;

    iget-object v0, v0, Ldcj;->i:[Ldcj;

    aget-object v0, v0, v1

    iget-object v0, v0, Ldcj;->q:Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    goto :goto_0
.end method

.method static synthetic a(Lard;)Larh;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lard;->c:Larh;

    return-object v0
.end method

.method private a([Ldca;)V
    .locals 6

    .prologue
    .line 448
    if-eqz p1, :cond_0

    .line 449
    array-length v1, p1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, v1, :cond_0

    aget-object v2, p1, v0

    .line 450
    iget-object v3, p0, Lard;->a:Ljava/util/HashMap;

    iget-object v4, v2, Ldca;->a:Ljava/lang/String;

    iget-object v5, v2, Ldca;->b:Ljava/lang/String;

    invoke-virtual {p0, v4, v5}, Lard;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 449
    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 453
    :cond_0
    return-void
.end method

.method static synthetic b(Lard;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 36
    iget-object v0, p0, Lard;->g:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 397
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 399
    iget-object v0, p0, Lard;->i:Ljava/util/Set;

    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 402
    :goto_0
    return-object p1

    :cond_0
    move-object p1, p2

    goto :goto_0
.end method

.method public final a()V
    .locals 8

    .prologue
    const/4 v4, 0x1

    .line 277
    iput-boolean v4, p0, Lard;->f:Z

    .line 278
    iget-object v0, p0, Lard;->b:Lash;

    const/16 v1, 0x64

    iget v2, p0, Lard;->k:I

    iget v3, p0, Lard;->l:I

    iget v5, p0, Lard;->q:I

    iget-object v6, p0, Lard;->s:Ljava/lang/String;

    iget v7, p0, Lard;->h:I

    invoke-virtual/range {v0 .. v7}, Lash;->a(IIIZILjava/lang/String;I)V

    .line 280
    iget-object v0, p0, Lard;->d:Larg;

    if-eqz v0, :cond_0

    .line 281
    iget-object v0, p0, Lard;->d:Larg;

    invoke-interface {v0}, Larg;->b()V

    .line 283
    :cond_0
    return-void
.end method

.method public final a_(I)V
    .locals 9

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 346
    const/4 v2, 0x3

    if-ne p1, v2, :cond_2

    .line 347
    iput-boolean v1, p0, Lard;->f:Z

    .line 348
    iput-boolean v1, p0, Lard;->o:Z

    .line 349
    iget-object v0, p0, Lard;->b:Lash;

    iget v1, p0, Lard;->q:I

    iget-object v2, p0, Lard;->s:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lash;->a(ILjava/lang/String;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lard;->j:Ljava/util/List;

    .line 350
    iget-object v0, p0, Lard;->j:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 351
    invoke-virtual {p0}, Lard;->notifyDataSetChanged()V

    .line 353
    :cond_0
    iget-object v0, p0, Lard;->d:Larg;

    if-eqz v0, :cond_1

    .line 354
    iget-object v0, p0, Lard;->d:Larg;

    invoke-interface {v0}, Larg;->c()V

    .line 371
    :cond_1
    :goto_0
    return-void

    .line 356
    :cond_2
    const/4 v2, 0x2

    if-ne p1, v2, :cond_1

    .line 357
    iget-object v3, p0, Lard;->a:Ljava/util/HashMap;

    monitor-enter v3

    .line 360
    :try_start_0
    iget-object v2, p0, Lard;->b:Lash;

    .line 361
    invoke-virtual {v2}, Lash;->s()Lauq;

    move-result-object v2

    iget-object v4, p0, Lard;->p:Ldcj;

    iget-object v4, v4, Ldcj;->j:Ljava/lang/String;

    invoke-virtual {v2, v4}, Lauq;->b(Ljava/lang/String;)[Ldca;

    move-result-object v4

    iget-object v5, p0, Lard;->a:Ljava/util/HashMap;

    .line 3376
    array-length v2, v4

    invoke-virtual {v5}, Ljava/util/HashMap;->size()I

    move-result v6

    if-ne v2, v6, :cond_3

    .line 3377
    array-length v6, v4

    move v2, v1

    :goto_1
    if-ge v2, v6, :cond_5

    aget-object v7, v4, v2

    .line 3378
    iget-object v8, v7, Ldca;->a:Ljava/lang/String;

    iget-object v7, v7, Ldca;->b:Ljava/lang/String;

    .line 3379
    invoke-virtual {p0, v8, v7}, Lard;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    .line 3378
    invoke-virtual {v5, v7}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    .line 360
    :cond_3
    :goto_2
    if-nez v0, :cond_6

    .line 363
    monitor-exit v3

    goto :goto_0

    .line 368
    :catchall_0
    move-exception v0

    monitor-exit v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0

    .line 3377
    :cond_4
    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_5
    move v0, v1

    .line 3386
    goto :goto_2

    .line 365
    :cond_6
    :try_start_1
    iget-object v0, p0, Lard;->a:Ljava/util/HashMap;

    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 366
    iget-object v0, p0, Lard;->i:Ljava/util/Set;

    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 367
    iget-object v0, p0, Lard;->b:Lash;

    invoke-virtual {v0}, Lash;->s()Lauq;

    move-result-object v0

    iget-object v1, p0, Lard;->g:Ljava/lang/String;

    invoke-virtual {v0, v1}, Lauq;->b(Ljava/lang/String;)[Ldca;

    move-result-object v0

    invoke-direct {p0, v0}, Lard;->a([Ldca;)V

    .line 368
    monitor-exit v3
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 369
    invoke-virtual {p0}, Lard;->notifyDataSetChanged()V

    goto :goto_0
.end method

.method public final areAllItemsEnabled()Z
    .locals 1

    .prologue
    .line 328
    .line 3286
    iget-boolean v0, p0, Lard;->f:Z

    .line 328
    if-eqz v0, :cond_0

    .line 329
    const/4 v0, 0x0

    .line 332
    :goto_0
    return v0

    :cond_0
    invoke-super {p0}, Landroid/widget/BaseAdapter;->areAllItemsEnabled()Z

    move-result v0

    goto :goto_0
.end method

.method public final b(I)Ldbq;
    .locals 1

    .prologue
    .line 301
    invoke-virtual {p0, p1}, Lard;->getItemViewType(I)I

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lard;->j:Ljava/util/List;

    if-eqz v0, :cond_0

    .line 302
    iget-object v0, p0, Lard;->j:Ljava/util/List;

    invoke-interface {v0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ldbq;

    .line 304
    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getCount()I
    .locals 2

    .prologue
    .line 291
    iget-object v0, p0, Lard;->j:Ljava/util/List;

    if-nez v0, :cond_1

    const/4 v0, 0x0

    .line 293
    :goto_0
    iget-boolean v1, p0, Lard;->o:Z

    if-eqz v1, :cond_0

    .line 294
    add-int/lit8 v0, v0, 0x1

    .line 296
    :cond_0
    return v0

    .line 291
    :cond_1
    iget-object v0, p0, Lard;->j:Ljava/util/List;

    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v0

    goto :goto_0
.end method

.method public final synthetic getItem(I)Ljava/lang/Object;
    .locals 1

    .prologue
    .line 36
    invoke-virtual {p0, p1}, Lard;->b(I)Ldbq;

    move-result-object v0

    return-object v0
.end method

.method public final getItemId(I)J
    .locals 2

    .prologue
    .line 309
    int-to-long v0, p1

    return-wide v0
.end method

.method public final getItemViewType(I)I
    .locals 1

    .prologue
    .line 319
    .line 2286
    iget-boolean v0, p0, Lard;->f:Z

    .line 319
    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lard;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    if-ne p1, v0, :cond_0

    .line 320
    const/4 v0, 0x1

    .line 322
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final getView(ILandroid/view/View;Landroid/view/ViewGroup;)Landroid/view/View;
    .locals 10

    .prologue
    const/4 v8, 0x1

    const/4 v4, 0x0

    .line 170
    .line 1286
    iget-boolean v0, p0, Lard;->f:Z

    .line 170
    if-nez v0, :cond_1

    iget-object v0, p0, Lard;->b:Lash;

    iget v1, p0, Lard;->q:I

    iget-object v2, p0, Lard;->s:Ljava/lang/String;

    .line 1410
    iget-object v3, v0, Lash;->a:Latc;

    invoke-virtual {v3, v1, v2}, Latc;->a(ILjava/lang/String;)Ljava/util/List;

    move-result-object v3

    if-eqz v3, :cond_0

    iget-object v0, v0, Lash;->a:Latc;

    .line 1411
    invoke-virtual {v0, v1, v2}, Latc;->b(ILjava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_3

    :cond_0
    move v0, v8

    .line 170
    :goto_0
    if-eqz v0, :cond_1

    .line 171
    invoke-virtual {p0}, Lard;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x14

    if-lt p1, v0, :cond_1

    .line 172
    iput-boolean v8, p0, Lard;->f:Z

    .line 174
    iget-object v0, p0, Lard;->b:Lash;

    const/16 v1, 0x64

    iget v2, p0, Lard;->k:I

    iget v3, p0, Lard;->l:I

    iget v5, p0, Lard;->q:I

    iget-object v6, p0, Lard;->s:Ljava/lang/String;

    iget v7, p0, Lard;->h:I

    invoke-virtual/range {v0 .. v7}, Lash;->a(IIIZILjava/lang/String;I)V

    .line 177
    iput-boolean v8, p0, Lard;->o:Z

    .line 178
    invoke-virtual {p0}, Lard;->notifyDataSetChanged()V

    .line 181
    :cond_1
    invoke-virtual {p0, p1}, Lard;->getItemViewType(I)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    .line 258
    :cond_2
    :goto_1
    return-object p2

    :cond_3
    move v0, v4

    .line 1411
    goto :goto_0

    .line 183
    :pswitch_0
    if-nez p2, :cond_2

    .line 184
    iget-object v0, p0, Lard;->n:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 186
    sget v1, La;->gv:I

    invoke-virtual {v0, v1, p3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    goto :goto_1

    .line 191
    :pswitch_1
    if-nez p2, :cond_6

    .line 192
    iget-object v0, p0, Lard;->n:Landroid/content/Context;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    .line 194
    sget v1, La;->gx:I

    invoke-virtual {v0, v1, p3, v4}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p2

    .line 195
    sget v0, Lf;->j:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 196
    invoke-virtual {v0}, Landroid/widget/ImageView;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    .line 197
    iget v2, p0, Lard;->k:I

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 198
    iget v2, p0, Lard;->l:I

    iput v2, v1, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 199
    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 200
    new-instance v0, Larf;

    invoke-direct {v0, p0, p2}, Larf;-><init>(Lard;Landroid/view/View;)V

    .line 201
    invoke-virtual {p2, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 206
    :goto_2
    invoke-virtual {p0, p1}, Lard;->b(I)Ldbq;

    move-result-object v2

    .line 207
    iget-object v1, p0, Lard;->i:Ljava/util/Set;

    iget-object v3, v2, Ldbq;->a:Ljava/lang/Long;

    .line 208
    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    .line 207
    invoke-interface {v1, v3}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 209
    iget-object v1, v0, Larf;->a:Landroid/widget/CheckBox;

    iget-object v3, p0, Lard;->a:Ljava/util/HashMap;

    iget-object v5, v2, Ldbq;->a:Ljava/lang/Long;

    .line 210
    invoke-static {v5}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v3, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    .line 209
    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    .line 218
    :goto_3
    iget-object v1, v0, Larf;->b:Landroid/widget/TextView;

    iget-object v3, v2, Ldbq;->b:Ljava/lang/String;

    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 219
    iget-object v1, v2, Ldbq;->d:Ljava/lang/Integer;

    if-nez v1, :cond_9

    move v1, v4

    .line 220
    :goto_4
    iget-object v3, v0, Larf;->c:Landroid/widget/TextView;

    iget-object v5, p0, Lard;->n:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v6, La;->he:I

    new-array v7, v8, [Ljava/lang/Object;

    .line 221
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v7, v4

    .line 220
    invoke-virtual {v5, v6, v1, v7}, Landroid/content/res/Resources;->getQuantityString(II[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 222
    iget-object v1, v0, Larf;->d:Landroid/widget/ImageView;

    .line 223
    const v3, 0x106000d

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 225
    new-array v3, v8, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lard;->b(I)Ldbq;

    move-result-object v5

    iget-object v5, v5, Ldbq;->a:Ljava/lang/Long;

    aput-object v5, v3, v4

    .line 226
    new-array v3, v8, [Ljava/lang/Object;

    invoke-virtual {p0, p1}, Lard;->b(I)Ldbq;

    move-result-object v5

    iget-object v5, v5, Ldbq;->e:Ljava/lang/String;

    aput-object v5, v3, v4

    .line 228
    iget-object v3, p0, Lard;->n:Landroid/content/Context;

    invoke-static {v3}, Lblf;->c(Landroid/content/Context;)Z

    move-result v3

    if-eqz v3, :cond_4

    iget-object v3, p0, Lard;->r:Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_4

    .line 229
    new-instance v3, Lare;

    invoke-direct {v3, p0, v2, p1}, Lare;-><init>(Lard;Ldbq;I)V

    invoke-virtual {v1, v3}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 245
    :cond_4
    iget-object v1, v2, Ldbq;->c:Ljava/lang/String;

    if-eqz v1, :cond_2

    .line 246
    iget v1, p0, Lard;->k:I

    iget v3, p0, Lard;->l:I

    iget-object v2, v2, Ldbq;->c:Ljava/lang/String;

    invoke-static {v1, v3, v2}, Lbks;->a(IILjava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 248
    iget-object v2, v0, Larf;->e:Laex;

    if-eqz v2, :cond_5

    .line 249
    iget-object v2, v0, Larf;->e:Laex;

    invoke-virtual {v2}, Laex;->a()V

    .line 251
    :cond_5
    iget-object v2, p0, Lard;->b:Lash;

    iget-object v3, v0, Larf;->d:Landroid/widget/ImageView;

    .line 1481
    iget-object v2, v2, Lash;->c:Latf;

    invoke-virtual {v2, v1, v3, v8}, Latf;->a(Ljava/lang/String;Landroid/widget/ImageView;Z)Laex;

    move-result-object v1

    .line 251
    iput-object v1, v0, Larf;->e:Laex;

    goto/16 :goto_1

    .line 203
    :cond_6
    invoke-virtual {p2}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Larf;

    goto/16 :goto_2

    .line 211
    :cond_7
    iget-object v1, v2, Ldbq;->e:Ljava/lang/String;

    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_8

    .line 212
    iget-object v1, v0, Larf;->a:Landroid/widget/CheckBox;

    iget-object v3, p0, Lard;->a:Ljava/util/HashMap;

    iget-object v5, v2, Ldbq;->e:Ljava/lang/String;

    .line 213
    invoke-virtual {v3, v5}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    .line 212
    invoke-virtual {v1, v3}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto/16 :goto_3

    .line 215
    :cond_8
    iget-object v1, v0, Larf;->a:Landroid/widget/CheckBox;

    invoke-virtual {v1, v4}, Landroid/widget/CheckBox;->setChecked(Z)V

    goto/16 :goto_3

    .line 219
    :cond_9
    iget-object v1, v2, Ldbq;->d:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto/16 :goto_4

    .line 181
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final getViewTypeCount()I
    .locals 1

    .prologue
    .line 314
    const/4 v0, 0x2

    return v0
.end method

.method public final isEnabled(I)Z
    .locals 2

    .prologue
    .line 337
    invoke-virtual {p0, p1}, Lard;->getItemViewType(I)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    .line 338
    const/4 v0, 0x0

    .line 341
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/BaseAdapter;->isEnabled(I)Z

    move-result v0

    goto :goto_0
.end method
