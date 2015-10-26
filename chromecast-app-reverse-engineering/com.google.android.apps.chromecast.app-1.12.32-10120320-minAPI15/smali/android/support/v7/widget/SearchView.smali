.class public Landroid/support/v7/widget/SearchView;
.super Lxu;
.source "PG"

# interfaces
.implements Lvt;


# static fields
.field public static final a:Z

.field public static final m:Laaj;


# instance fields
.field private A:Ljava/lang/CharSequence;

.field private B:Z

.field private C:I

.field private D:Ljava/lang/CharSequence;

.field private E:Ljava/lang/CharSequence;

.field private F:Z

.field private G:I

.field private H:Ljava/lang/Runnable;

.field private final I:Ljava/lang/Runnable;

.field private J:Ljava/lang/Runnable;

.field private final K:Landroid/view/View$OnClickListener;

.field private L:Landroid/view/View$OnKeyListener;

.field private final M:Landroid/widget/TextView$OnEditorActionListener;

.field private final N:Landroid/widget/AdapterView$OnItemClickListener;

.field private final O:Landroid/widget/AdapterView$OnItemSelectedListener;

.field private P:Landroid/text/TextWatcher;

.field public final b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

.field public final c:I

.field public final d:I

.field public final e:Landroid/content/Intent;

.field public final f:Landroid/content/Intent;

.field public i:Z

.field public j:Lkj;

.field public k:Z

.field public l:Landroid/app/SearchableInfo;

.field public final n:Ljava/util/WeakHashMap;

.field private final o:Landroid/view/View;

.field private final p:Landroid/view/View;

.field private final q:Landroid/view/View;

.field private final r:Landroid/widget/ImageView;

.field private final s:Landroid/widget/ImageView;

.field private final t:Landroid/widget/ImageView;

.field private final u:Landroid/widget/ImageView;

.field private final v:Landroid/view/View;

.field private final w:Landroid/widget/ImageView;

.field private final x:Landroid/graphics/drawable/Drawable;

.field private final y:Ljava/lang/CharSequence;

.field private z:Z


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 109
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x8

    if-lt v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    sput-boolean v0, Landroid/support/v7/widget/SearchView;->a:Z

    .line 167
    new-instance v0, Laaj;

    invoke-direct {v0}, Laaj;-><init>()V

    sput-object v0, Landroid/support/v7/widget/SearchView;->m:Laaj;

    return-void

    .line 109
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 271
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Landroid/support/v7/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 272
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 275
    sget v0, La;->O:I

    invoke-direct {p0, p1, p2, v0}, Landroid/support/v7/widget/SearchView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 276
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 8

    .prologue
    const/high16 v7, 0x10000000

    const/4 v6, 0x0

    const/4 v5, 0x1

    const/4 v4, -0x1

    .line 279
    invoke-direct {p0, p1, p2, p3}, Lxu;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 173
    new-instance v0, Lzx;

    invoke-direct {v0, p0}, Lzx;-><init>(Landroid/support/v7/widget/SearchView;)V

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->H:Ljava/lang/Runnable;

    .line 184
    new-instance v0, Laab;

    invoke-direct {v0, p0}, Laab;-><init>(Landroid/support/v7/widget/SearchView;)V

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->I:Ljava/lang/Runnable;

    .line 190
    new-instance v0, Laac;

    invoke-direct {v0, p0}, Laac;-><init>(Landroid/support/v7/widget/SearchView;)V

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->J:Ljava/lang/Runnable;

    .line 200
    new-instance v0, Ljava/util/WeakHashMap;

    invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->n:Ljava/util/WeakHashMap;

    .line 938
    new-instance v0, Laag;

    invoke-direct {v0, p0}, Laag;-><init>(Landroid/support/v7/widget/SearchView;)V

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->K:Landroid/view/View$OnClickListener;

    .line 960
    new-instance v0, Laah;

    invoke-direct {v0, p0}, Laah;-><init>(Landroid/support/v7/widget/SearchView;)V

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->L:Landroid/view/View$OnKeyListener;

    .line 1123
    new-instance v0, Laai;

    invoke-direct {v0, p0}, Laai;-><init>(Landroid/support/v7/widget/SearchView;)V

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->M:Landroid/widget/TextView$OnEditorActionListener;

    .line 1307
    new-instance v0, Lzy;

    invoke-direct {v0, p0}, Lzy;-><init>(Landroid/support/v7/widget/SearchView;)V

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->N:Landroid/widget/AdapterView$OnItemClickListener;

    .line 1318
    new-instance v0, Lzz;

    invoke-direct {v0, p0}, Lzz;-><init>(Landroid/support/v7/widget/SearchView;)V

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->O:Landroid/widget/AdapterView$OnItemSelectedListener;

    .line 1611
    new-instance v0, Laaa;

    invoke-direct {v0, p0}, Laaa;-><init>(Landroid/support/v7/widget/SearchView;)V

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->P:Landroid/text/TextWatcher;

    .line 281
    sget-object v0, Loq;->aW:[I

    invoke-static {p1, p2, v0, p3, v6}, Lth;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lth;

    move-result-object v1

    .line 284
    invoke-virtual {v1}, Lth;->a()Ltf;

    .line 286
    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 287
    sget v2, Loq;->bg:I

    sget v3, La;->bS:I

    invoke-virtual {v1, v2, v3}, Lth;->e(II)I

    move-result v2

    .line 289
    invoke-virtual {v0, v2, p0, v5}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 291
    sget v0, La;->br:I

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    .line 292
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    .line 2647
    iput-object p0, v0, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->a:Landroid/support/v7/widget/SearchView;

    .line 294
    sget v0, La;->bn:I

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->o:Landroid/view/View;

    .line 295
    sget v0, La;->bq:I

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->p:Landroid/view/View;

    .line 296
    sget v0, La;->bv:I

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->q:Landroid/view/View;

    .line 297
    sget v0, La;->bl:I

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->r:Landroid/widget/ImageView;

    .line 298
    sget v0, La;->bo:I

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->s:Landroid/widget/ImageView;

    .line 299
    sget v0, La;->bm:I

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->t:Landroid/widget/ImageView;

    .line 300
    sget v0, La;->bs:I

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->u:Landroid/widget/ImageView;

    .line 301
    sget v0, La;->bp:I

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->w:Landroid/widget/ImageView;

    .line 304
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->p:Landroid/view/View;

    sget v2, Loq;->bh:I

    invoke-virtual {v1, v2}, Lth;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 305
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->q:Landroid/view/View;

    sget v2, Loq;->bl:I

    invoke-virtual {v1, v2}, Lth;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/view/View;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 306
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->r:Landroid/widget/ImageView;

    sget v2, Loq;->bk:I

    invoke-virtual {v1, v2}, Lth;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 307
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->s:Landroid/widget/ImageView;

    sget v2, Loq;->be:I

    invoke-virtual {v1, v2}, Lth;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 308
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->t:Landroid/widget/ImageView;

    sget v2, Loq;->bb:I

    invoke-virtual {v1, v2}, Lth;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 309
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->u:Landroid/widget/ImageView;

    sget v2, Loq;->bn:I

    invoke-virtual {v1, v2}, Lth;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 310
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->w:Landroid/widget/ImageView;

    sget v2, Loq;->bk:I

    invoke-virtual {v1, v2}, Lth;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 312
    sget v0, Loq;->bj:I

    invoke-virtual {v1, v0}, Lth;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->x:Landroid/graphics/drawable/Drawable;

    .line 315
    sget v0, Loq;->bm:I

    sget v2, La;->bR:I

    invoke-virtual {v1, v0, v2}, Lth;->e(II)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/SearchView;->c:I

    .line 317
    sget v0, Loq;->bc:I

    invoke-virtual {v1, v0, v6}, Lth;->e(II)I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/SearchView;->d:I

    .line 319
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->r:Landroid/widget/ImageView;

    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->K:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 320
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->t:Landroid/widget/ImageView;

    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->K:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 321
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->s:Landroid/widget/ImageView;

    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->K:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 322
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->u:Landroid/widget/ImageView;

    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->K:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 323
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->K:Landroid/view/View$OnClickListener;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 325
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->P:Landroid/text/TextWatcher;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 326
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->M:Landroid/widget/TextView$OnEditorActionListener;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 327
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->N:Landroid/widget/AdapterView$OnItemClickListener;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 328
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->O:Landroid/widget/AdapterView$OnItemSelectedListener;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setOnItemSelectedListener(Landroid/widget/AdapterView$OnItemSelectedListener;)V

    .line 329
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->L:Landroid/view/View$OnKeyListener;

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setOnKeyListener(Landroid/view/View$OnKeyListener;)V

    .line 332
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    new-instance v2, Laad;

    invoke-direct {v2, p0}, Laad;-><init>(Landroid/support/v7/widget/SearchView;)V

    invoke-virtual {v0, v2}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setOnFocusChangeListener(Landroid/view/View$OnFocusChangeListener;)V

    .line 340
    sget v0, Loq;->bf:I

    invoke-virtual {v1, v0, v5}, Lth;->a(IZ)Z

    move-result v0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->a(Z)V

    .line 342
    sget v0, Loq;->ba:I

    invoke-virtual {v1, v0, v4}, Lth;->c(II)I

    move-result v0

    .line 343
    if-eq v0, v4, :cond_0

    .line 2768
    iput v0, p0, Landroid/support/v7/widget/SearchView;->C:I

    .line 2770
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->requestLayout()V

    .line 347
    :cond_0
    sget v0, Loq;->bd:I

    invoke-virtual {v1, v0}, Lth;->c(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->y:Ljava/lang/CharSequence;

    .line 348
    sget v0, Loq;->bi:I

    invoke-virtual {v1, v0}, Lth;->c(I)Ljava/lang/CharSequence;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->A:Ljava/lang/CharSequence;

    .line 350
    sget v0, Loq;->aY:I

    invoke-virtual {v1, v0, v4}, Lth;->a(II)I

    move-result v0

    .line 351
    if-eq v0, v4, :cond_1

    .line 3460
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setImeOptions(I)V

    .line 355
    :cond_1
    sget v0, Loq;->aZ:I

    invoke-virtual {v1, v0, v4}, Lth;->a(II)I

    move-result v0

    .line 356
    if-eq v0, v4, :cond_2

    .line 3479
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v2, v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setInputType(I)V

    .line 361
    :cond_2
    sget v0, Loq;->aX:I

    invoke-virtual {v1, v0, v5}, Lth;->a(IZ)Z

    move-result v0

    .line 362
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->setFocusable(Z)V

    .line 4183
    iget-object v0, v1, Lth;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 367
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.speech.action.WEB_SEARCH"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->e:Landroid/content/Intent;

    .line 368
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->e:Landroid/content/Intent;

    invoke-virtual {v0, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 369
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->e:Landroid/content/Intent;

    const-string v1, "android.speech.extra.LANGUAGE_MODEL"

    const-string v2, "web_search"

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 372
    new-instance v0, Landroid/content/Intent;

    const-string v1, "android.speech.action.RECOGNIZE_SPEECH"

    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->f:Landroid/content/Intent;

    .line 373
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->f:Landroid/content/Intent;

    invoke-virtual {v0, v7}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 375
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getDropDownAnchor()I

    move-result v0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->v:Landroid/view/View;

    .line 376
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->v:Landroid/view/View;

    if-eqz v0, :cond_3

    .line 377
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0xb

    if-lt v0, v1, :cond_4

    .line 4390
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->v:Landroid/view/View;

    new-instance v1, Laae;

    invoke-direct {v1, p0}, Laae;-><init>(Landroid/support/v7/widget/SearchView;)V

    invoke-virtual {v0, v1}, Landroid/view/View;->addOnLayoutChangeListener(Landroid/view/View$OnLayoutChangeListener;)V

    .line 384
    :cond_3
    :goto_0
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->z:Z

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->b(Z)V

    .line 385
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->c()V

    .line 386
    return-void

    .line 4400
    :cond_4
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->v:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getViewTreeObserver()Landroid/view/ViewTreeObserver;

    move-result-object v0

    new-instance v1, Laaf;

    invoke-direct {v1, p0}, Laaf;-><init>(Landroid/support/v7/widget/SearchView;)V

    invoke-virtual {v0, v1}, Landroid/view/ViewTreeObserver;->addOnGlobalLayoutListener(Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;)V

    goto :goto_0
.end method

.method private a(Landroid/database/Cursor;ILjava/lang/String;)Landroid/content/Intent;
    .locals 8

    .prologue
    const/4 v7, 0x0

    .line 1558
    :try_start_0
    const-string v0, "suggest_intent_action"

    invoke-static {p1, v0}, Laal;->a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 1560
    if-nez v1, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x8

    if-lt v0, v2, :cond_0

    .line 1561
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getSuggestIntentAction()Ljava/lang/String;

    move-result-object v1

    .line 1563
    :cond_0
    if-nez v1, :cond_1

    .line 1564
    const-string v1, "android.intent.action.SEARCH"

    .line 1568
    :cond_1
    const-string v0, "suggest_intent_data"

    invoke-static {p1, v0}, Laal;->a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 1569
    sget-boolean v2, Landroid/support/v7/widget/SearchView;->a:Z

    if-eqz v2, :cond_2

    if-nez v0, :cond_2

    .line 1570
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getSuggestIntentData()Ljava/lang/String;

    move-result-object v0

    .line 1573
    :cond_2
    if-eqz v0, :cond_3

    .line 1574
    const-string v2, "suggest_intent_data_id"

    invoke-static {p1, v2}, Laal;->a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 1575
    if-eqz v2, :cond_3

    .line 1576
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, "/"

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-static {v2}, Landroid/net/Uri;->encode(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1579
    :cond_3
    if-nez v0, :cond_4

    move-object v2, v7

    .line 1581
    :goto_0
    const-string v0, "suggest_intent_query"

    invoke-static {p1, v0}, Laal;->a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 1582
    const-string v0, "suggest_intent_extra_data"

    invoke-static {p1, v0}, Laal;->a(Landroid/database/Cursor;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object v0, p0

    move v5, p2

    move-object v6, p3

    .line 1584
    invoke-direct/range {v0 .. v6}, Landroid/support/v7/widget/SearchView;->a(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 1594
    :goto_1
    return-object v0

    .line 1579
    :cond_4
    invoke-static {v0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    move-result-object v2

    goto :goto_0

    .line 1585
    :catch_0
    move-exception v0

    move-object v1, v0

    .line 1588
    :try_start_1
    invoke-interface {p1}, Landroid/database/Cursor;->getPosition()I
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    move-result v0

    .line 1592
    :goto_2
    const-string v2, "SearchView"

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "Search suggestions cursor at row "

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v3, " returned exception."

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    move-object v0, v7

    .line 1594
    goto :goto_1

    .line 1590
    :catch_1
    move-exception v0

    const/4 v0, -0x1

    goto :goto_2
.end method

.method private a(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent;
    .locals 3

    .prologue
    .line 1434
    new-instance v0, Landroid/content/Intent;

    invoke-direct {v0, p1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 1435
    const/high16 v1, 0x10000000

    invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 1439
    if-eqz p2, :cond_0

    .line 1440
    invoke-virtual {v0, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 1442
    :cond_0
    const-string v1, "user_query"

    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->E:Ljava/lang/CharSequence;

    invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/CharSequence;)Landroid/content/Intent;

    .line 1443
    if-eqz p4, :cond_1

    .line 1444
    const-string v1, "query"

    invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1446
    :cond_1
    if-eqz p3, :cond_2

    .line 1447
    const-string v1, "intent_extra_data_key"

    invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1452
    :cond_2
    if-eqz p5, :cond_3

    .line 1453
    const-string v1, "action_key"

    invoke-virtual {v0, v1, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 1454
    const-string v1, "action_msg"

    invoke-virtual {v0, v1, p6}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 1456
    :cond_3
    sget-boolean v1, Landroid/support/v7/widget/SearchView;->a:Z

    if-eqz v1, :cond_4

    .line 1457
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 1459
    :cond_4
    return-object v0
.end method

.method private a(ILjava/lang/String;Ljava/lang/String;)V
    .locals 7

    .prologue
    const/4 v2, 0x0

    .line 1413
    const-string v1, "android.intent.action.SEARCH"

    move-object v0, p0

    move-object v3, v2

    move-object v4, p3

    move v5, p1

    move-object v6, p2

    .line 1414
    invoke-direct/range {v0 .. v6}, Landroid/support/v7/widget/SearchView;->a(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 1415
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 1416
    return-void
.end method

.method private a(Landroid/content/Intent;)V
    .locals 4

    .prologue
    .line 1391
    if-nez p1, :cond_0

    .line 1401
    :goto_0
    return-void

    .line 1397
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 1398
    :catch_0
    move-exception v0

    .line 1399
    const-string v1, "SearchView"

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Failed launch activity: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v1, v2, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method public static synthetic a(Landroid/support/v7/widget/SearchView;)V
    .locals 2

    .prologue
    .line 104
    .line 13896
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->hasFocus()Z

    move-result v0

    .line 13897
    if-eqz v0, :cond_2

    sget-object v0, Landroid/support/v7/widget/SearchView;->FOCUSED_STATE_SET:[I

    .line 13898
    :goto_0
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->p:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 13899
    if-eqz v1, :cond_0

    .line 13900
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 13902
    :cond_0
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->q:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 13903
    if-eqz v1, :cond_1

    .line 13904
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 13906
    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->invalidate()V

    .line 104
    return-void

    .line 13897
    :cond_2
    sget-object v0, Landroid/support/v7/widget/SearchView;->EMPTY_STATE_SET:[I

    goto :goto_0
.end method

.method public static synthetic a(Landroid/support/v7/widget/SearchView;ILjava/lang/String;Ljava/lang/String;)V
    .locals 2

    .prologue
    .line 104
    const/4 v0, 0x0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1, p3}, Landroid/support/v7/widget/SearchView;->a(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic a(Landroid/support/v7/widget/SearchView;Ljava/lang/CharSequence;)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 104
    .line 19135
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 19136
    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->E:Ljava/lang/CharSequence;

    .line 19137
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    move v0, v1

    .line 19138
    :goto_0
    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->c(Z)V

    .line 19139
    if-nez v0, :cond_1

    :goto_1
    invoke-direct {p0, v1}, Landroid/support/v7/widget/SearchView;->e(Z)V

    .line 19140
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->h()V

    .line 19141
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->g()V

    .line 19145
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Landroid/support/v7/widget/SearchView;->D:Ljava/lang/CharSequence;

    .line 104
    return-void

    :cond_0
    move v0, v2

    .line 19137
    goto :goto_0

    :cond_1
    move v1, v2

    .line 19139
    goto :goto_1
.end method

.method static synthetic a(Landroid/support/v7/widget/SearchView;Z)V
    .locals 1

    .prologue
    .line 104
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->d(Z)V

    return-void
.end method

.method private a(I)Z
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1290
    .line 11374
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->j:Lkj;

    .line 12194
    iget-object v0, v0, Lkj;->c:Landroid/database/Cursor;

    .line 11375
    if-eqz v0, :cond_0

    invoke-interface {v0, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 11377
    const/4 v1, 0x0

    invoke-direct {p0, v0, v2, v1}, Landroid/support/v7/widget/SearchView;->a(Landroid/database/Cursor;ILjava/lang/String;)Landroid/content/Intent;

    move-result-object v0

    .line 11380
    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->a(Landroid/content/Intent;)V

    .line 1291
    :cond_0
    invoke-direct {p0, v2}, Landroid/support/v7/widget/SearchView;->d(Z)V

    .line 13163
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->dismissDropDown()V

    .line 1293
    const/4 v0, 0x1

    return v0
.end method

.method private a(ILandroid/view/KeyEvent;)Z
    .locals 4

    .prologue
    const/16 v3, 0x15

    const/4 v2, 0x1

    const/4 v1, 0x0

    .line 1004
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    if-nez v0, :cond_1

    .line 1043
    :cond_0
    :goto_0
    return v1

    .line 1007
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->j:Lkj;

    if-eqz v0, :cond_0

    .line 1010
    invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I

    move-result v0

    if-nez v0, :cond_0

    invoke-static {p2}, Lfi;->a(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1013
    const/16 v0, 0x42

    if-eq p1, v0, :cond_2

    const/16 v0, 0x54

    if-eq p1, v0, :cond_2

    const/16 v0, 0x3d

    if-ne p1, v0, :cond_3

    .line 1015
    :cond_2
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getListSelection()I

    move-result v0

    .line 1016
    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->a(I)Z

    move-result v1

    goto :goto_0

    .line 1021
    :cond_3
    if-eq p1, v3, :cond_4

    const/16 v0, 0x16

    if-ne p1, v0, :cond_6

    .line 1026
    :cond_4
    if-ne p1, v3, :cond_5

    move v0, v1

    .line 1028
    :goto_1
    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v3, v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setSelection(I)V

    .line 1029
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setListSelection(I)V

    .line 1030
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->clearListSelection()V

    .line 1031
    sget-object v0, Landroid/support/v7/widget/SearchView;->m:Laaj;

    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, v1, v2}, Laaj;->a(Landroid/widget/AutoCompleteTextView;Z)V

    move v1, v2

    .line 1033
    goto :goto_0

    .line 1026
    :cond_5
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->length()I

    move-result v0

    goto :goto_1

    .line 1037
    :cond_6
    const/16 v0, 0x13

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getListSelection()I

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0
.end method

.method static a(Landroid/content/Context;)Z
    .locals 2

    .prologue
    .line 1604
    invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v0

    iget v0, v0, Landroid/content/res/Configuration;->orientation:I

    const/4 v1, 0x2

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public static synthetic a(Landroid/support/v7/widget/SearchView;I)Z
    .locals 3

    .prologue
    .line 104
    .line 17341
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 17342
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->j:Lkj;

    .line 18194
    iget-object v1, v1, Lkj;->c:Landroid/database/Cursor;

    .line 17343
    if-eqz v1, :cond_0

    .line 17346
    invoke-interface {v1, p1}, Landroid/database/Cursor;->moveToPosition(I)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 17348
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->j:Lkj;

    invoke-virtual {v2, v1}, Lkj;->b(Landroid/database/Cursor;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 17349
    if-eqz v1, :cond_1

    .line 17352
    invoke-virtual {p0, v1}, Landroid/support/v7/widget/SearchView;->a(Ljava/lang/CharSequence;)V

    .line 17302
    :cond_0
    :goto_0
    const/4 v0, 0x1

    .line 104
    return v0

    .line 17355
    :cond_1
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->a(Ljava/lang/CharSequence;)V

    goto :goto_0

    .line 17359
    :cond_2
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->a(Ljava/lang/CharSequence;)V

    goto :goto_0
.end method

.method public static synthetic a(Landroid/support/v7/widget/SearchView;IILjava/lang/String;)Z
    .locals 1

    .prologue
    .line 104
    invoke-direct {p0, p1}, Landroid/support/v7/widget/SearchView;->a(I)Z

    move-result v0

    return v0
.end method

.method public static synthetic a(Landroid/support/v7/widget/SearchView;Landroid/view/View;ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 104
    invoke-direct {p0, p2, p3}, Landroid/support/v7/widget/SearchView;->a(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0
.end method

.method public static synthetic b(Landroid/support/v7/widget/SearchView;)Lkj;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->j:Lkj;

    return-object v0
.end method

.method public static synthetic c(Landroid/support/v7/widget/SearchView;)Landroid/view/View$OnFocusChangeListener;
    .locals 1

    .prologue
    .line 104
    const/4 v0, 0x0

    return-object v0
.end method

.method private c(Z)V
    .locals 2

    .prologue
    .line 866
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->s:Landroid/widget/ImageView;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 867
    return-void
.end method

.method public static synthetic d(Landroid/support/v7/widget/SearchView;)V
    .locals 6

    .prologue
    .line 104
    .line 14264
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->v:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->getWidth()I

    move-result v0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 14265
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    .line 14266
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->p:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getPaddingLeft()I

    move-result v2

    .line 14267
    new-instance v3, Landroid/graphics/Rect;

    invoke-direct {v3}, Landroid/graphics/Rect;-><init>()V

    .line 14268
    invoke-static {p0}, Ltm;->a(Landroid/view/View;)Z

    move-result v1

    .line 14269
    iget-boolean v4, p0, Landroid/support/v7/widget/SearchView;->z:Z

    if-eqz v4, :cond_1

    sget v4, La;->ac:I

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    sget v5, La;->ad:I

    invoke-virtual {v0, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    add-int/2addr v0, v4

    .line 14273
    :goto_0
    iget-object v4, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v4}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getDropDownBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v4

    invoke-virtual {v4, v3}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 14275
    if-eqz v1, :cond_2

    .line 14276
    iget v1, v3, Landroid/graphics/Rect;->left:I

    neg-int v1, v1

    .line 14280
    :goto_1
    iget-object v4, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v4, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setDropDownHorizontalOffset(I)V

    .line 14281
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->v:Landroid/view/View;

    invoke-virtual {v1}, Landroid/view/View;->getWidth()I

    move-result v1

    iget v4, v3, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v4

    iget v3, v3, Landroid/graphics/Rect;->right:I

    add-int/2addr v1, v3

    add-int/2addr v0, v1

    sub-int/2addr v0, v2

    .line 14283
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v1, v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setDropDownWidth(I)V

    .line 104
    :cond_0
    return-void

    .line 14269
    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    .line 14278
    :cond_2
    iget v1, v3, Landroid/graphics/Rect;->left:I

    add-int/2addr v1, v0

    sub-int v1, v2, v1

    goto :goto_1
.end method

.method private d(Z)V
    .locals 3

    .prologue
    .line 917
    if-eqz p1, :cond_1

    .line 918
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->H:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->post(Ljava/lang/Runnable;)Z

    .line 928
    :cond_0
    :goto_0
    return-void

    .line 920
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->H:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 921
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "input_method"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/inputmethod/InputMethodManager;

    .line 924
    if-eqz v0, :cond_0

    .line 925
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    goto :goto_0
.end method

.method public static synthetic e(Landroid/support/v7/widget/SearchView;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->r:Landroid/widget/ImageView;

    return-object v0
.end method

.method private e(Z)V
    .locals 3

    .prologue
    const/16 v1, 0x8

    .line 1115
    .line 1116
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->k:Z

    if-eqz v0, :cond_0

    .line 8689
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->i:Z

    .line 1116
    if-nez v0, :cond_0

    if-eqz p1, :cond_0

    .line 1117
    const/4 v0, 0x0

    .line 1118
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->s:Landroid/widget/ImageView;

    invoke-virtual {v2, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1120
    :goto_0
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->u:Landroid/widget/ImageView;

    invoke-virtual {v1, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 1121
    return-void

    :cond_0
    move v0, v1

    goto :goto_0
.end method

.method private f()I
    .locals 2

    .prologue
    .line 818
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v1, La;->ae:I

    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    return v0
.end method

.method public static synthetic f(Landroid/support/v7/widget/SearchView;)V
    .locals 0

    .prologue
    .line 104
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->j()V

    return-void
.end method

.method public static synthetic g(Landroid/support/v7/widget/SearchView;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->t:Landroid/widget/ImageView;

    return-object v0
.end method

.method private g()V
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 870
    const/16 v0, 0x8

    .line 5857
    iget-boolean v2, p0, Landroid/support/v7/widget/SearchView;->k:Z

    if-eqz v2, :cond_2

    .line 6689
    iget-boolean v2, p0, Landroid/support/v7/widget/SearchView;->i:Z

    .line 5857
    if-nez v2, :cond_2

    const/4 v2, 0x1

    .line 871
    :goto_0
    if-eqz v2, :cond_1

    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->s:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getVisibility()I

    move-result v2

    if-eqz v2, :cond_0

    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->u:Landroid/widget/ImageView;

    invoke-virtual {v2}, Landroid/widget/ImageView;->getVisibility()I

    move-result v2

    if-nez v2, :cond_1

    :cond_0
    move v0, v1

    .line 876
    :cond_1
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->q:Landroid/view/View;

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 877
    return-void

    :cond_2
    move v2, v1

    .line 5857
    goto :goto_0
.end method

.method private h()V
    .locals 4

    .prologue
    const/4 v0, 0x1

    const/4 v1, 0x0

    .line 880
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v2}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    move v2, v0

    .line 883
    :goto_0
    if-nez v2, :cond_0

    iget-boolean v3, p0, Landroid/support/v7/widget/SearchView;->z:Z

    if-eqz v3, :cond_3

    iget-boolean v3, p0, Landroid/support/v7/widget/SearchView;->F:Z

    if-nez v3, :cond_3

    .line 884
    :cond_0
    :goto_1
    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->t:Landroid/widget/ImageView;

    if-eqz v0, :cond_4

    :goto_2
    invoke-virtual {v3, v1}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 885
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->t:Landroid/widget/ImageView;

    invoke-virtual {v0}, Landroid/widget/ImageView;->getDrawable()Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 886
    if-eqz v1, :cond_1

    .line 887
    if-eqz v2, :cond_5

    sget-object v0, Landroid/support/v7/widget/SearchView;->ENABLED_STATE_SET:[I

    :goto_3
    invoke-virtual {v1, v0}, Landroid/graphics/drawable/Drawable;->setState([I)Z

    .line 889
    :cond_1
    return-void

    :cond_2
    move v2, v1

    .line 880
    goto :goto_0

    :cond_3
    move v0, v1

    .line 883
    goto :goto_1

    .line 884
    :cond_4
    const/16 v1, 0x8

    goto :goto_2

    .line 887
    :cond_5
    sget-object v0, Landroid/support/v7/widget/SearchView;->EMPTY_STATE_SET:[I

    goto :goto_3
.end method

.method public static synthetic h(Landroid/support/v7/widget/SearchView;)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 104
    .line 15167
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 15168
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 15169
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->z:Z

    if-eqz v0, :cond_0

    .line 15173
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->clearFocus()V

    .line 15175
    invoke-virtual {p0, v2}, Landroid/support/v7/widget/SearchView;->b(Z)V

    :cond_0
    :goto_0
    return-void

    .line 15179
    :cond_1
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setText(Ljava/lang/CharSequence;)V

    .line 15180
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->requestFocus()Z

    .line 15181
    invoke-direct {p0, v2}, Landroid/support/v7/widget/SearchView;->d(Z)V

    goto :goto_0
.end method

.method public static synthetic i(Landroid/support/v7/widget/SearchView;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->s:Landroid/widget/ImageView;

    return-object v0
.end method

.method private i()V
    .locals 1

    .prologue
    .line 892
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->I:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->post(Ljava/lang/Runnable;)Z

    .line 893
    return-void
.end method

.method private j()V
    .locals 1

    .prologue
    .line 1187
    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->b(Z)V

    .line 1188
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->requestFocus()Z

    .line 1189
    const/4 v0, 0x1

    invoke-direct {p0, v0}, Landroid/support/v7/widget/SearchView;->d(Z)V

    .line 1193
    return-void
.end method

.method public static synthetic j(Landroid/support/v7/widget/SearchView;)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 104
    .line 16149
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 16150
    if-eqz v0, :cond_1

    invoke-static {v0}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v1

    if-lez v1, :cond_1

    .line 16153
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    if-eqz v1, :cond_0

    .line 16154
    const/4 v1, 0x0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v2, v1, v0}, Landroid/support/v7/widget/SearchView;->a(ILjava/lang/String;Ljava/lang/String;)V

    .line 16156
    :cond_0
    invoke-direct {p0, v2}, Landroid/support/v7/widget/SearchView;->d(Z)V

    .line 16163
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->dismissDropDown()V

    .line 104
    :cond_1
    return-void
.end method

.method public static synthetic k(Landroid/support/v7/widget/SearchView;)Landroid/widget/ImageView;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->u:Landroid/widget/ImageView;

    return-object v0
.end method

.method private k()V
    .locals 3

    .prologue
    .line 1599
    sget-object v0, Landroid/support/v7/widget/SearchView;->m:Laaj;

    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    .line 13780
    iget-object v2, v0, Laaj;->a:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_0

    .line 13782
    :try_start_0
    iget-object v0, v0, Laaj;->a:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 1600
    :cond_0
    :goto_0
    sget-object v0, Landroid/support/v7/widget/SearchView;->m:Laaj;

    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    .line 13789
    iget-object v2, v0, Laaj;->b:Ljava/lang/reflect/Method;

    if-eqz v2, :cond_1

    .line 13791
    :try_start_1
    iget-object v0, v0, Laaj;->b:Ljava/lang/reflect/Method;

    const/4 v2, 0x0

    new-array v2, v2, [Ljava/lang/Object;

    invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 13793
    :cond_1
    :goto_1
    return-void

    :catch_0
    move-exception v0

    goto :goto_1

    :catch_1
    move-exception v0

    goto :goto_0
.end method

.method public static synthetic l(Landroid/support/v7/widget/SearchView;)V
    .locals 11

    .prologue
    const/4 v0, 0x0

    .line 104
    .line 16198
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    if-eqz v1, :cond_0

    .line 16201
    iget-object v5, p0, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    .line 16203
    :try_start_0
    invoke-virtual {v5}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchWebSearch()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 16204
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->e:Landroid/content/Intent;

    .line 16467
    new-instance v2, Landroid/content/Intent;

    invoke-direct {v2, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 16468
    invoke-virtual {v5}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    move-result-object v1

    .line 16469
    const-string v3, "calling_package"

    if-nez v1, :cond_1

    :goto_0
    invoke-virtual {v2, v3, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 16206
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 16216
    :cond_0
    :goto_1
    return-void

    .line 16469
    :cond_1
    invoke-virtual {v1}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    .line 16207
    :cond_2
    invoke-virtual {v5}, Landroid/app/SearchableInfo;->getVoiceSearchLaunchRecognizer()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 16208
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->f:Landroid/content/Intent;

    .line 16483
    invoke-virtual {v5}, Landroid/app/SearchableInfo;->getSearchActivity()Landroid/content/ComponentName;

    move-result-object v6

    .line 16488
    new-instance v2, Landroid/content/Intent;

    const-string v3, "android.intent.action.SEARCH"

    invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 16489
    invoke-virtual {v2, v6}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;

    .line 16490
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v3

    const/4 v4, 0x0

    const/high16 v7, 0x40000000    # 2.0f

    invoke-static {v3, v4, v2, v7}, Landroid/app/PendingIntent;->getActivity(Landroid/content/Context;ILandroid/content/Intent;I)Landroid/app/PendingIntent;

    move-result-object v7

    .line 16497
    new-instance v8, Landroid/os/Bundle;

    invoke-direct {v8}, Landroid/os/Bundle;-><init>()V

    .line 16505
    new-instance v9, Landroid/content/Intent;

    invoke-direct {v9, v1}, Landroid/content/Intent;-><init>(Landroid/content/Intent;)V

    .line 16508
    const-string v2, "free_form"

    .line 16511
    const/4 v1, 0x1

    .line 16513
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v4, 0x8

    if-lt v3, v4, :cond_8

    .line 16514
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    .line 16515
    invoke-virtual {v5}, Landroid/app/SearchableInfo;->getVoiceLanguageModeId()I

    move-result v3

    if-eqz v3, :cond_7

    .line 16516
    invoke-virtual {v5}, Landroid/app/SearchableInfo;->getVoiceLanguageModeId()I

    move-result v2

    invoke-virtual {v10, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v4

    .line 16518
    :goto_2
    invoke-virtual {v5}, Landroid/app/SearchableInfo;->getVoicePromptTextId()I

    move-result v2

    if-eqz v2, :cond_6

    .line 16519
    invoke-virtual {v5}, Landroid/app/SearchableInfo;->getVoicePromptTextId()I

    move-result v2

    invoke-virtual {v10, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v3

    .line 16521
    :goto_3
    invoke-virtual {v5}, Landroid/app/SearchableInfo;->getVoiceLanguageId()I

    move-result v2

    if-eqz v2, :cond_5

    .line 16522
    invoke-virtual {v5}, Landroid/app/SearchableInfo;->getVoiceLanguageId()I

    move-result v2

    invoke-virtual {v10, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v2

    .line 16524
    :goto_4
    invoke-virtual {v5}, Landroid/app/SearchableInfo;->getVoiceMaxResults()I

    move-result v10

    if-eqz v10, :cond_3

    .line 16525
    invoke-virtual {v5}, Landroid/app/SearchableInfo;->getVoiceMaxResults()I

    move-result v1

    .line 16528
    :cond_3
    :goto_5
    const-string v5, "android.speech.extra.LANGUAGE_MODEL"

    invoke-virtual {v9, v5, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 16529
    const-string v4, "android.speech.extra.PROMPT"

    invoke-virtual {v9, v4, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 16530
    const-string v3, "android.speech.extra.LANGUAGE"

    invoke-virtual {v9, v3, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 16531
    const-string v2, "android.speech.extra.MAX_RESULTS"

    invoke-virtual {v9, v2, v1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    .line 16532
    const-string v1, "calling_package"

    if-nez v6, :cond_4

    :goto_6
    invoke-virtual {v9, v1, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 16536
    const-string v0, "android.speech.extra.RESULTS_PENDINGINTENT"

    invoke-virtual {v9, v0, v7}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 16537
    const-string v0, "android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE"

    invoke-virtual {v9, v0, v8}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Bundle;)Landroid/content/Intent;

    .line 16210
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0, v9}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
    :try_end_0
    .catch Landroid/content/ActivityNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_1

    .line 16215
    :catch_0
    move-exception v0

    const-string v0, "SearchView"

    const-string v1, "Could not find voice search activity"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    goto/16 :goto_1

    .line 16532
    :cond_4
    :try_start_1
    invoke-virtual {v6}, Landroid/content/ComponentName;->flattenToShortString()Ljava/lang/String;
    :try_end_1
    .catch Landroid/content/ActivityNotFoundException; {:try_start_1 .. :try_end_1} :catch_0

    move-result-object v0

    goto :goto_6

    :cond_5
    move-object v2, v0

    goto :goto_4

    :cond_6
    move-object v3, v0

    goto :goto_3

    :cond_7
    move-object v4, v2

    goto :goto_2

    :cond_8
    move-object v3, v0

    move-object v4, v2

    move-object v2, v0

    goto :goto_5
.end method

.method public static synthetic m(Landroid/support/v7/widget/SearchView;)Landroid/support/v7/widget/SearchView$SearchAutoComplete;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    return-object v0
.end method

.method public static synthetic n(Landroid/support/v7/widget/SearchView;)V
    .locals 0

    .prologue
    .line 104
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->k()V

    return-void
.end method

.method public static synthetic o(Landroid/support/v7/widget/SearchView;)Landroid/app/SearchableInfo;
    .locals 1

    .prologue
    .line 104
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    return-object v0
.end method


# virtual methods
.method public final a()V
    .locals 3

    .prologue
    .line 1253
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->F:Z

    if-eqz v0, :cond_0

    .line 1260
    :goto_0
    return-void

    .line 1255
    :cond_0
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/SearchView;->F:Z

    .line 1256
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getImeOptions()I

    move-result v0

    iput v0, p0, Landroid/support/v7/widget/SearchView;->G:I

    .line 1257
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget v1, p0, Landroid/support/v7/widget/SearchView;->G:I

    const/high16 v2, 0x2000000

    or-int/2addr v1, v2

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setImeOptions(I)V

    .line 1258
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    const-string v1, ""

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setText(Ljava/lang/CharSequence;)V

    .line 10678
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->j()V

    goto :goto_0
.end method

.method public a(Ljava/lang/CharSequence;)V
    .locals 2

    .prologue
    .line 1407
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setText(Ljava/lang/CharSequence;)V

    .line 1409
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    :goto_0
    invoke-virtual {v1, v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setSelection(I)V

    .line 1410
    return-void

    .line 1409
    :cond_0
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v0

    goto :goto_0
.end method

.method public final a(Ljava/lang/CharSequence;Z)V
    .locals 2

    .prologue
    .line 586
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0, p1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setText(Ljava/lang/CharSequence;)V

    .line 587
    if-eqz p1, :cond_0

    .line 588
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->length()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setSelection(I)V

    .line 589
    iput-object p1, p0, Landroid/support/v7/widget/SearchView;->E:Ljava/lang/CharSequence;

    .line 596
    :cond_0
    return-void
.end method

.method public final a(Z)V
    .locals 1

    .prologue
    .line 650
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->z:Z

    if-ne v0, p1, :cond_0

    .line 654
    :goto_0
    return-void

    .line 651
    :cond_0
    iput-boolean p1, p0, Landroid/support/v7/widget/SearchView;->z:Z

    .line 652
    invoke-virtual {p0, p1}, Landroid/support/v7/widget/SearchView;->b(Z)V

    .line 653
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->c()V

    goto :goto_0
.end method

.method public final b()V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 1241
    const-string v0, ""

    invoke-virtual {p0, v0, v2}, Landroid/support/v7/widget/SearchView;->a(Ljava/lang/CharSequence;Z)V

    .line 1242
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->clearFocus()V

    .line 1243
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->b(Z)V

    .line 1244
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    iget v1, p0, Landroid/support/v7/widget/SearchView;->G:I

    invoke-virtual {v0, v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setImeOptions(I)V

    .line 1245
    iput-boolean v2, p0, Landroid/support/v7/widget/SearchView;->F:Z

    .line 1246
    return-void
.end method

.method public b(Z)V
    .locals 6

    .prologue
    const/4 v4, 0x1

    const/16 v2, 0x8

    const/4 v1, 0x0

    .line 823
    iput-boolean p1, p0, Landroid/support/v7/widget/SearchView;->i:Z

    .line 825
    if-eqz p1, :cond_0

    move v0, v1

    .line 827
    :goto_0
    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v3}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-static {v3}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    move v3, v4

    .line 829
    :goto_1
    iget-object v5, p0, Landroid/support/v7/widget/SearchView;->r:Landroid/widget/ImageView;

    invoke-virtual {v5, v0}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 830
    invoke-direct {p0, v3}, Landroid/support/v7/widget/SearchView;->c(Z)V

    .line 831
    iget-object v5, p0, Landroid/support/v7/widget/SearchView;->o:Landroid/view/View;

    if-eqz p1, :cond_2

    move v0, v2

    :goto_2
    invoke-virtual {v5, v0}, Landroid/view/View;->setVisibility(I)V

    .line 832
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->w:Landroid/widget/ImageView;

    iget-boolean v5, p0, Landroid/support/v7/widget/SearchView;->z:Z

    if-eqz v5, :cond_3

    :goto_3
    invoke-virtual {v0, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 833
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->h()V

    .line 834
    if-nez v3, :cond_4

    :goto_4
    invoke-direct {p0, v4}, Landroid/support/v7/widget/SearchView;->e(Z)V

    .line 835
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->g()V

    .line 836
    return-void

    :cond_0
    move v0, v2

    .line 825
    goto :goto_0

    :cond_1
    move v3, v1

    .line 827
    goto :goto_1

    :cond_2
    move v0, v1

    .line 831
    goto :goto_2

    :cond_3
    move v2, v1

    .line 832
    goto :goto_3

    :cond_4
    move v4, v1

    .line 834
    goto :goto_4
.end method

.method public c()V
    .locals 9

    .prologue
    const/4 v8, 0x0

    .line 1063
    .line 7629
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->A:Ljava/lang/CharSequence;

    if-eqz v0, :cond_2

    .line 7630
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->A:Ljava/lang/CharSequence;

    .line 1064
    :goto_0
    iget-object v2, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    if-nez v0, :cond_0

    const-string v0, ""

    .line 8049
    :cond_0
    iget-boolean v1, p0, Landroid/support/v7/widget/SearchView;->z:Z

    if-eqz v1, :cond_1

    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->x:Landroid/graphics/drawable/Drawable;

    if-nez v1, :cond_4

    .line 1064
    :cond_1
    :goto_1
    invoke-virtual {v2, v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->setHint(Ljava/lang/CharSequence;)V

    .line 1065
    return-void

    .line 7631
    :cond_2
    sget-boolean v0, Landroid/support/v7/widget/SearchView;->a:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    if-eqz v0, :cond_3

    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    invoke-virtual {v0}, Landroid/app/SearchableInfo;->getHintId()I

    move-result v0

    if-eqz v0, :cond_3

    .line 7632
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->getContext()Landroid/content/Context;

    move-result-object v0

    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->l:Landroid/app/SearchableInfo;

    invoke-virtual {v1}, Landroid/app/SearchableInfo;->getHintId()I

    move-result v1

    invoke-virtual {v0, v1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;

    move-result-object v0

    goto :goto_0

    .line 7634
    :cond_3
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->y:Ljava/lang/CharSequence;

    goto :goto_0

    .line 8053
    :cond_4
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v1}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->getTextSize()F

    move-result v1

    float-to-double v4, v1

    const-wide/high16 v6, 0x3ff4000000000000L    # 1.25

    mul-double/2addr v4, v6

    double-to-int v1, v4

    .line 8054
    iget-object v3, p0, Landroid/support/v7/widget/SearchView;->x:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v3, v8, v8, v1, v1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 8056
    new-instance v1, Landroid/text/SpannableStringBuilder;

    const-string v3, "   "

    invoke-direct {v1, v3}, Landroid/text/SpannableStringBuilder;-><init>(Ljava/lang/CharSequence;)V

    .line 8057
    new-instance v3, Landroid/text/style/ImageSpan;

    iget-object v4, p0, Landroid/support/v7/widget/SearchView;->x:Landroid/graphics/drawable/Drawable;

    invoke-direct {v3, v4}, Landroid/text/style/ImageSpan;-><init>(Landroid/graphics/drawable/Drawable;)V

    const/4 v4, 0x1

    const/4 v5, 0x2

    const/16 v6, 0x21

    invoke-virtual {v1, v3, v4, v5, v6}, Landroid/text/SpannableStringBuilder;->setSpan(Ljava/lang/Object;III)V

    .line 8058
    invoke-virtual {v1, v0}, Landroid/text/SpannableStringBuilder;->append(Ljava/lang/CharSequence;)Landroid/text/SpannableStringBuilder;

    move-object v0, v1

    .line 8059
    goto :goto_1
.end method

.method public clearFocus()V
    .locals 2

    .prologue
    const/4 v1, 0x0

    .line 512
    const/4 v0, 0x1

    iput-boolean v0, p0, Landroid/support/v7/widget/SearchView;->B:Z

    .line 513
    invoke-direct {p0, v1}, Landroid/support/v7/widget/SearchView;->d(Z)V

    .line 514
    invoke-super {p0}, Lxu;->clearFocus()V

    .line 515
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->clearFocus()V

    .line 516
    iput-boolean v1, p0, Landroid/support/v7/widget/SearchView;->B:Z

    .line 517
    return-void
.end method

.method final e()V
    .locals 1

    .prologue
    .line 1220
    .line 9689
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->i:Z

    .line 1220
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->b(Z)V

    .line 1223
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->i()V

    .line 1224
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v0}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1225
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->k()V

    .line 1227
    :cond_0
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 911
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->I:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 912
    iget-object v0, p0, Landroid/support/v7/widget/SearchView;->J:Ljava/lang/Runnable;

    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->post(Ljava/lang/Runnable;)Z

    .line 913
    invoke-super {p0}, Lxu;->onDetachedFromWindow()V

    .line 914
    return-void
.end method

.method protected onMeasure(II)V
    .locals 2

    .prologue
    .line 785
    .line 5689
    iget-boolean v0, p0, Landroid/support/v7/widget/SearchView;->i:Z

    .line 785
    if-eqz v0, :cond_0

    .line 786
    invoke-super {p0, p1, p2}, Lxu;->onMeasure(II)V

    .line 815
    :goto_0
    return-void

    .line 790
    :cond_0
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    move-result v1

    .line 791
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v0

    .line 793
    sparse-switch v1, :sswitch_data_0

    .line 814
    :cond_1
    :goto_1
    const/high16 v1, 0x40000000    # 2.0f

    invoke-static {v0, v1}, Landroid/view/View$MeasureSpec;->makeMeasureSpec(II)I

    move-result v0

    invoke-super {p0, v0, p2}, Lxu;->onMeasure(II)V

    goto :goto_0

    .line 796
    :sswitch_0
    iget v1, p0, Landroid/support/v7/widget/SearchView;->C:I

    if-lez v1, :cond_2

    .line 797
    iget v1, p0, Landroid/support/v7/widget/SearchView;->C:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_1

    .line 799
    :cond_2
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->f()I

    move-result v1

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_1

    .line 804
    :sswitch_1
    iget v1, p0, Landroid/support/v7/widget/SearchView;->C:I

    if-lez v1, :cond_1

    .line 805
    iget v1, p0, Landroid/support/v7/widget/SearchView;->C:I

    invoke-static {v1, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    goto :goto_1

    .line 810
    :sswitch_2
    iget v0, p0, Landroid/support/v7/widget/SearchView;->C:I

    if-lez v0, :cond_3

    iget v0, p0, Landroid/support/v7/widget/SearchView;->C:I

    goto :goto_1

    :cond_3
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->f()I

    move-result v0

    goto :goto_1

    .line 793
    :sswitch_data_0
    .sparse-switch
        -0x80000000 -> :sswitch_0
        0x0 -> :sswitch_2
        0x40000000 -> :sswitch_1
    .end sparse-switch
.end method

.method public onWindowFocusChanged(Z)V
    .locals 0

    .prologue
    .line 1231
    invoke-super {p0, p1}, Lxu;->onWindowFocusChanged(Z)V

    .line 1233
    invoke-direct {p0}, Landroid/support/v7/widget/SearchView;->i()V

    .line 1234
    return-void
.end method

.method public requestFocus(ILandroid/graphics/Rect;)Z
    .locals 2

    .prologue
    const/4 v0, 0x0

    .line 494
    iget-boolean v1, p0, Landroid/support/v7/widget/SearchView;->B:Z

    if-eqz v1, :cond_1

    .line 505
    :cond_0
    :goto_0
    return v0

    .line 496
    :cond_1
    invoke-virtual {p0}, Landroid/support/v7/widget/SearchView;->isFocusable()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 4689
    iget-boolean v1, p0, Landroid/support/v7/widget/SearchView;->i:Z

    .line 498
    if-nez v1, :cond_3

    .line 499
    iget-object v1, p0, Landroid/support/v7/widget/SearchView;->b:Landroid/support/v7/widget/SearchView$SearchAutoComplete;

    invoke-virtual {v1, p1, p2}, Landroid/support/v7/widget/SearchView$SearchAutoComplete;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result v1

    .line 500
    if-eqz v1, :cond_2

    .line 501
    invoke-virtual {p0, v0}, Landroid/support/v7/widget/SearchView;->b(Z)V

    :cond_2
    move v0, v1

    .line 503
    goto :goto_0

    .line 505
    :cond_3
    invoke-super {p0, p1, p2}, Lxu;->requestFocus(ILandroid/graphics/Rect;)Z

    move-result v0

    goto :goto_0
.end method
