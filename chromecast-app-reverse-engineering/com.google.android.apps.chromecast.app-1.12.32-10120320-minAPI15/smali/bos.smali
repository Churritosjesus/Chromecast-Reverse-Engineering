.class public final Lbos;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static final d:[Lbfu;


# instance fields
.field public a:Lboz;

.field public b:Landroid/widget/EditText;

.field public final c:Landroid/widget/CheckBox;

.field private final e:Landroid/content/Context;

.field private final f:Landroid/widget/Spinner;

.field private final g:Lbfs;

.field private final h:Lboq;

.field private final i:Landroid/view/View;

.field private final j:Landroid/view/View;

.field private final k:Landroid/widget/EditText;

.field private final l:Landroid/widget/Spinner;

.field private final m:Landroid/view/View;

.field private n:Ljava/lang/String;

.field private o:I

.field private final p:Landroid/text/TextWatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 38
    const/4 v0, 0x4

    new-array v0, v0, [Lbfu;

    const/4 v1, 0x0

    sget-object v2, Lbfu;->b:Lbfu;

    aput-object v2, v0, v1

    const/4 v1, 0x1

    sget-object v2, Lbfu;->c:Lbfu;

    aput-object v2, v0, v1

    const/4 v1, 0x2

    sget-object v2, Lbfu;->f:Lbfu;

    aput-object v2, v0, v1

    const/4 v1, 0x3

    sget-object v2, Lbfu;->h:Lbfu;

    aput-object v2, v0, v1

    sput-object v0, Lbos;->d:[Lbfu;

    return-void
.end method

.method public constructor <init>(Landroid/view/ViewGroup;)V
    .locals 4

    .prologue
    const/16 v3, 0x8

    .line 89
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 69
    const/4 v0, -0x1

    iput v0, p0, Lbos;->o:I

    .line 73
    new-instance v0, Lbot;

    invoke-direct {v0, p0}, Lbot;-><init>(Lbos;)V

    iput-object v0, p0, Lbos;->p:Landroid/text/TextWatcher;

    .line 90
    invoke-virtual {p1}, Landroid/view/ViewGroup;->getContext()Landroid/content/Context;

    move-result-object v0

    iput-object v0, p0, Lbos;->e:Landroid/content/Context;

    .line 92
    sget v0, Lf;->eD:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lbos;->i:Landroid/view/View;

    .line 93
    sget v0, Lf;->eI:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lbos;->j:Landroid/view/View;

    .line 94
    sget v0, Lf;->eH:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p0, Lbos;->l:Landroid/widget/Spinner;

    .line 95
    sget v0, Lf;->eC:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lbos;->k:Landroid/widget/EditText;

    .line 97
    iget-object v0, p0, Lbos;->i:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 98
    iget-object v0, p0, Lbos;->j:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 99
    iget-object v0, p0, Lbos;->k:Landroid/widget/EditText;

    iget-object v1, p0, Lbos;->p:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 101
    iget-object v0, p0, Lbos;->e:Landroid/content/Context;

    sget v1, La;->di:I

    sget v2, La;->gJ:I

    invoke-static {v0, v1, v2}, Landroid/widget/ArrayAdapter;->createFromResource(Landroid/content/Context;II)Landroid/widget/ArrayAdapter;

    move-result-object v0

    .line 103
    sget v1, La;->gL:I

    invoke-virtual {v0, v1}, Landroid/widget/ArrayAdapter;->setDropDownViewResource(I)V

    .line 104
    iget-object v1, p0, Lbos;->l:Landroid/widget/Spinner;

    invoke-virtual {v1, v0}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 106
    sget v0, Lf;->eG:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lbos;->m:Landroid/view/View;

    .line 107
    sget v0, Lf;->eE:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/EditText;

    iput-object v0, p0, Lbos;->b:Landroid/widget/EditText;

    .line 108
    iget-object v0, p0, Lbos;->b:Landroid/widget/EditText;

    iget-object v1, p0, Lbos;->p:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 109
    sget v0, Lf;->eF:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/CheckBox;

    iput-object v0, p0, Lbos;->c:Landroid/widget/CheckBox;

    .line 110
    iget-object v0, p0, Lbos;->c:Landroid/widget/CheckBox;

    invoke-virtual {v0}, Landroid/widget/CheckBox;->isChecked()Z

    move-result v0

    invoke-direct {p0, v0}, Lbos;->a(Z)V

    .line 111
    iget-object v0, p0, Lbos;->e:Landroid/content/Context;

    sget v1, Lb;->ek:I

    invoke-virtual {v0, v1}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lbos;->b(Ljava/lang/String;)Lbfs;

    move-result-object v0

    iput-object v0, p0, Lbos;->g:Lbfs;

    .line 1355
    iget-object v0, p0, Lbos;->m:Landroid/view/View;

    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 1356
    iget-object v0, p0, Lbos;->b:Landroid/widget/EditText;

    iget-object v1, p0, Lbos;->p:Landroid/text/TextWatcher;

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 1358
    iget-object v0, p0, Lbos;->c:Landroid/widget/CheckBox;

    new-instance v1, Lboy;

    invoke-direct {v1, p0}, Lboy;-><init>(Lbos;)V

    invoke-virtual {v0, v1}, Landroid/widget/CheckBox;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 114
    iget-object v0, p0, Lbos;->l:Landroid/widget/Spinner;

    new-instance v1, Lbou;

    invoke-direct {v1, p0}, Lbou;-><init>(Lbos;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 128
    iget-object v0, p0, Lbos;->j:Landroid/view/View;

    new-instance v1, Lbov;

    invoke-direct {v1, p0}, Lbov;-><init>(Lbos;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 134
    sget v0, Lf;->ci:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    new-instance v1, Lbow;

    invoke-direct {v1, p0}, Lbow;-><init>(Lbos;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 142
    sget v0, Lf;->ch:I

    invoke-virtual {p1, v0}, Landroid/view/ViewGroup;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/Spinner;

    iput-object v0, p0, Lbos;->f:Landroid/widget/Spinner;

    .line 143
    new-instance v0, Lboq;

    iget-object v1, p0, Lbos;->e:Landroid/content/Context;

    invoke-direct {v0, v1}, Lboq;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lbos;->h:Lboq;

    .line 144
    iget-object v0, p0, Lbos;->h:Lboq;

    sget v1, La;->gL:I

    invoke-virtual {v0, v1}, Lboq;->setDropDownViewResource(I)V

    .line 145
    iget-object v0, p0, Lbos;->f:Landroid/widget/Spinner;

    iget-object v1, p0, Lbos;->h:Lboq;

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setAdapter(Landroid/widget/SpinnerAdapter;)V

    .line 146
    iget-object v0, p0, Lbos;->f:Landroid/widget/Spinner;

    new-instance v1, Lbox;

    invoke-direct {v1, p0}, Lbox;-><init>(Lbos;)V

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 165
    return-void
.end method

.method static synthetic a(Lbos;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 35
    const/4 v0, 0x0

    iput-object v0, p0, Lbos;->n:Ljava/lang/String;

    return-object v0
.end method

.method static synthetic a(Lbos;)V
    .locals 1

    .prologue
    .line 35
    .line 14172
    iget-object v0, p0, Lbos;->a:Lboz;

    if-eqz v0, :cond_0

    .line 14173
    iget-object v0, p0, Lbos;->a:Lboz;

    invoke-interface {v0}, Lboz;->a()V

    .line 35
    :cond_0
    return-void
.end method

.method static synthetic a(Lbos;Z)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0, p1}, Lbos;->a(Z)V

    return-void
.end method

.method private a(Z)V
    .locals 4

    .prologue
    .line 370
    iget-object v0, p0, Lbos;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getSelectionStart()I

    move-result v1

    .line 371
    iget-object v0, p0, Lbos;->b:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getSelectionEnd()I

    move-result v2

    .line 372
    iget-object v3, p0, Lbos;->b:Landroid/widget/EditText;

    if-eqz p1, :cond_0

    .line 373
    invoke-static {}, Landroid/text/method/SingleLineTransformationMethod;->getInstance()Landroid/text/method/SingleLineTransformationMethod;

    move-result-object v0

    .line 372
    :goto_0
    invoke-virtual {v3, v0}, Landroid/widget/EditText;->setTransformationMethod(Landroid/text/method/TransformationMethod;)V

    .line 375
    iget-object v3, p0, Lbos;->b:Landroid/widget/EditText;

    if-eqz p1, :cond_1

    .line 376
    const/16 v0, 0x91

    .line 375
    :goto_1
    invoke-virtual {v3, v0}, Landroid/widget/EditText;->setInputType(I)V

    .line 378
    iget-object v0, p0, Lbos;->b:Landroid/widget/EditText;

    invoke-virtual {v0, v1, v2}, Landroid/widget/EditText;->setSelection(II)V

    .line 379
    iget-object v0, p0, Lbos;->b:Landroid/widget/EditText;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 380
    return-void

    .line 374
    :cond_0
    invoke-static {}, Landroid/text/method/PasswordTransformationMethod;->getInstance()Landroid/text/method/PasswordTransformationMethod;

    move-result-object v0

    goto :goto_0

    .line 377
    :cond_1
    const/16 v0, 0x81

    goto :goto_1
.end method

.method private static b(Ljava/lang/String;)Lbfs;
    .locals 2

    .prologue
    .line 396
    new-instance v0, Lbfs;

    invoke-direct {v0}, Lbfs;-><init>()V

    .line 13126
    iput-object p0, v0, Lbfs;->a:Ljava/lang/String;

    .line 398
    sget-object v1, Lbfu;->a:Lbfu;

    .line 13134
    iput-object v1, v0, Lbfs;->b:Lbfu;

    .line 13174
    const/4 v1, 0x1

    iput-boolean v1, v0, Lbfs;->g:Z

    .line 400
    return-object v0
.end method

.method private b()V
    .locals 6

    .prologue
    const/16 v4, 0x8

    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 296
    iget-object v0, p0, Lbos;->f:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbfs;

    .line 299
    iget-object v3, p0, Lbos;->g:Lbfs;

    if-ne v0, v3, :cond_0

    .line 301
    sget-object v0, Lbos;->d:[Lbfu;

    iget-object v3, p0, Lbos;->l:Landroid/widget/Spinner;

    .line 302
    invoke-virtual {v3}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v3

    aget-object v0, v0, v3

    .line 303
    iget-boolean v0, v0, Lbfu;->k:Z

    if-eqz v0, :cond_5

    move v0, v1

    .line 310
    :goto_0
    iget-object v5, p0, Lbos;->i:Landroid/view/View;

    if-eqz v1, :cond_1

    move v3, v2

    :goto_1
    invoke-virtual {v5, v3}, Landroid/view/View;->setVisibility(I)V

    .line 311
    iget-object v3, p0, Lbos;->j:Landroid/view/View;

    if-eqz v1, :cond_2

    move v1, v2

    :goto_2
    invoke-virtual {v3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 312
    iget-object v1, p0, Lbos;->m:Landroid/view/View;

    if-eqz v0, :cond_3

    :goto_3
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 313
    return-void

    .line 306
    :cond_0
    if-eqz v0, :cond_4

    .line 12138
    iget-object v0, v0, Lbfs;->b:Lbfu;

    .line 306
    iget-boolean v0, v0, Lbfu;->k:Z

    if-eqz v0, :cond_4

    move v0, v1

    move v1, v2

    .line 307
    goto :goto_0

    :cond_1
    move v3, v4

    .line 310
    goto :goto_1

    :cond_2
    move v1, v4

    .line 311
    goto :goto_2

    :cond_3
    move v2, v4

    .line 312
    goto :goto_3

    :cond_4
    move v0, v2

    move v1, v2

    goto :goto_0

    :cond_5
    move v0, v2

    goto :goto_0
.end method

.method static synthetic b(Lbos;)V
    .locals 0

    .prologue
    .line 35
    invoke-direct {p0}, Lbos;->b()V

    return-void
.end method

.method static synthetic c(Lbos;)Landroid/widget/Spinner;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lbos;->l:Landroid/widget/Spinner;

    return-object v0
.end method

.method static synthetic d(Lbos;)Landroid/widget/Spinner;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lbos;->f:Landroid/widget/Spinner;

    return-object v0
.end method

.method static synthetic e(Lbos;)I
    .locals 1

    .prologue
    .line 35
    iget v0, p0, Lbos;->o:I

    return v0
.end method

.method static synthetic f(Lbos;)Ljava/lang/String;
    .locals 1

    .prologue
    .line 35
    iget-object v0, p0, Lbos;->n:Ljava/lang/String;

    return-object v0
.end method


# virtual methods
.method public final a()Lbfs;
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 197
    iget-object v0, p0, Lbos;->f:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbfs;

    .line 198
    if-nez v0, :cond_1

    move-object v0, v2

    .line 216
    :cond_0
    :goto_0
    return-object v0

    .line 202
    :cond_1
    iget-object v1, p0, Lbos;->g:Lbfs;

    if-ne v0, v1, :cond_3

    .line 203
    iget-object v0, p0, Lbos;->k:Landroid/widget/EditText;

    invoke-virtual {v0}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lbos;->b(Ljava/lang/String;)Lbfs;

    move-result-object v0

    .line 3138
    :goto_1
    iget-object v1, v0, Lbfs;->b:Lbfu;

    .line 209
    sget-object v2, Lbfu;->a:Lbfu;

    if-ne v1, v2, :cond_2

    .line 210
    sget-object v1, Lbos;->d:[Lbfu;

    iget-object v2, p0, Lbos;->l:Landroid/widget/Spinner;

    .line 211
    invoke-virtual {v2}, Landroid/widget/Spinner;->getSelectedItemPosition()I

    move-result v2

    aget-object v1, v1, v2

    .line 4134
    iput-object v1, v0, Lbfs;->b:Lbfu;

    .line 4138
    :cond_2
    iget-object v1, v0, Lbfs;->b:Lbfu;

    .line 213
    iget-boolean v1, v1, Lbfu;->k:Z

    if-eqz v1, :cond_0

    .line 214
    iget-object v1, p0, Lbos;->b:Landroid/widget/EditText;

    invoke-virtual {v1}, Landroid/widget/EditText;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    .line 4158
    iput-object v1, v0, Lbfs;->e:Ljava/lang/String;

    goto :goto_0

    .line 206
    :cond_3
    new-instance v1, Lbfs;

    invoke-direct {v1, v0}, Lbfs;-><init>(Lbfs;)V

    .line 2191
    iput-object v2, v1, Lbfs;->i:Ljava/lang/String;

    move-object v0, v1

    goto :goto_1
.end method

.method public final a(Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 287
    iput-object p1, p0, Lbos;->n:Ljava/lang/String;

    .line 288
    iget-object v0, p0, Lbos;->b:Landroid/widget/EditText;

    invoke-virtual {v0, p1}, Landroid/widget/EditText;->setHint(Ljava/lang/CharSequence;)V

    .line 289
    return-void
.end method

.method public final a(Ljava/util/List;Ljava/lang/String;Lbfu;Z)V
    .locals 11

    .prologue
    const/4 v5, 0x0

    const/4 v10, -0x1

    const/4 v3, 0x0

    .line 232
    iget-object v0, p0, Lbos;->f:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->getSelectedItem()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbfs;

    .line 233
    if-eqz v0, :cond_0

    .line 5130
    iget-object p2, v0, Lbfs;->a:Ljava/lang/String;

    .line 238
    :cond_0
    iget-object v0, p0, Lbos;->h:Lboq;

    invoke-virtual {v0}, Lboq;->clear()V

    .line 239
    iget-object v0, p0, Lbos;->e:Landroid/content/Context;

    iget-object v1, p0, Lbos;->e:Landroid/content/Context;

    .line 240
    invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, La;->dh:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;

    move-result-object v1

    .line 239
    invoke-static {v0, v1}, Lblr;->a(Landroid/content/Context;[Ljava/lang/String;)Ljava/util/Set;

    move-result-object v4

    .line 241
    if-eqz p1, :cond_5

    .line 242
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_1
    :goto_0
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbfs;

    .line 6130
    iget-object v1, v0, Lbfs;->a:Ljava/lang/String;

    .line 246
    invoke-interface {v4, v1}, Ljava/util/Set;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2

    invoke-static {p2, v1}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 247
    :cond_2
    iget-object v7, p0, Lbos;->h:Lboq;

    move v2, v3

    .line 7130
    :goto_1
    invoke-virtual {v7}, Lboq;->getCount()I

    move-result v1

    if-ge v2, v1, :cond_4

    .line 7131
    invoke-virtual {v7, v2}, Lboq;->getItem(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lbfs;

    .line 7187
    iget v8, v1, Lbfs;->h:I

    .line 8187
    iget v9, v0, Lbfs;->h:I

    .line 7132
    invoke-static {v8, v9}, Landroid/net/wifi/WifiManager;->compareSignalLevel(II)I

    move-result v8

    .line 7134
    if-ltz v8, :cond_4

    .line 7137
    if-nez v8, :cond_3

    .line 9130
    iget-object v1, v1, Lbfs;->a:Ljava/lang/String;

    .line 10130
    iget-object v8, v0, Lbfs;->a:Ljava/lang/String;

    .line 7138
    invoke-virtual {v1, v8}, Ljava/lang/String;->compareToIgnoreCase(Ljava/lang/String;)I

    move-result v1

    if-gtz v1, :cond_4

    .line 7130
    :cond_3
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_1

    .line 7142
    :cond_4
    invoke-virtual {v7, v0, v2}, Lboq;->insert(Ljava/lang/Object;I)V

    goto :goto_0

    .line 252
    :cond_5
    iget-object v0, p0, Lbos;->h:Lboq;

    iget-object v1, p0, Lbos;->g:Lbfs;

    invoke-virtual {v0, v1}, Lboq;->add(Ljava/lang/Object;)V

    .line 255
    iput v10, p0, Lbos;->o:I

    .line 256
    invoke-static {p2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_a

    .line 257
    iget-object v0, p0, Lbos;->h:Lboq;

    invoke-virtual {v0, p2}, Lboq;->a(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lbos;->o:I

    .line 258
    iget v0, p0, Lbos;->o:I

    if-ne v0, v10, :cond_9

    .line 10324
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move-object v1, v5

    move v4, v3

    :goto_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbfs;

    .line 11130
    iget-object v8, v0, Lbfs;->a:Ljava/lang/String;

    .line 11342
    invoke-virtual {p2}, Ljava/lang/String;->length()I

    move-result v2

    invoke-virtual {v8}, Ljava/lang/String;->length()I

    move-result v6

    invoke-static {v2, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    move v2, v3

    .line 11343
    :goto_3
    if-ge v2, v6, :cond_7

    .line 11344
    invoke-virtual {p2, v2}, Ljava/lang/String;->charAt(I)C

    move-result v9

    invoke-virtual {v8, v2}, Ljava/lang/String;->charAt(I)C

    move-result v10

    if-eq v9, v10, :cond_6

    .line 10326
    :goto_4
    if-le v2, v4, :cond_f

    .line 12130
    iget-object v0, v0, Lbfs;->a:Ljava/lang/String;

    move v1, v2

    :goto_5
    move v4, v1

    move-object v1, v0

    .line 10330
    goto :goto_2

    .line 11343
    :cond_6
    add-int/lit8 v2, v2, 0x1

    goto :goto_3

    :cond_7
    move v2, v6

    .line 11348
    goto :goto_4

    .line 10331
    :cond_8
    const/4 v0, 0x5

    if-lt v4, v0, :cond_b

    .line 261
    :goto_6
    if-eqz p4, :cond_d

    .line 263
    iget-object v0, p0, Lbos;->h:Lboq;

    invoke-virtual {v0}, Lboq;->getCount()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lbos;->o:I

    .line 264
    iget-object v0, p0, Lbos;->k:Landroid/widget/EditText;

    invoke-virtual {v0, p2}, Landroid/widget/EditText;->setText(Ljava/lang/CharSequence;)V

    .line 265
    :goto_7
    sget-object v0, Lbos;->d:[Lbfu;

    array-length v0, v0

    if-ge v3, v0, :cond_9

    .line 266
    sget-object v0, Lbos;->d:[Lbfu;

    aget-object v0, v0, v3

    if-ne v0, p3, :cond_c

    .line 267
    iget-object v0, p0, Lbos;->l:Landroid/widget/Spinner;

    invoke-virtual {v0, v3}, Landroid/widget/Spinner;->setSelection(I)V

    .line 278
    :cond_9
    :goto_8
    iget-object v0, p0, Lbos;->f:Landroid/widget/Spinner;

    iget v1, p0, Lbos;->o:I

    invoke-virtual {v0, v1}, Landroid/widget/Spinner;->setSelection(I)V

    .line 280
    :cond_a
    invoke-direct {p0}, Lbos;->b()V

    .line 281
    return-void

    :cond_b
    move-object v1, v5

    .line 10334
    goto :goto_6

    .line 265
    :cond_c
    add-int/lit8 v3, v3, 0x1

    goto :goto_7

    .line 271
    :cond_d
    if-eqz v1, :cond_e

    .line 272
    iget-object v0, p0, Lbos;->h:Lboq;

    invoke-virtual {v0, v1}, Lboq;->a(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lbos;->o:I

    goto :goto_8

    .line 275
    :cond_e
    iput v3, p0, Lbos;->o:I

    goto :goto_8

    :cond_f
    move-object v0, v1

    move v1, v4

    goto :goto_5
.end method
