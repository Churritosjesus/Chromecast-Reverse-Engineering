.class public final Loi;
.super Landroid/app/Dialog;
.source "PG"


# instance fields
.field public a:Z

.field public b:Z

.field private final c:Ltz;

.field private final d:Lon;

.field private final e:Luh;

.field private f:Z

.field private g:Landroid/view/View;

.field private h:Landroid/widget/Button;

.field private i:Landroid/widget/Button;

.field private j:Landroid/widget/ImageButton;

.field private k:Landroid/widget/ImageButton;

.field private l:Landroid/widget/ImageView;

.field private m:Landroid/widget/TextView;

.field private n:Landroid/widget/TextView;

.field private o:Landroid/widget/TextView;

.field private p:Landroid/view/View;

.field private q:Landroid/widget/LinearLayout;

.field private r:Landroid/widget/SeekBar;

.field private s:Z

.field private t:Lct;

.field private u:Lom;

.field private v:Ldq;

.field private w:Lcf;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 97
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Loi;-><init>(Landroid/content/Context;I)V

    .line 98
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;I)V
    .locals 2

    .prologue
    .line 101
    invoke-static {p1}, La;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    .line 85
    const/4 v0, 0x1

    iput-boolean v0, p0, Loi;->b:Z

    .line 102
    invoke-virtual {p0}, Loi;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 104
    new-instance v1, Lom;

    .line 1464
    invoke-direct {v1, p0}, Lom;-><init>(Loi;)V

    .line 104
    iput-object v1, p0, Loi;->u:Lom;

    .line 105
    invoke-static {v0}, Ltz;->a(Landroid/content/Context;)Ltz;

    move-result-object v0

    iput-object v0, p0, Loi;->c:Ltz;

    .line 106
    new-instance v0, Lon;

    .line 2445
    invoke-direct {v0, p0}, Lon;-><init>(Loi;)V

    .line 106
    iput-object v0, p0, Loi;->d:Lon;

    .line 107
    invoke-static {}, Ltz;->d()Luh;

    move-result-object v0

    iput-object v0, p0, Loi;->e:Luh;

    .line 108
    invoke-static {}, Ltz;->e()Ldm;

    move-result-object v0

    invoke-direct {p0, v0}, Loi;->a(Ldm;)V

    .line 109
    return-void
.end method

.method static synthetic a(Loi;Lcf;)Lcf;
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Loi;->w:Lcf;

    return-object p1
.end method

.method static synthetic a(Loi;Lct;)Lct;
    .locals 1

    .prologue
    .line 55
    const/4 v0, 0x0

    iput-object v0, p0, Loi;->t:Lct;

    return-object v0
.end method

.method static synthetic a(Loi;Ldq;)Ldq;
    .locals 0

    .prologue
    .line 55
    iput-object p1, p0, Loi;->v:Ldq;

    return-object p1
.end method

.method private a(Ldm;)V
    .locals 4

    .prologue
    const/4 v1, 0x0

    .line 171
    iget-object v0, p0, Loi;->t:Lct;

    if-eqz v0, :cond_0

    .line 172
    iget-object v0, p0, Loi;->t:Lct;

    iget-object v2, p0, Loi;->u:Lom;

    invoke-virtual {v0, v2}, Lct;->a(Lcu;)V

    .line 173
    iput-object v1, p0, Loi;->t:Lct;

    .line 175
    :cond_0
    if-nez p1, :cond_2

    .line 194
    :cond_1
    :goto_0
    return-void

    .line 178
    :cond_2
    iget-boolean v0, p0, Loi;->f:Z

    if-eqz v0, :cond_1

    .line 182
    :try_start_0
    new-instance v0, Lct;

    invoke-virtual {p0}, Loi;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-direct {v0, v2, p1}, Lct;-><init>(Landroid/content/Context;Ldm;)V

    iput-object v0, p0, Loi;->t:Lct;
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 186
    :goto_1
    iget-object v0, p0, Loi;->t:Lct;

    if-eqz v0, :cond_4

    .line 187
    iget-object v0, p0, Loi;->t:Lct;

    iget-object v2, p0, Loi;->u:Lom;

    .line 3272
    if-nez v2, :cond_3

    .line 3273
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "callback cannot be null"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 183
    :catch_0
    move-exception v0

    .line 184
    const-string v2, "MediaRouteControllerDialog"

    const-string v3, "Error creating media controller in setMediaSession."

    invoke-static {v2, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_1

    .line 3276
    :cond_3
    new-instance v3, Landroid/os/Handler;

    invoke-direct {v3}, Landroid/os/Handler;-><init>()V

    .line 3278
    iget-object v0, v0, Lct;->a:Lcy;

    invoke-interface {v0, v2, v3}, Lcy;->a(Lcu;Landroid/os/Handler;)V

    .line 189
    :cond_4
    iget-object v0, p0, Loi;->t:Lct;

    if-nez v0, :cond_5

    move-object v0, v1

    .line 191
    :goto_2
    if-nez v0, :cond_6

    move-object v0, v1

    :goto_3
    iput-object v0, p0, Loi;->w:Lcf;

    .line 192
    iget-object v0, p0, Loi;->t:Lct;

    if-nez v0, :cond_7

    :goto_4
    iput-object v1, p0, Loi;->v:Ldq;

    .line 193
    invoke-direct {p0}, Loi;->b()Z

    goto :goto_0

    .line 189
    :cond_5
    iget-object v0, p0, Loi;->t:Lct;

    .line 4138
    iget-object v0, v0, Lct;->a:Lcy;

    invoke-interface {v0}, Lcy;->c()Lci;

    move-result-object v0

    goto :goto_2

    .line 191
    :cond_6
    invoke-virtual {v0}, Lci;->a()Lcf;

    move-result-object v0

    goto :goto_3

    .line 192
    :cond_7
    iget-object v0, p0, Loi;->t:Lct;

    .line 5129
    iget-object v0, v0, Lct;->a:Lcy;

    invoke-interface {v0}, Lcy;->b()Ldq;

    move-result-object v1

    goto :goto_4
.end method

.method static synthetic a(Loi;)Z
    .locals 1

    .prologue
    .line 55
    iget-boolean v0, p0, Loi;->s:Z

    return v0
.end method

.method static synthetic a(Loi;Z)Z
    .locals 0

    .prologue
    .line 55
    iput-boolean p1, p0, Loi;->s:Z

    return p1
.end method

.method static synthetic b(Loi;)V
    .locals 0

    .prologue
    .line 55
    invoke-virtual {p0}, Loi;->a()V

    return-void
.end method

.method private b()Z
    .locals 12

    .prologue
    const-wide/16 v10, 0x0

    const/4 v4, 0x0

    const/4 v1, 0x1

    const/16 v8, 0x8

    const/4 v2, 0x0

    .line 319
    iget-object v0, p0, Loi;->e:Luh;

    invoke-virtual {v0}, Luh;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Loi;->e:Luh;

    invoke-virtual {v0}, Luh;->b()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 320
    :cond_0
    invoke-virtual {p0}, Loi;->dismiss()V

    .line 409
    :cond_1
    :goto_0
    return v2

    .line 323
    :cond_2
    iget-boolean v0, p0, Loi;->a:Z

    if-eqz v0, :cond_1

    .line 327
    invoke-virtual {p0}, Loi;->a()V

    .line 329
    iget-object v0, p0, Loi;->o:Landroid/widget/TextView;

    iget-object v3, p0, Loi;->e:Luh;

    .line 5874
    iget-object v3, v3, Luh;->c:Ljava/lang/String;

    .line 329
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 331
    iget-object v0, p0, Loi;->e:Luh;

    .line 6154
    iget-boolean v0, v0, Luh;->g:Z

    .line 331
    if-eqz v0, :cond_5

    .line 332
    iget-object v0, p0, Loi;->h:Landroid/widget/Button;

    invoke-virtual {v0, v2}, Landroid/widget/Button;->setVisibility(I)V

    .line 337
    :goto_1
    iget-object v0, p0, Loi;->e:Luh;

    .line 6240
    iget-object v0, v0, Luh;->n:Landroid/content/IntentSender;

    .line 337
    if-eqz v0, :cond_6

    .line 338
    iget-object v0, p0, Loi;->k:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 343
    :goto_2
    iget-object v0, p0, Loi;->g:Landroid/view/View;

    if-nez v0, :cond_4

    .line 344
    iget-object v0, p0, Loi;->w:Lcf;

    if-eqz v0, :cond_c

    .line 345
    iget-object v0, p0, Loi;->w:Lcf;

    .line 7128
    iget-object v0, v0, Lcf;->c:Landroid/graphics/Bitmap;

    .line 345
    if-eqz v0, :cond_7

    .line 346
    iget-object v0, p0, Loi;->l:Landroid/widget/ImageView;

    iget-object v3, p0, Loi;->w:Lcf;

    .line 8128
    iget-object v3, v3, Lcf;->c:Landroid/graphics/Bitmap;

    .line 346
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 347
    iget-object v0, p0, Loi;->l:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 358
    :goto_3
    iget-object v0, p0, Loi;->w:Lcf;

    .line 10101
    iget-object v0, v0, Lcf;->a:Ljava/lang/CharSequence;

    .line 359
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_9

    .line 360
    iget-object v3, p0, Loi;->m:Landroid/widget/TextView;

    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    move v0, v1

    .line 366
    :goto_4
    iget-object v3, p0, Loi;->w:Lcf;

    .line 10110
    iget-object v3, v3, Lcf;->b:Ljava/lang/CharSequence;

    .line 367
    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_a

    .line 368
    iget-object v0, p0, Loi;->n:Landroid/widget/TextView;

    iget-object v3, p0, Loi;->w:Lcf;

    .line 11110
    iget-object v3, v3, Lcf;->b:Ljava/lang/CharSequence;

    .line 368
    invoke-virtual {v0, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    move v0, v1

    .line 374
    :goto_5
    if-nez v0, :cond_b

    .line 375
    iget-object v0, p0, Loi;->p:Landroid/view/View;

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    .line 383
    :goto_6
    iget-object v0, p0, Loi;->v:Ldq;

    if-eqz v0, :cond_12

    .line 384
    iget-object v0, p0, Loi;->v:Ldq;

    .line 11324
    iget v0, v0, Ldq;->a:I

    .line 384
    const/4 v3, 0x6

    if-eq v0, v3, :cond_3

    iget-object v0, p0, Loi;->v:Ldq;

    .line 12324
    iget v0, v0, Ldq;->a:I

    .line 384
    const/4 v3, 0x3

    if-ne v0, v3, :cond_d

    :cond_3
    move v0, v1

    .line 386
    :goto_7
    iget-object v3, p0, Loi;->v:Ldq;

    .line 12374
    iget-wide v4, v3, Ldq;->b:J

    .line 386
    const-wide/16 v6, 0x204

    and-long/2addr v4, v6

    cmp-long v3, v4, v10

    if-eqz v3, :cond_e

    move v3, v1

    .line 388
    :goto_8
    iget-object v4, p0, Loi;->v:Ldq;

    .line 13374
    iget-wide v4, v4, Ldq;->b:J

    .line 388
    const-wide/16 v6, 0x202

    and-long/2addr v4, v6

    cmp-long v4, v4, v10

    if-eqz v4, :cond_f

    move v4, v1

    .line 390
    :goto_9
    if-eqz v0, :cond_10

    if-eqz v4, :cond_10

    .line 391
    iget-object v0, p0, Loi;->j:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 392
    iget-object v0, p0, Loi;->j:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Loi;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, La;->ci:I

    invoke-static {v2, v3}, La;->a(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 394
    iget-object v0, p0, Loi;->j:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Loi;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, La;->co:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setContentDescription(Ljava/lang/CharSequence;)V

    :cond_4
    :goto_a
    move v2, v1

    .line 409
    goto/16 :goto_0

    .line 334
    :cond_5
    iget-object v0, p0, Loi;->h:Landroid/widget/Button;

    invoke-virtual {v0, v8}, Landroid/widget/Button;->setVisibility(I)V

    goto/16 :goto_1

    .line 340
    :cond_6
    iget-object v0, p0, Loi;->k:Landroid/widget/ImageButton;

    invoke-virtual {v0, v8}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto/16 :goto_2

    .line 348
    :cond_7
    iget-object v0, p0, Loi;->w:Lcf;

    .line 8137
    iget-object v0, v0, Lcf;->d:Landroid/net/Uri;

    .line 348
    if-eqz v0, :cond_8

    .line 350
    iget-object v0, p0, Loi;->l:Landroid/widget/ImageView;

    iget-object v3, p0, Loi;->w:Lcf;

    .line 9137
    iget-object v3, v3, Lcf;->d:Landroid/net/Uri;

    .line 350
    invoke-virtual {v0, v3}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    .line 351
    iget-object v0, p0, Loi;->l:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_3

    .line 353
    :cond_8
    iget-object v0, p0, Loi;->l:Landroid/widget/ImageView;

    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 354
    iget-object v0, p0, Loi;->l:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_3

    .line 363
    :cond_9
    iget-object v0, p0, Loi;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 364
    iget-object v0, p0, Loi;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v8}, Landroid/widget/TextView;->setVisibility(I)V

    move v0, v2

    goto/16 :goto_4

    .line 371
    :cond_a
    iget-object v3, p0, Loi;->n:Landroid/widget/TextView;

    invoke-virtual {v3, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 372
    iget-object v3, p0, Loi;->n:Landroid/widget/TextView;

    invoke-virtual {v3, v8}, Landroid/widget/TextView;->setVisibility(I)V

    goto/16 :goto_5

    .line 377
    :cond_b
    iget-object v0, p0, Loi;->p:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_6

    .line 380
    :cond_c
    iget-object v0, p0, Loi;->l:Landroid/widget/ImageView;

    invoke-virtual {v0, v8}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 381
    iget-object v0, p0, Loi;->p:Landroid/view/View;

    invoke-virtual {v0, v8}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_6

    :cond_d
    move v0, v2

    .line 384
    goto/16 :goto_7

    :cond_e
    move v3, v2

    .line 386
    goto/16 :goto_8

    :cond_f
    move v4, v2

    .line 388
    goto/16 :goto_9

    .line 396
    :cond_10
    if-nez v0, :cond_11

    if-eqz v3, :cond_11

    .line 397
    iget-object v0, p0, Loi;->j:Landroid/widget/ImageButton;

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setVisibility(I)V

    .line 398
    iget-object v0, p0, Loi;->j:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Loi;->getContext()Landroid/content/Context;

    move-result-object v2

    sget v3, La;->cj:I

    invoke-static {v2, v3}, La;->a(Landroid/content/Context;I)I

    move-result v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setImageResource(I)V

    .line 400
    iget-object v0, p0, Loi;->j:Landroid/widget/ImageButton;

    invoke-virtual {p0}, Loi;->getContext()Landroid/content/Context;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, La;->cp:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getText(I)Ljava/lang/CharSequence;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setContentDescription(Ljava/lang/CharSequence;)V

    goto/16 :goto_a

    .line 403
    :cond_11
    iget-object v0, p0, Loi;->j:Landroid/widget/ImageButton;

    invoke-virtual {v0, v8}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto/16 :goto_a

    .line 406
    :cond_12
    iget-object v0, p0, Loi;->j:Landroid/widget/ImageButton;

    invoke-virtual {v0, v8}, Landroid/widget/ImageButton;->setVisibility(I)V

    goto/16 :goto_a
.end method

.method static synthetic c(Loi;)Landroid/widget/SeekBar;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Loi;->r:Landroid/widget/SeekBar;

    return-object v0
.end method

.method static synthetic d(Loi;)Luh;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Loi;->e:Luh;

    return-object v0
.end method

.method static synthetic e(Loi;)Z
    .locals 1

    .prologue
    .line 55
    invoke-direct {p0}, Loi;->b()Z

    move-result v0

    return v0
.end method

.method static synthetic f(Loi;)Lct;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Loi;->t:Lct;

    return-object v0
.end method

.method static synthetic g(Loi;)Lom;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Loi;->u:Lom;

    return-object v0
.end method

.method static synthetic h(Loi;)Ltz;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Loi;->c:Ltz;

    return-object v0
.end method

.method static synthetic i(Loi;)Ldq;
    .locals 1

    .prologue
    .line 55
    iget-object v0, p0, Loi;->v:Ldq;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 3

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 429
    iget-boolean v2, p0, Loi;->s:Z

    if-nez v2, :cond_0

    .line 13441
    iget-boolean v2, p0, Loi;->b:Z

    if-eqz v2, :cond_1

    iget-object v2, p0, Loi;->e:Luh;

    .line 14123
    iget v2, v2, Luh;->j:I

    .line 13441
    if-ne v2, v0, :cond_1

    .line 430
    :goto_0
    if-eqz v0, :cond_2

    .line 431
    iget-object v0, p0, Loi;->q:Landroid/widget/LinearLayout;

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    .line 432
    iget-object v0, p0, Loi;->r:Landroid/widget/SeekBar;

    iget-object v1, p0, Loi;->e:Luh;

    .line 14143
    iget v1, v1, Luh;->l:I

    .line 432
    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setMax(I)V

    .line 433
    iget-object v0, p0, Loi;->r:Landroid/widget/SeekBar;

    iget-object v1, p0, Loi;->e:Luh;

    .line 15133
    iget v1, v1, Luh;->k:I

    .line 433
    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setProgress(I)V

    .line 438
    :cond_0
    :goto_1
    return-void

    :cond_1
    move v0, v1

    .line 13441
    goto :goto_0

    .line 435
    :cond_2
    iget-object v0, p0, Loi;->q:Landroid/widget/LinearLayout;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/LinearLayout;->setVisibility(I)V

    goto :goto_1
.end method

.method public final onAttachedToWindow()V
    .locals 4

    .prologue
    .line 283
    invoke-super {p0}, Landroid/app/Dialog;->onAttachedToWindow()V

    .line 284
    const/4 v0, 0x1

    iput-boolean v0, p0, Loi;->f:Z

    .line 286
    iget-object v0, p0, Loi;->c:Ltz;

    sget-object v1, Ltx;->c:Ltx;

    iget-object v2, p0, Loi;->d:Lon;

    const/4 v3, 0x2

    invoke-virtual {v0, v1, v2, v3}, Ltz;->a(Ltx;Lua;I)V

    .line 288
    invoke-static {}, Ltz;->e()Ldm;

    move-result-object v0

    invoke-direct {p0, v0}, Loi;->a(Ldm;)V

    .line 289
    return-void
.end method

.method protected final onCreate(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 207
    invoke-super {p0, p1}, Landroid/app/Dialog;->onCreate(Landroid/os/Bundle;)V

    .line 209
    invoke-virtual {p0}, Loi;->getWindow()Landroid/view/Window;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/view/Window;->requestFeature(I)Z

    .line 211
    sget v0, La;->cl:I

    invoke-virtual {p0, v0}, Loi;->setContentView(I)V

    .line 213
    new-instance v1, Lol;

    .line 5486
    invoke-direct {v1, p0}, Lol;-><init>(Loi;)V

    .line 215
    sget v0, Lb;->n:I

    invoke-virtual {p0, v0}, Loi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Loi;->h:Landroid/widget/Button;

    .line 216
    iget-object v0, p0, Loi;->h:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 218
    sget v0, Lb;->v:I

    invoke-virtual {p0, v0}, Loi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    iput-object v0, p0, Loi;->i:Landroid/widget/Button;

    .line 219
    iget-object v0, p0, Loi;->i:Landroid/widget/Button;

    invoke-virtual {v0, v1}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 221
    sget v0, Lb;->u:I

    invoke-virtual {p0, v0}, Loi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Loi;->k:Landroid/widget/ImageButton;

    .line 222
    iget-object v0, p0, Loi;->k:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 224
    sget v0, Lb;->l:I

    invoke-virtual {p0, v0}, Loi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Loi;->l:Landroid/widget/ImageView;

    .line 225
    sget v0, Lb;->y:I

    invoke-virtual {p0, v0}, Loi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Loi;->m:Landroid/widget/TextView;

    .line 226
    sget v0, Lb;->w:I

    invoke-virtual {p0, v0}, Loi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Loi;->n:Landroid/widget/TextView;

    .line 227
    sget v0, Lb;->x:I

    invoke-virtual {p0, v0}, Loi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Loi;->p:Landroid/view/View;

    .line 228
    sget v0, Lb;->s:I

    invoke-virtual {p0, v0}, Loi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageButton;

    iput-object v0, p0, Loi;->j:Landroid/widget/ImageButton;

    .line 229
    iget-object v0, p0, Loi;->j:Landroid/widget/ImageButton;

    invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 230
    sget v0, Lb;->t:I

    invoke-virtual {p0, v0}, Loi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Loi;->o:Landroid/widget/TextView;

    .line 231
    sget v0, Lb;->q:I

    invoke-virtual {p0, v0}, Loi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/LinearLayout;

    iput-object v0, p0, Loi;->q:Landroid/widget/LinearLayout;

    .line 232
    sget v0, Lb;->r:I

    invoke-virtual {p0, v0}, Loi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/SeekBar;

    iput-object v0, p0, Loi;->r:Landroid/widget/SeekBar;

    .line 233
    iget-object v0, p0, Loi;->r:Landroid/widget/SeekBar;

    new-instance v1, Loj;

    invoke-direct {v1, p0}, Loj;-><init>(Loi;)V

    invoke-virtual {v0, v1}, Landroid/widget/SeekBar;->setOnSeekBarChangeListener(Landroid/widget/SeekBar$OnSeekBarChangeListener;)V

    .line 269
    iput-boolean v2, p0, Loi;->a:Z

    .line 270
    invoke-direct {p0}, Loi;->b()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 271
    const/4 v0, 0x0

    iput-object v0, p0, Loi;->g:Landroid/view/View;

    .line 272
    sget v0, Lb;->o:I

    invoke-virtual {p0, v0}, Loi;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/FrameLayout;

    .line 274
    iget-object v1, p0, Loi;->g:Landroid/view/View;

    if-eqz v1, :cond_0

    .line 275
    sget v1, Lb;->m:I

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->findViewById(I)Landroid/view/View;

    move-result-object v1

    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 276
    iget-object v1, p0, Loi;->g:Landroid/view/View;

    invoke-virtual {v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V

    .line 279
    :cond_0
    return-void
.end method

.method public final onDetachedFromWindow()V
    .locals 2

    .prologue
    .line 293
    iget-object v0, p0, Loi;->c:Ltz;

    iget-object v1, p0, Loi;->d:Lon;

    invoke-virtual {v0, v1}, Ltz;->a(Lua;)V

    .line 294
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Loi;->a(Ldm;)V

    .line 295
    const/4 v0, 0x0

    iput-boolean v0, p0, Loi;->f:Z

    .line 296
    invoke-super {p0}, Landroid/app/Dialog;->onDetachedFromWindow()V

    .line 297
    return-void
.end method

.method public final onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 4

    .prologue
    const/16 v3, 0x19

    const/4 v1, 0x1

    .line 301
    if-eq p1, v3, :cond_0

    const/16 v0, 0x18

    if-ne p1, v0, :cond_2

    .line 303
    :cond_0
    iget-object v2, p0, Loi;->e:Luh;

    if-ne p1, v3, :cond_1

    const/4 v0, -0x1

    :goto_0
    invoke-virtual {v2, v0}, Luh;->b(I)V

    .line 306
    :goto_1
    return v1

    :cond_1
    move v0, v1

    .line 303
    goto :goto_0

    .line 306
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v1

    goto :goto_1
.end method

.method public final onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 311
    const/16 v0, 0x19

    if-eq p1, v0, :cond_0

    const/16 v0, 0x18

    if-ne p1, v0, :cond_1

    .line 313
    :cond_0
    const/4 v0, 0x1

    .line 315
    :goto_0
    return v0

    :cond_1
    invoke-super {p0, p1, p2}, Landroid/app/Dialog;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method
