.class public final Labj;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field a:Labo;

.field b:Labp;

.field c:Labw;

.field private final d:Landroid/view/LayoutInflater;

.field private final e:Landroid/content/Context;

.field private f:I


# direct methods
.method public constructor <init>(Landroid/view/LayoutInflater;Landroid/content/Context;)V
    .locals 2

    .prologue
    .line 70
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 71
    iput-object p1, p0, Labj;->d:Landroid/view/LayoutInflater;

    .line 72
    iput-object p2, p0, Labj;->e:Landroid/content/Context;

    .line 74
    invoke-virtual {p2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, La;->cC:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    iput v0, p0, Labj;->f:I

    .line 75
    return-void
.end method

.method private static a(Landroid/view/View;I)V
    .locals 0

    .prologue
    .line 340
    if-eqz p0, :cond_0

    .line 341
    invoke-virtual {p0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 343
    :cond_0
    return-void
.end method

.method private static a(Ljava/lang/CharSequence;Landroid/widget/TextView;)V
    .locals 1

    .prologue
    .line 225
    if-nez p1, :cond_0

    .line 235
    :goto_0
    return-void

    .line 229
    :cond_0
    if-eqz p0, :cond_1

    .line 230
    invoke-virtual {p1, p0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 231
    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0

    .line 233
    :cond_1
    const/16 v0, 0x8

    invoke-virtual {p1, v0}, Landroid/widget/TextView;->setVisibility(I)V

    goto :goto_0
.end method

.method protected static b(I)I
    .locals 2

    .prologue
    .line 376
    sget-object v0, Labm;->a:[I

    add-int/lit8 v1, p0, -0x1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 382
    sget v0, La;->cO:I

    :goto_0
    return v0

    .line 378
    :pswitch_0
    sget v0, La;->cN:I

    goto :goto_0

    .line 380
    :pswitch_1
    sget v0, La;->cO:I

    goto :goto_0

    .line 376
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method

.method private static c(I)I
    .locals 2

    .prologue
    .line 358
    sget-object v0, Labm;->a:[I

    add-int/lit8 v1, p0, -0x1

    aget v0, v0, v1

    packed-switch v0, :pswitch_data_0

    .line 364
    sget v0, La;->cO:I

    :goto_0
    return v0

    .line 360
    :pswitch_0
    sget v0, La;->cN:I

    goto :goto_0

    .line 362
    :pswitch_1
    sget v0, La;->cO:I

    goto :goto_0

    .line 358
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final a(I)Landroid/view/View;
    .locals 3

    .prologue
    .line 202
    iget-object v0, p0, Labj;->d:Landroid/view/LayoutInflater;

    invoke-static {p1}, Labj;->c(I)I

    move-result v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final a(Landroid/view/View;Landroid/view/ViewGroup;Lacx;IILjava/lang/String;Landroid/graphics/drawable/StateListDrawable;)Landroid/view/View;
    .locals 10

    .prologue
    .line 120
    const/4 v1, 0x2

    new-array v2, v1, [Ljava/lang/String;

    const/4 v1, 0x0

    .line 1231
    iget-object v3, p3, Lacx;->c:Ljava/lang/String;

    .line 121
    aput-object v3, v2, v1

    const/4 v1, 0x1

    .line 1235
    iget-object v3, p3, Lacx;->d:Ljava/lang/String;

    .line 121
    aput-object v3, v2, v1

    .line 1501
    invoke-static/range {p6 .. p6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_7

    .line 1505
    const/4 v1, 0x0

    :goto_0
    invoke-virtual/range {p6 .. p6}, Ljava/lang/String;->length()I

    move-result v3

    if-ge v1, v3, :cond_7

    .line 1506
    move-object/from16 v0, p6

    invoke-virtual {v0, v1}, Ljava/lang/String;->charAt(I)C

    move-result v3

    invoke-static {v3}, Ljava/lang/Character;->isWhitespace(C)Z

    move-result v3

    if-nez v3, :cond_6

    .line 1507
    const/4 v1, 0x0

    .line 1469
    :goto_1
    if-eqz v1, :cond_8

    move-object v1, v2

    .line 122
    :goto_2
    const/4 v2, 0x0

    aget-object v2, v1, v2

    .line 123
    const/4 v3, 0x1

    aget-object v1, v1, v3

    .line 124
    const/4 v3, 0x1

    .line 2346
    iget-object v4, p0, Labj;->c:Labw;

    iget-object v5, p0, Labj;->e:Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    .line 3239
    iget v6, p3, Lacx;->e:I

    .line 3243
    iget-object v7, p3, Lacx;->f:Ljava/lang/String;

    .line 2346
    invoke-virtual {v4, v5, v6, v7}, Labw;->a(Landroid/content/res/Resources;ILjava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v4

    .line 2347
    invoke-interface {v4}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;

    move-result-object v5

    .line 4209
    invoke-static {p5}, Labj;->c(I)I

    move-result v4

    .line 4210
    sget-object v6, Labm;->a:[I

    add-int/lit8 v7, p5, -0x1

    aget v6, v6, v7

    packed-switch v6, :pswitch_data_0

    .line 4218
    :goto_3
    :pswitch_0
    if-eqz p1, :cond_c

    .line 129
    :goto_4
    new-instance v6, Labq;

    invoke-direct {v6, p0, p1}, Labq;-><init>(Labj;Landroid/view/View;)V

    .line 132
    sget-object v4, Labm;->a:[I

    add-int/lit8 v7, p5, -0x1

    aget v4, v4, v7

    packed-switch v4, :pswitch_data_1

    :cond_0
    move-object v4, v2

    move-object v2, v1

    move-object v1, v5

    .line 174
    :goto_5
    iget-object v5, v6, Labq;->b:Landroid/widget/TextView;

    invoke-static {v4, v5}, Labj;->a(Ljava/lang/CharSequence;Landroid/widget/TextView;)V

    .line 175
    iget-object v4, v6, Labq;->c:Landroid/widget/TextView;

    invoke-static {v2, v4}, Labj;->a(Ljava/lang/CharSequence;Landroid/widget/TextView;)V

    .line 176
    iget-object v2, v6, Labq;->d:Landroid/widget/TextView;

    invoke-static {v1, v2}, Labj;->a(Ljava/lang/CharSequence;Landroid/widget/TextView;)V

    .line 177
    iget-object v1, v6, Labq;->f:Landroid/widget/ImageView;

    .line 6243
    if-eqz v1, :cond_1

    .line 6247
    if-eqz v3, :cond_12

    .line 6248
    sget-object v2, Labm;->a:[I

    add-int/lit8 v3, p5, -0x1

    aget v2, v2, v3

    packed-switch v2, :pswitch_data_2

    .line 6273
    :goto_6
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 8231
    :cond_1
    :goto_7
    iget-object v1, p3, Lacx;->c:Ljava/lang/String;

    .line 178
    iget-object v2, v6, Labq;->g:Landroid/widget/ImageView;

    .line 8281
    if-eqz v2, :cond_2

    .line 8284
    if-nez p7, :cond_13

    .line 8285
    const/16 v1, 0x8

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 8324
    :cond_2
    :goto_8
    const/4 v1, 0x0

    .line 180
    iget-object v2, v6, Labq;->e:Landroid/widget/TextView;

    .line 9306
    if-eqz v2, :cond_3

    .line 9307
    if-nez v1, :cond_14

    .line 9320
    const/16 v1, 0x8

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 181
    :cond_3
    :goto_9
    iget-object v1, v6, Labq;->l:Landroid/widget/ImageView;

    .line 9326
    if-eqz v1, :cond_4

    .line 9329
    new-instance v2, Labl;

    invoke-direct {v2, p0}, Labl;-><init>(Labj;)V

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 10227
    :cond_4
    iget v1, p3, Lacx;->a:I

    .line 185
    if-nez v1, :cond_15

    .line 186
    iget-object v1, v6, Labq;->a:Landroid/view/ViewGroup;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Labj;->a(Landroid/view/View;I)V

    .line 187
    iget-object v1, v6, Labq;->k:Landroid/view/ViewGroup;

    const/16 v2, 0x8

    invoke-static {v1, v2}, Labj;->a(Landroid/view/View;I)V

    .line 188
    iget-object v1, v6, Labq;->j:Landroid/view/View;

    const/16 v2, 0x8

    invoke-static {v1, v2}, Labj;->a(Landroid/view/View;I)V

    .line 195
    :cond_5
    :goto_a
    return-object p1

    .line 1505
    :cond_6
    add-int/lit8 v1, v1, 0x1

    goto/16 :goto_0

    .line 1511
    :cond_7
    const/4 v1, 0x1

    goto/16 :goto_1

    .line 1473
    :cond_8
    const/4 v1, 0x2

    new-array v3, v1, [Ljava/lang/CharSequence;

    .line 1474
    const/4 v4, 0x0

    .line 1475
    const/4 v1, 0x0

    move v9, v1

    move v1, v4

    move v4, v9

    :goto_b
    const/4 v5, 0x2

    if-ge v4, v5, :cond_b

    .line 1476
    aget-object v5, v2, v4

    .line 1477
    if-eqz v5, :cond_9

    .line 1481
    if-nez v1, :cond_a

    .line 1482
    invoke-virtual {v5}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p6 .. p6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v6

    .line 1483
    const/4 v7, -0x1

    if-eq v6, v7, :cond_a

    .line 1484
    invoke-static {v5}, Landroid/text/SpannableStringBuilder;->valueOf(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-result-object v1

    .line 1485
    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    iget-object v7, p0, Labj;->e:Landroid/content/Context;

    .line 1486
    invoke-virtual {v7}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v8, La;->cw:I

    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getColor(I)I

    move-result v7

    invoke-direct {v5, v7}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 1489
    invoke-virtual/range {p6 .. p6}, Ljava/lang/String;->length()I

    move-result v7

    add-int/2addr v7, v6

    const/16 v8, 0x21

    .line 1488
    invoke-virtual {v1, v5, v6, v7, v8}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 1490
    aput-object v1, v3, v4

    .line 1491
    const/4 v1, 0x1

    .line 1475
    :cond_9
    :goto_c
    add-int/lit8 v4, v4, 0x1

    goto :goto_b

    .line 1495
    :cond_a
    aput-object v5, v3, v4

    goto :goto_c

    :cond_b
    move-object v1, v3

    .line 1497
    goto/16 :goto_2

    .line 4215
    :pswitch_1
    invoke-static {p5}, Labj;->b(I)I

    move-result v4

    goto/16 :goto_3

    .line 4218
    :cond_c
    iget-object v6, p0, Labj;->d:Landroid/view/LayoutInflater;

    const/4 v7, 0x0

    invoke-virtual {v6, v4, p2, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object p1

    goto/16 :goto_4

    .line 134
    :pswitch_2
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_d

    invoke-static {v2, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-eqz v4, :cond_19

    .line 4259
    :cond_d
    iget-boolean v2, p3, Lacx;->b:Z

    .line 139
    if-eqz v2, :cond_18

    .line 140
    const/4 v2, 0x0

    .line 5259
    :goto_d
    iget-boolean v4, p3, Lacx;->b:Z

    .line 144
    if-nez v4, :cond_17

    .line 145
    const/4 v3, 0x0

    .line 146
    const/4 v1, 0x0

    move-object v4, v3

    move v3, v1

    .line 150
    :goto_e
    iget-object v1, v6, Labq;->h:Landroid/view/View;

    if-eqz v1, :cond_e

    .line 151
    iget-object v7, v6, Labq;->h:Landroid/view/View;

    if-nez p4, :cond_f

    const/4 v1, 0x0

    :goto_f
    invoke-virtual {v7, v1}, Landroid/view/View;->setVisibility(I)V

    .line 152
    iget-object v1, v6, Labq;->h:Landroid/view/View;

    .line 153
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v7, p0, Labj;->f:I

    .line 152
    invoke-static {v1, v7}, Lft;->a(Landroid/view/ViewGroup$MarginLayoutParams;I)V

    .line 156
    :cond_e
    iget-object v1, v6, Labq;->i:Landroid/view/View;

    if-eqz v1, :cond_16

    .line 157
    iget-object v1, v6, Labq;->i:Landroid/view/View;

    .line 158
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup$MarginLayoutParams;

    iget v7, p0, Labj;->f:I

    .line 157
    invoke-static {v1, v7}, Lft;->a(Landroid/view/ViewGroup$MarginLayoutParams;I)V

    move-object v1, v5

    goto/16 :goto_5

    .line 151
    :cond_f
    const/16 v1, 0x8

    goto :goto_f

    .line 163
    :pswitch_3
    if-eqz p4, :cond_0

    .line 164
    const/4 v2, 0x0

    .line 165
    const/4 v3, 0x0

    move-object v4, v2

    move-object v2, v1

    move-object v1, v5

    goto/16 :goto_5

    .line 6235
    :pswitch_4
    iget-object v1, p3, Lacx;->d:Ljava/lang/String;

    .line 169
    invoke-static {v1}, Landroid/text/util/Rfc822Tokenizer;->tokenize(Ljava/lang/CharSequence;)[Landroid/text/util/Rfc822Token;

    move-result-object v1

    const/4 v4, 0x0

    aget-object v1, v1, v4

    invoke-virtual {v1}, Landroid/text/util/Rfc822Token;->getAddress()Ljava/lang/String;

    move-result-object v4

    .line 170
    const/4 v1, 0x0

    move-object v9, v4

    move-object v4, v2

    move-object v2, v9

    goto/16 :goto_5

    .line 6250
    :pswitch_5
    invoke-virtual {p3}, Lacx;->a()[B

    move-result-object v2

    .line 6251
    if-eqz v2, :cond_10

    array-length v3, v2

    if-lez v3, :cond_10

    .line 6252
    const/4 v3, 0x0

    array-length v4, v2

    invoke-static {v2, v3, v4}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v2

    .line 6254
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    goto/16 :goto_6

    .line 6391
    :cond_10
    sget v2, La;->cF:I

    .line 6256
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_6

    .line 7263
    :pswitch_6
    iget-object v2, p3, Lacx;->j:Landroid/net/Uri;

    .line 6261
    if-eqz v2, :cond_11

    .line 6264
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageURI(Landroid/net/Uri;)V

    goto/16 :goto_6

    .line 7391
    :cond_11
    sget v2, La;->cF:I

    .line 6266
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setImageResource(I)V

    goto/16 :goto_6

    .line 6275
    :cond_12
    const/16 v2, 0x8

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    goto/16 :goto_7

    .line 8287
    :cond_13
    iget-object v3, p0, Labj;->e:Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    .line 8288
    move-object/from16 v0, p7

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 8289
    sget v4, La;->cU:I

    const/4 v5, 0x1

    new-array v5, v5, [Ljava/lang/Object;

    const/4 v7, 0x0

    aput-object v1, v5, v7

    .line 8290
    invoke-virtual {v3, v4, v5}, Landroid/content/res/Resources;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 8289
    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 8291
    iget-object v1, p0, Labj;->a:Labo;

    if-eqz v1, :cond_2

    .line 8292
    new-instance v1, Labk;

    move-object/from16 v0, p7

    invoke-direct {v1, p0, v0}, Labk;-><init>(Labj;Landroid/graphics/drawable/StateListDrawable;)V

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto/16 :goto_8

    .line 9308
    :cond_14
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9309
    const/4 v1, 0x0

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setVisibility(I)V

    .line 9315
    const/4 v1, 0x0

    .line 9317
    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-virtual {v2, v1, v3, v4, v5}, Landroid/widget/TextView;->setCompoundDrawablesRelativeWithIntrinsicBounds(Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;Landroid/graphics/drawable/Drawable;)V

    goto/16 :goto_9

    .line 189
    :cond_15
    const/4 v2, 0x1

    if-ne v1, v2, :cond_5

    .line 190
    iget-object v1, v6, Labq;->a:Landroid/view/ViewGroup;

    const/16 v2, 0x8

    invoke-static {v1, v2}, Labj;->a(Landroid/view/View;I)V

    .line 191
    iget-object v1, v6, Labq;->k:Landroid/view/ViewGroup;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Labj;->a(Landroid/view/View;I)V

    .line 192
    iget-object v1, v6, Labq;->j:Landroid/view/View;

    const/4 v2, 0x0

    invoke-static {v1, v2}, Labj;->a(Landroid/view/View;I)V

    goto/16 :goto_a

    :cond_16
    move-object v1, v5

    goto/16 :goto_5

    :cond_17
    move-object v4, v1

    goto/16 :goto_e

    :cond_18
    move-object v2, v1

    goto/16 :goto_d

    :cond_19
    move-object v9, v1

    move-object v1, v2

    move-object v2, v9

    goto/16 :goto_d

    .line 4210
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch

    .line 132
    :pswitch_data_1
    .packed-switch 0x1
        :pswitch_2
        :pswitch_3
        :pswitch_4
    .end packed-switch

    .line 6248
    :pswitch_data_2
    .packed-switch 0x1
        :pswitch_5
        :pswitch_6
    .end packed-switch
.end method
