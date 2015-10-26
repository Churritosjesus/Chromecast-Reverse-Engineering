.class public final Lawr;
.super Lj;
.source "PG"


# instance fields
.field private Z:Landroid/view/View;

.field private final a:Lblp;

.field private aa:Landroid/view/View;

.field private ab:Landroid/view/View;

.field private ac:Landroid/widget/ScrollView;

.field private ad:Landroid/view/ViewGroup;

.field private ae:Landroid/view/ViewGroup;

.field private af:Landroid/view/ViewGroup;

.field private ag:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

.field private ah:Landroid/widget/TextView;

.field private ai:Landroid/widget/TextView;

.field private aj:Landroid/widget/TextView;

.field private ak:Landroid/widget/TextView;

.field private al:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

.field private am:Landroid/view/View;

.field private an:Latf;

.field private ao:I

.field private ap:I

.field private final aq:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

.field private b:I

.field private c:Ldbb;

.field private d:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    .line 46
    invoke-direct {p0}, Lj;-><init>()V

    .line 68
    new-instance v0, Lblp;

    const-string v1, "ContentDetailsActivity"

    invoke-direct {v0, v1}, Lblp;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Lawr;->a:Lblp;

    .line 93
    new-instance v0, Laws;

    invoke-direct {v0, p0}, Laws;-><init>(Lawr;)V

    iput-object v0, p0, Lawr;->aq:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    return-void
.end method

.method static synthetic a(Lawr;)Landroid/widget/ScrollView;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lawr;->ac:Landroid/widget/ScrollView;

    return-object v0
.end method

.method public static a(Ljava/lang/String;Ldbb;Z)Lawr;
    .locals 3

    .prologue
    .line 109
    new-instance v0, Landroid/os/Bundle;

    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 110
    const-string v1, "contentId"

    invoke-virtual {v0, v1, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 111
    const-string v1, "fromSearch"

    invoke-virtual {v0, v1, p2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 112
    if-eqz p1, :cond_0

    .line 113
    const-string v1, "contentDetails"

    invoke-static {p1}, Ldbb;->a(Ldew;)[B

    move-result-object v2

    invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 115
    :cond_0
    new-instance v1, Lawr;

    invoke-direct {v1}, Lawr;-><init>()V

    .line 116
    invoke-virtual {v1, v0}, Lawr;->f(Landroid/os/Bundle;)V

    .line 117
    return-object v1
.end method

.method static synthetic a(Lawr;I)V
    .locals 3

    .prologue
    .line 46
    .line 18228
    iget-object v0, p0, Lawr;->al:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    invoke-virtual {v0}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->getHeight()I

    move-result v0

    .line 18229
    if-gez p1, :cond_0

    .line 18231
    const/4 p1, 0x0

    .line 18235
    :cond_0
    iget-object v1, p0, Lawr;->al:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    div-int/lit8 v2, p1, 0x2

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->setTranslationY(F)V

    .line 18236
    iget-object v1, p0, Lawr;->am:Landroid/view/View;

    div-int/lit8 v2, p1, 0x2

    int-to-float v2, v2

    invoke-virtual {v1, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 18237
    iget v1, p0, Lawr;->b:I

    sub-int v1, v0, v1

    if-ge p1, v1, :cond_1

    .line 18238
    iget-object v0, p0, Lawr;->aa:Landroid/view/View;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/view/View;->setTranslationY(F)V

    :goto_0
    return-void

    .line 18241
    :cond_1
    iget-object v1, p0, Lawr;->aa:Landroid/view/View;

    iget v2, p0, Lawr;->b:I

    sub-int/2addr v0, v2

    sub-int/2addr v0, p1

    int-to-float v0, v0

    invoke-virtual {v1, v0}, Landroid/view/View;->setTranslationY(F)V

    goto :goto_0
.end method

.method static synthetic a(Lawr;Ldbb;)V
    .locals 0

    .prologue
    .line 46
    invoke-direct {p0, p1}, Lawr;->a(Ldbb;)V

    return-void
.end method

.method private a(Ldbb;)V
    .locals 14

    .prologue
    const/4 v7, 0x1

    const/4 v9, 0x0

    const/4 v13, 0x0

    const/16 v12, 0x8

    const/4 v3, 0x0

    .line 307
    if-nez p1, :cond_0

    .line 12612
    iget-object v0, p0, Lj;->y:Lm;

    .line 308
    sget v1, Lb;->aH:I

    invoke-static {v0, v1, v3}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 12669
    iget-object v0, p0, Lj;->x:Lt;

    .line 309
    invoke-virtual {v0}, Lr;->c()V

    .line 450
    :goto_0
    return-void

    .line 312
    :cond_0
    iget-object v0, p0, Lawr;->ak:Landroid/widget/TextView;

    iget-object v1, p1, Ldbb;->f:Ljava/lang/String;

    invoke-static {v0, v1}, Lblx;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 313
    iget-object v0, p0, Lawr;->ai:Landroid/widget/TextView;

    iget-object v1, p1, Ldbb;->d:Ljava/lang/String;

    invoke-static {v0, v1}, Lblx;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 314
    iget-object v0, p0, Lawr;->aj:Landroid/widget/TextView;

    iget-object v1, p1, Ldbb;->e:Ljava/lang/String;

    invoke-static {v0, v1}, Lblx;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 315
    iget-object v0, p0, Lawr;->ah:Landroid/widget/TextView;

    iget-object v1, p1, Ldbb;->g:Ljava/lang/String;

    invoke-static {v0, v1}, Lblx;->a(Landroid/view/View;Ljava/lang/CharSequence;)V

    .line 317
    iget-object v0, p1, Ldbb;->a:Ldbj;

    if-eqz v0, :cond_4

    iget-object v0, p1, Ldbb;->a:Ldbj;

    iget-object v0, v0, Ldbj;->a:Ljava/lang/String;

    .line 318
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_4

    move v6, v7

    .line 319
    :goto_1
    iget-object v0, p1, Ldbb;->c:Ldbj;

    if-eqz v0, :cond_6

    iget-object v0, p1, Ldbb;->c:Ldbj;

    iget-object v0, v0, Ldbj;->a:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_6

    .line 320
    iget-object v0, p0, Lawr;->ag:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    invoke-virtual {v0, v3}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->setVisibility(I)V

    .line 322
    invoke-virtual {p0}, Lawr;->e()Landroid/content/res/Resources;

    move-result-object v0

    .line 323
    sget v1, La;->eg:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v8

    .line 324
    sget v1, La;->dK:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    .line 325
    iget-object v0, p1, Ldbb;->c:Ldbj;

    iget-object v0, v0, Ldbj;->c:Ljava/lang/Integer;

    .line 326
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    mul-int/2addr v0, v4

    iget-object v1, p1, Ldbb;->c:Ldbj;

    iget-object v1, v1, Ldbj;->b:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    div-int v5, v0, v1

    .line 327
    iget-object v0, p0, Lawr;->ag:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    iget-object v1, p0, Lawr;->an:Latf;

    .line 13197
    iget-object v1, v1, Latf;->m:Laer;

    .line 327
    iget-object v2, p1, Ldbb;->c:Ldbj;

    iget-object v2, v2, Ldbj;->a:Ljava/lang/String;

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->a(Laer;Ljava/lang/String;ZII)V

    .line 329
    if-eqz v6, :cond_1

    iget-object v0, p1, Ldbb;->c:Ldbj;

    iget-object v0, v0, Ldbj;->b:Ljava/lang/Integer;

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    iget-object v1, p1, Ldbb;->c:Ldbj;

    iget-object v1, v1, Ldbj;->c:Ljava/lang/Integer;

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    if-lt v0, v1, :cond_5

    .line 342
    :cond_1
    iget-object v0, p0, Lawr;->ag:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    mul-int/lit8 v1, v8, 0x2

    int-to-float v1, v1

    invoke-virtual {v0, v1}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->setTranslationY(F)V

    .line 343
    iget-object v0, p0, Lawr;->Z:Landroid/view/View;

    mul-int/lit8 v1, v8, 0x3

    add-int/2addr v1, v5

    invoke-virtual {v0, v1}, Landroid/view/View;->setMinimumHeight(I)V

    .line 362
    :goto_2
    if-eqz v6, :cond_8

    .line 363
    iget-object v0, p0, Lawr;->aa:Landroid/view/View;

    sget v1, La;->ek:I

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundResource(I)V

    .line 13612
    iget-object v0, p0, Lj;->y:Lm;

    .line 367
    invoke-static {v0}, Lblx;->b(Landroid/app/Activity;)I

    move-result v0

    .line 368
    int-to-float v0, v0

    const/high16 v1, 0x3f100000    # 0.5625f

    mul-float/2addr v0, v1

    float-to-int v5, v0

    .line 369
    iget-object v0, p0, Lawr;->al:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    iget-object v1, p0, Lawr;->an:Latf;

    .line 14197
    iget-object v1, v1, Latf;->m:Laer;

    .line 370
    iget-object v2, p1, Ldbb;->a:Ldbj;

    iget-object v2, v2, Ldbj;->a:Ljava/lang/String;

    iget v4, p0, Lawr;->ao:I

    .line 369
    invoke-virtual/range {v0 .. v5}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->a(Laer;Ljava/lang/String;ZII)V

    .line 372
    iget-object v0, p1, Ldbb;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_7

    .line 373
    iget-object v0, p0, Lawr;->am:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 374
    new-instance v0, Lawz;

    invoke-direct {v0, p0, p1}, Lawz;-><init>(Lawr;Ldbb;)V

    .line 387
    iget-object v1, p0, Lawr;->al:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    invoke-virtual {v1, v0}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 388
    iget-object v1, p0, Lawr;->am:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 398
    :goto_3
    iget-object v0, p0, Lawr;->aa:Landroid/view/View;

    invoke-virtual {v0, v9}, Landroid/view/View;->setTranslationY(F)V

    .line 400
    iget-object v0, p0, Lawr;->ad:Landroid/view/ViewGroup;

    invoke-virtual {v0, v12}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 401
    iget-object v1, p1, Ldbb;->h:[Ldbc;

    array-length v2, v1

    move v0, v3

    :goto_4
    if-ge v0, v2, :cond_2

    aget-object v4, v1, v0

    .line 402
    iget v5, v4, Ldbc;->d:I

    if-ne v5, v7, :cond_a

    iget-object v5, v4, Ldbc;->c:Ljava/lang/Float;

    if-eqz v5, :cond_a

    .line 404
    iget-object v0, p0, Lawr;->ad:Landroid/view/ViewGroup;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->setVisibility(I)V

    .line 14458
    iget-object v0, p0, Lawr;->ad:Landroid/view/ViewGroup;

    sget v1, Lf;->dk:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v1, v4, Ldbc;->a:Ljava/lang/String;

    .line 14459
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 14460
    iget-object v0, p0, Lawr;->ad:Landroid/view/ViewGroup;

    sget v1, Lf;->en:I

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    .line 14461
    iget-object v1, v4, Ldbc;->c:Ljava/lang/Float;

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    const v2, 0x3f19999a    # 0.6f

    cmpl-float v1, v1, v2

    if-ltz v1, :cond_9

    .line 14462
    sget v1, La;->ew:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 14466
    :goto_5
    iget-object v0, v4, Ldbc;->b:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    .line 14467
    iget-object v0, p0, Lawr;->ad:Landroid/view/ViewGroup;

    new-instance v1, Laxa;

    invoke-direct {v1, p0, v4}, Laxa;-><init>(Lawr;Ldbc;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 411
    :cond_2
    iget-object v0, p0, Lawr;->ae:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 412
    iget-object v0, p1, Ldbb;->j:[Ldbe;

    array-length v0, v0

    if-nez v0, :cond_3

    .line 14612
    iget-object v0, p0, Lj;->y:Lm;

    .line 413
    invoke-virtual {v0}, Lm;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, La;->gT:I

    .line 414
    invoke-virtual {v0, v1, v13}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    .line 415
    iget-object v1, p0, Lawr;->ae:Landroid/view/ViewGroup;

    invoke-virtual {v1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 417
    :cond_3
    iget-object v7, p1, Ldbb;->j:[Ldbe;

    array-length v8, v7

    move v6, v3

    :goto_6
    if-ge v6, v8, :cond_c

    aget-object v9, v7, v6

    .line 15612
    iget-object v0, p0, Lj;->y:Lm;

    .line 418
    invoke-virtual {v0}, Lm;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v1, La;->gD:I

    .line 419
    invoke-virtual {v0, v1, v13}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v10

    .line 420
    sget v0, Lf;->n:I

    invoke-virtual {v10, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    iget-object v1, p0, Lawr;->an:Latf;

    .line 16197
    iget-object v1, v1, Latf;->m:Laer;

    .line 421
    iget-object v2, v9, Ldbe;->a:Ldbj;

    iget-object v2, v2, Ldbj;->a:Ljava/lang/String;

    move v4, v3

    move v5, v3

    invoke-virtual/range {v0 .. v5}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->a(Laer;Ljava/lang/String;ZII)V

    .line 422
    sget v0, Lf;->ex:I

    invoke-virtual {v10, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Button;

    .line 16559
    iget-object v1, p0, Lj;->m:Landroid/os/Bundle;

    .line 424
    const-string v2, "fromSearch"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    .line 425
    iget-object v2, v9, Ldbe;->b:Ljava/lang/String;

    iget-object v4, v9, Ldbe;->c:Ljava/lang/String;

    iget-object v5, v9, Ldbe;->e:Ljava/lang/String;

    if-eqz v1, :cond_b

    .line 428
    const/16 v1, 0x86

    .line 427
    :goto_7
    invoke-static {v1}, Lapg;->a(I)Lapg;

    move-result-object v1

    iget-object v11, p0, Lawr;->d:Ljava/lang/String;

    .line 17079
    iput-object v11, v1, Lapg;->c:Ljava/lang/String;

    .line 429
    iget-object v9, v9, Ldbe;->d:Ljava/lang/String;

    .line 17084
    iput-object v9, v1, Lapg;->b:Ljava/lang/String;

    .line 431
    invoke-virtual {v1}, Lapg;->a()Lapd;

    move-result-object v1

    .line 425
    invoke-static {v0, v2, v4, v5, v1}, Lblx;->a(Landroid/widget/TextView;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lapd;)V

    .line 432
    iget-object v0, p0, Lawr;->ae:Landroid/view/ViewGroup;

    invoke-virtual {v0, v10}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 417
    add-int/lit8 v0, v6, 0x1

    move v6, v0

    goto :goto_6

    :cond_4
    move v6, v3

    .line 318
    goto/16 :goto_1

    .line 354
    :cond_5
    iget-object v0, p0, Lawr;->ag:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    invoke-virtual {v0, v9}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->setTranslationY(F)V

    .line 355
    iget-object v0, p0, Lawr;->Z:Landroid/view/View;

    add-int v1, v5, v8

    invoke-virtual {v0, v1}, Landroid/view/View;->setMinimumHeight(I)V

    goto/16 :goto_2

    .line 358
    :cond_6
    iget-object v0, p0, Lawr;->ag:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    invoke-virtual {v0, v12}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->setVisibility(I)V

    .line 359
    iget-object v0, p0, Lawr;->Z:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setMinimumHeight(I)V

    goto/16 :goto_2

    .line 390
    :cond_7
    iget-object v0, p0, Lawr;->am:Landroid/view/View;

    invoke-virtual {v0, v12}, Landroid/view/View;->setVisibility(I)V

    goto/16 :goto_3

    .line 393
    :cond_8
    iget-object v0, p0, Lawr;->aa:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setBackgroundResource(I)V

    .line 394
    iget-object v0, p0, Lawr;->aa:Landroid/view/View;

    invoke-virtual {p0}, Lawr;->e()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, La;->dq:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getColor(I)I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/view/View;->setBackgroundColor(I)V

    .line 395
    iget-object v0, p0, Lawr;->al:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    new-instance v1, Landroid/widget/RelativeLayout$LayoutParams;

    iget v2, p0, Lawr;->ao:I

    iget v4, p0, Lawr;->b:I

    invoke-direct {v1, v2, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V

    invoke-virtual {v0, v1}, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    goto/16 :goto_3

    .line 14464
    :cond_9
    sget v1, La;->eZ:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_5

    .line 401
    :cond_a
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_4

    .line 428
    :cond_b
    const/16 v1, 0x7b

    goto :goto_7

    .line 436
    :cond_c
    iget-object v0, p0, Lawr;->af:Landroid/view/ViewGroup;

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 437
    iget-object v0, p1, Ldbb;->i:[Ldbd;

    if-eqz v0, :cond_d

    .line 438
    iget-object v2, p1, Ldbb;->i:[Ldbd;

    array-length v4, v2

    move v1, v3

    :goto_8
    if-ge v1, v4, :cond_d

    aget-object v5, v2, v1

    .line 17612
    iget-object v0, p0, Lj;->y:Lm;

    .line 439
    invoke-virtual {v0}, Lm;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    sget v6, La;->fM:I

    .line 440
    invoke-virtual {v0, v6, v13}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v6

    .line 441
    sget v0, Lf;->ca:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v7, v5, Ldbd;->a:Ljava/lang/String;

    .line 442
    invoke-virtual {v0, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 443
    sget v0, Lf;->cb:I

    invoke-virtual {v6, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iget-object v5, v5, Ldbd;->b:Ljava/lang/String;

    .line 444
    invoke-virtual {v0, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 445
    iget-object v0, p0, Lawr;->af:Landroid/view/ViewGroup;

    invoke-virtual {v0, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 438
    add-int/lit8 v0, v1, 0x1

    move v1, v0

    goto :goto_8

    .line 448
    :cond_d
    iget-object v0, p0, Lawr;->ab:Landroid/view/View;

    invoke-virtual {v0, v12}, Landroid/view/View;->setVisibility(I)V

    .line 449
    iget-object v0, p0, Lawr;->ac:Landroid/widget/ScrollView;

    invoke-virtual {v0, v3}, Landroid/widget/ScrollView;->setVisibility(I)V

    goto/16 :goto_0
.end method

.method private a(Ljava/lang/String;)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 263
    new-instance v0, Laww;

    invoke-direct {v0, p0, p1}, Laww;-><init>(Lawr;Ljava/lang/String;)V

    .line 11559
    iget-object v1, p0, Lj;->m:Landroid/os/Bundle;

    .line 279
    const-string v2, "fromSearch"

    invoke-virtual {v1, v2, v3}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 280
    iget-object v1, p0, Lawr;->an:Latf;

    .line 12271
    invoke-virtual {v1, p1, v0, v4}, Latf;->a(Ljava/lang/String;Laea;Z)V

    .line 284
    :goto_0
    new-array v0, v4, [Ljava/lang/Object;

    aput-object p1, v0, v3

    .line 285
    return-void

    .line 282
    :cond_0
    iget-object v1, p0, Lawr;->an:Latf;

    .line 12279
    invoke-virtual {v1, p1, v0, v3}, Latf;->a(Ljava/lang/String;Laea;Z)V

    goto :goto_0
.end method

.method static synthetic b(Lawr;)I
    .locals 1

    .prologue
    .line 46
    iget v0, p0, Lawr;->ap:I

    return v0
.end method

.method static synthetic b(Lawr;I)I
    .locals 0

    .prologue
    .line 46
    iput p1, p0, Lawr;->ap:I

    return p1
.end method

.method static synthetic c(Lawr;)Landroid/widget/TextView;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lawr;->ak:Landroid/widget/TextView;

    return-object v0
.end method

.method static synthetic d(Lawr;)Lblp;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lawr;->a:Lblp;

    return-object v0
.end method

.method static synthetic e(Lawr;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lawr;->d:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    .prologue
    const/4 v6, 0x1

    const/4 v5, 0x0

    .line 132
    sget v0, La;->fN:I

    invoke-virtual {p1, v0, p2, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v1

    .line 1612
    iget-object v0, p0, Lj;->y:Lm;

    .line 134
    invoke-static {v0}, Lblx;->a(Landroid/app/Activity;)I

    move-result v0

    iput v0, p0, Lawr;->ao:I

    .line 135
    invoke-virtual {p0}, Lawr;->e()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, La;->eh:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, Lawr;->b:I

    .line 136
    sget v0, Lf;->eo:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lawr;->aa:Landroid/view/View;

    .line 137
    sget v0, Lf;->dX:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lawr;->ab:Landroid/view/View;

    .line 138
    sget v0, Lf;->bp:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lawr;->Z:Landroid/view/View;

    .line 139
    sget v0, Lf;->ds:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lawr;->ac:Landroid/widget/ScrollView;

    .line 140
    sget v0, Lf;->dq:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lawr;->ad:Landroid/view/ViewGroup;

    .line 141
    sget v0, Lf;->df:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lawr;->ae:Landroid/view/ViewGroup;

    .line 142
    sget v0, Lf;->bZ:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    iput-object v0, p0, Lawr;->af:Landroid/view/ViewGroup;

    .line 143
    sget v0, Lf;->bf:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    iput-object v0, p0, Lawr;->ag:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    .line 144
    sget v0, Lf;->ao:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    iput-object v0, p0, Lawr;->al:Lcom/google/android/apps/chromecast/app/widget/ReusableImageView;

    .line 145
    sget v0, Lf;->ep:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lawr;->am:Landroid/view/View;

    .line 146
    sget v0, Lf;->aZ:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lawr;->ah:Landroid/widget/TextView;

    .line 147
    sget v0, Lf;->em:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lawr;->ai:Landroid/widget/TextView;

    .line 148
    sget v0, Lf;->ec:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lawr;->aj:Landroid/widget/TextView;

    .line 149
    sget v0, Lf;->aq:I

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lawr;->ak:Landroid/widget/TextView;

    .line 151
    if-eqz p3, :cond_3

    .line 152
    const-string v0, "descMaxLines"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lawr;->ap:I

    .line 156
    :goto_0
    iget-object v0, p0, Lawr;->ak:Landroid/widget/TextView;

    iget v2, p0, Lawr;->ap:I

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 157
    iget-object v0, p0, Lawr;->ak:Landroid/widget/TextView;

    new-instance v2, Lawt;

    invoke-direct {v2, p0}, Lawt;-><init>(Lawr;)V

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 2612
    iget-object v0, p0, Lj;->y:Lm;

    .line 176
    invoke-static {v0}, Latf;->a(Landroid/content/Context;)Latf;

    move-result-object v0

    iput-object v0, p0, Lawr;->an:Latf;

    .line 3559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 178
    const-string v2, "contentId"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lawr;->d:Ljava/lang/String;

    .line 179
    const/4 v0, 0x0

    .line 180
    if-eqz p3, :cond_4

    const-string v2, "contentDetails"

    invoke-virtual {p3, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 182
    const-string v0, "contentDetails"

    invoke-virtual {p3, v0}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v0

    .line 197
    :cond_0
    :goto_1
    if-eqz v0, :cond_1

    .line 5696
    :try_start_0
    new-instance v2, Ldbb;

    invoke-direct {v2}, Ldbb;-><init>()V

    invoke-static {v2, v0}, Ldew;->a(Ldew;[B)Ldew;

    move-result-object v0

    check-cast v0, Ldbb;

    .line 199
    iput-object v0, p0, Lawr;->c:Ldbb;

    .line 200
    iget-object v0, p0, Lawr;->c:Ldbb;

    invoke-direct {p0, v0}, Lawr;->a(Ldbb;)V
    :try_end_0
    .catch Ldev; {:try_start_0 .. :try_end_0} :catch_0

    .line 6612
    :cond_1
    :goto_2
    iget-object v0, p0, Lj;->y:Lm;

    .line 206
    sget v2, Lf;->aW:I

    invoke-virtual {v0, v2}, Lm;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/widget/DrawerLayout;

    .line 207
    if-eqz v0, :cond_2

    .line 208
    invoke-virtual {v0, v6}, Landroid/support/v4/widget/DrawerLayout;->a(I)V

    .line 210
    :cond_2
    iget-object v0, p0, Lawr;->ac:Landroid/widget/ScrollView;

    invoke-virtual {v0}, Landroid/widget/ScrollView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v2, p0, Lawr;->aq:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v2}, Landroid/view/ViewTreeObserver;->addOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 212
    new-instance v0, Landroid/os/Handler;

    invoke-direct {v0}, Landroid/os/Handler;-><init>()V

    new-instance v2, Lawv;

    invoke-direct {v2, p0}, Lawv;-><init>(Lawr;)V

    invoke-virtual {v0, v2}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 220
    return-object v1

    .line 154
    :cond_3
    invoke-virtual {p0}, Lawr;->e()Landroid/content/res/Resources;

    move-result-object v0

    sget v2, La;->fa:I

    invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Lawr;->ap:I

    goto :goto_0

    .line 4559
    :cond_4
    iget-object v2, p0, Lj;->m:Landroid/os/Bundle;

    .line 183
    const-string v3, "contentDetails"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 5559
    iget-object v0, p0, Lj;->m:Landroid/os/Bundle;

    .line 185
    const-string v2, "contentDetails"

    invoke-virtual {v0, v2}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B

    move-result-object v0

    .line 186
    iget-object v2, p0, Lawr;->d:Ljava/lang/String;

    if-eqz v2, :cond_0

    .line 188
    iget-object v2, p0, Lawr;->d:Ljava/lang/String;

    invoke-direct {p0, v2}, Lawr;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 190
    :cond_5
    iget-object v2, p0, Lawr;->d:Ljava/lang/String;

    if-eqz v2, :cond_6

    .line 191
    iget-object v2, p0, Lawr;->d:Ljava/lang/String;

    invoke-direct {p0, v2}, Lawr;->a(Ljava/lang/String;)V

    goto :goto_1

    .line 193
    :cond_6
    iget-object v2, p0, Lawr;->a:Lblp;

    const-string v3, "Details activity started without a content ID or details"

    new-array v4, v5, [Ljava/lang/Object;

    invoke-virtual {v2, v3, v4}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 5669
    iget-object v2, p0, Lj;->x:Lt;

    .line 194
    invoke-virtual {v2}, Lr;->c()V

    goto :goto_1

    .line 201
    :catch_0
    move-exception v0

    .line 202
    iget-object v2, p0, Lawr;->a:Lblp;

    const-string v3, "Error parsing saved content details: %s"

    new-array v4, v6, [Ljava/lang/Object;

    aput-object v0, v4, v5

    invoke-virtual {v2, v3, v4}, Lblp;->a(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_2
.end method

.method public final d()V
    .locals 2

    .prologue
    .line 253
    invoke-super {p0}, Lj;->d()V

    .line 9612
    iget-object v0, p0, Lj;->y:Lm;

    .line 254
    check-cast v0, Laov;

    invoke-interface {v0}, Laov;->i()V

    .line 255
    iget-object v0, p0, Lawr;->ac:Landroid/widget/ScrollView;

    invoke-virtual {v0}, Landroid/widget/ScrollView;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    iget-object v1, p0, Lawr;->aq:Landroid/view/ViewTreeObserver$OnScrollChangedListener;

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->removeOnScrollChangedListener(Landroid/view/ViewTreeObserver$OnScrollChangedListener;)V

    .line 10612
    iget-object v0, p0, Lj;->y:Lm;

    .line 256
    sget v1, Lf;->aW:I

    invoke-virtual {v0, v1}, Lm;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v4/widget/DrawerLayout;

    .line 257
    if-eqz v0, :cond_0

    .line 258
    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->a(I)V

    .line 260
    :cond_0
    return-void
.end method

.method public final e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 122
    invoke-super {p0, p1}, Lj;->e(Landroid/os/Bundle;)V

    .line 123
    iget-object v0, p0, Lawr;->c:Ldbb;

    if-eqz v0, :cond_0

    .line 124
    const-string v0, "contentDetails"

    iget-object v1, p0, Lawr;->c:Ldbb;

    invoke-static {v1}, Ldbb;->a(Ldew;)[B

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V

    .line 126
    :cond_0
    const-string v0, "descMaxLines"

    iget v1, p0, Lawr;->ap:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 127
    return-void
.end method

.method public final j()V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 247
    invoke-super {p0}, Lj;->j()V

    .line 7065
    iget-object v0, p0, Lj;->N:Landroid/view/View;

    .line 7288
    sget v1, Lf;->eo:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/Toolbar;

    .line 7612
    iget-object v1, p0, Lj;->y:Lm;

    .line 7289
    check-cast v1, Lmm;

    invoke-virtual {v1, v0}, Lmm;->a(Landroid/support/v7/widget/Toolbar;)V

    .line 7290
    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->a(Ljava/lang/CharSequence;)V

    .line 7293
    new-instance v1, Lawy;

    invoke-direct {v1, p0}, Lawy;-><init>(Lawr;)V

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/Toolbar;->a(Landroid/view/View$OnClickListener;)V

    .line 8612
    iget-object v0, p0, Lj;->y:Lm;

    .line 7300
    check-cast v0, Lmm;

    .line 9077
    invoke-virtual {v0}, Lnf;->d()Lnh;

    move-result-object v0

    invoke-virtual {v0}, Lnh;->a()Lmj;

    move-result-object v0

    .line 7301
    invoke-virtual {v0, v2}, Lmj;->b(Z)V

    .line 7302
    invoke-virtual {v0, v2}, Lmj;->a(Z)V

    .line 249
    return-void
.end method
