.class final Lasa;
.super Ljava/lang/Object;
.source "PG"


# instance fields
.field final a:Landroid/widget/TextView;

.field final b:Landroid/widget/TextView;

.field final c:Landroid/widget/ImageView;

.field final d:Landroid/widget/CheckBox;

.field final e:Landroid/widget/RadioButton;

.field final f:Landroid/widget/CompoundButton;

.field final g:Landroid/view/View;

.field h:Laex;

.field final i:Landroid/widget/RadioGroup;

.field final synthetic j:Lart;

.field private final k:Landroid/view/View;

.field private final l:Landroid/widget/TextView;

.field private final m:Landroid/widget/TextView;


# direct methods
.method public constructor <init>(Lart;Landroid/view/View;)V
    .locals 1

    .prologue
    .line 432
    iput-object p1, p0, Lasa;->j:Lart;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 433
    iput-object p2, p0, Lasa;->k:Landroid/view/View;

    .line 434
    sget v0, Lf;->C:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lasa;->l:Landroid/widget/TextView;

    .line 435
    sget v0, Lf;->z:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lasa;->a:Landroid/widget/TextView;

    .line 436
    sget v0, Lf;->A:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lasa;->b:Landroid/widget/TextView;

    .line 437
    sget v0, Lf;->bz:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Lasa;->c:Landroid/widget/ImageView;

    .line 438
    sget v0, Lf;->y:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lasa;->d:Landroid/widget/CheckBox;

    .line 439
    sget v0, Lf;->B:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioButton;

    iput-object v0, p0, Lasa;->e:Landroid/widget/RadioButton;

    .line 440
    sget v0, Lf;->F:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CompoundButton;

    iput-object v0, p0, Lasa;->f:Landroid/widget/CompoundButton;

    .line 441
    sget v0, Lf;->bx:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lasa;->g:Landroid/view/View;

    .line 442
    sget v0, Lf;->di:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/RadioGroup;

    iput-object v0, p0, Lasa;->i:Landroid/widget/RadioGroup;

    .line 443
    sget v0, Lf;->dj:I

    invoke-virtual {p2, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lasa;->m:Landroid/widget/TextView;

    .line 444
    return-void
.end method


# virtual methods
.method public final a()Lasa;
    .locals 3

    .prologue
    const/16 v2, 0x8

    .line 447
    iget-object v0, p0, Lasa;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 448
    iget-object v0, p0, Lasa;->a:Landroid/widget/TextView;

    if-eqz v0, :cond_0

    .line 449
    iget-object v0, p0, Lasa;->a:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 451
    :cond_0
    iget-object v0, p0, Lasa;->b:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 452
    iget-object v0, p0, Lasa;->c:Landroid/widget/ImageView;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 453
    iget-object v0, p0, Lasa;->d:Landroid/widget/CheckBox;

    invoke-virtual {v0, v2}, Landroid/widget/CheckBox;->setVisibility(I)V

    .line 454
    iget-object v0, p0, Lasa;->e:Landroid/widget/RadioButton;

    invoke-virtual {v0, v2}, Landroid/widget/RadioButton;->setVisibility(I)V

    .line 455
    iget-object v0, p0, Lasa;->f:Landroid/widget/CompoundButton;

    invoke-virtual {v0, v2}, Landroid/widget/CompoundButton;->setVisibility(I)V

    .line 456
    iget-object v0, p0, Lasa;->f:Landroid/widget/CompoundButton;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 457
    iget-object v0, p0, Lasa;->g:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 458
    iget-object v0, p0, Lasa;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 459
    iget-object v0, p0, Lasa;->i:Landroid/widget/RadioGroup;

    invoke-virtual {v0, v2}, Landroid/widget/RadioGroup;->setVisibility(I)V

    .line 460
    iget-object v0, p0, Lasa;->i:Landroid/widget/RadioGroup;

    invoke-virtual {v0}, Landroid/widget/RadioGroup;->removeAllViews()V

    .line 461
    iget-object v0, p0, Lasa;->h:Laex;

    if-eqz v0, :cond_1

    .line 462
    iget-object v0, p0, Lasa;->c:Landroid/widget/ImageView;

    const v1, 0x106000d

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 463
    iget-object v0, p0, Lasa;->h:Laex;

    invoke-virtual {v0}, Laex;->a()V

    .line 465
    :cond_1
    return-object p0
.end method

.method public final a(Landroid/view/View$OnClickListener;)Lasa;
    .locals 1

    .prologue
    .line 545
    iget-object v0, p0, Lasa;->k:Landroid/view/View;

    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 546
    return-object p0
.end method

.method public final a(Ljava/lang/String;)Lasa;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 469
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 470
    iget-object v0, p0, Lasa;->i:Landroid/widget/RadioGroup;

    invoke-virtual {v0}, Landroid/widget/RadioGroup;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_1

    .line 471
    iget-object v0, p0, Lasa;->l:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 472
    iget-object v0, p0, Lasa;->l:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 478
    :cond_0
    :goto_0
    return-object p0

    .line 474
    :cond_1
    iget-object v0, p0, Lasa;->m:Landroid/widget/TextView;

    invoke-virtual {v0, v2}, Landroid/widget/TextView;->setVisibility(I)V

    .line 475
    iget-object v0, p0, Lasa;->m:Landroid/widget/TextView;

    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method
