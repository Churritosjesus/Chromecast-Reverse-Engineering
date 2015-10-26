.class public Lacb;
.super Landroid/widget/MultiAutoCompleteTextView;
.source "PG"

# interfaces
.implements Labo;
.implements Labp;
.implements Labz;
.implements Landroid/view/ActionMode$Callback;
.implements Landroid/view/GestureDetector$OnGestureListener;
.implements Landroid/widget/AdapterView$OnItemClickListener;
.implements Landroid/widget/TextView$OnEditorActionListener;


# static fields
.field private static final d:Ljava/lang/String;

.field private static final e:Ljava/util/regex/Pattern;

.field private static final f:I


# instance fields
.field private A:Labj;

.field private B:Landroid/view/View;

.field private C:Landroid/widget/ListPopupWindow;

.field private D:Landroid/widget/ListPopupWindow;

.field private E:Landroid/widget/AdapterView$OnItemClickListener;

.field private F:Lada;

.field private G:Landroid/graphics/Bitmap;

.field private H:Ladc;

.field private I:Landroid/widget/TextView;

.field private J:I

.field private K:Ljava/util/ArrayList;

.field private L:I

.field private M:I

.field private N:Z

.field private O:Z

.field private P:Ljava/util/ArrayList;

.field private Q:Ljava/util/ArrayList;

.field private R:Landroid/view/GestureDetector;

.field private S:Z

.field private T:Z

.field private U:Z

.field private final V:Ljava/lang/Runnable;

.field private W:Lacp;

.field final a:[I

.field private aa:Ljava/lang/Runnable;

.field private ab:Ljava/lang/Runnable;

.field b:Z

.field c:Landroid/widget/ScrollView;

.field private g:I

.field private h:I

.field private final i:Landroid/graphics/Rect;

.field private j:Landroid/graphics/drawable/Drawable;

.field private k:Landroid/graphics/drawable/Drawable;

.field private l:Landroid/graphics/drawable/Drawable;

.field private m:F

.field private n:F

.field private o:F

.field private p:I

.field private q:I

.field private final r:I

.field private s:Z

.field private t:I

.field private u:I

.field private v:Landroid/graphics/Paint;

.field private w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

.field private x:Landroid/widget/AutoCompleteTextView$Validator;

.field private y:Landroid/os/Handler;

.field private z:Landroid/text/TextWatcher;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 122
    const-string v0, ","

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v0, " "

    .line 123
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    :goto_0
    sput-object v0, Lacb;->d:Ljava/lang/String;

    .line 127
    const-string v0, "(\\+[0-9]+[\\- \\.]*)?(1?[ ]*\\([0-9]+\\)[\\- \\.]*)?([0-9][0-9\\- \\.][0-9\\- \\.]+[0-9])"

    .line 128
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lacb;->e:Ljava/util/regex/Pattern;

    .line 133
    const-string v0, "dismiss"

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    sput v0, Lacb;->f:I

    return-void

    .line 123
    :cond_0
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 9

    .prologue
    const/high16 v8, -0x40800000    # -1.0f

    const/4 v7, 0x0

    const/4 v6, 0x1

    const/4 v5, -0x1

    const/4 v4, 0x0

    .line 284
    invoke-direct {p0, p1, p2}, Landroid/widget/MultiAutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 146
    new-instance v0, Landroid/graphics/Rect;

    invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V

    iput-object v0, p0, Lacb;->i:Landroid/graphics/Rect;

    .line 147
    const/4 v0, 0x2

    new-array v0, v0, [I

    iput-object v0, p0, Lacb;->a:[I

    .line 150
    iput-object v7, p0, Lacb;->j:Landroid/graphics/drawable/Drawable;

    .line 151
    iput-object v7, p0, Lacb;->k:Landroid/graphics/drawable/Drawable;

    .line 172
    new-instance v0, Landroid/graphics/Paint;

    invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V

    iput-object v0, p0, Lacb;->v:Landroid/graphics/Paint;

    .line 180
    iput-object p0, p0, Lacb;->B:Landroid/view/View;

    .line 194
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lacb;->K:Ljava/util/ArrayList;

    .line 196
    iput v4, p0, Lacb;->L:I

    .line 198
    iput-boolean v4, p0, Lacb;->N:Z

    .line 199
    iput-boolean v6, p0, Lacb;->b:Z

    .line 200
    iput-boolean v4, p0, Lacb;->O:Z

    .line 214
    iput-boolean v4, p0, Lacb;->T:Z

    .line 218
    new-instance v0, Lacc;

    invoke-direct {v0, p0}, Lacc;-><init>(Lacb;)V

    iput-object v0, p0, Lacb;->V:Ljava/lang/Runnable;

    .line 230
    new-instance v0, Lacf;

    invoke-direct {v0, p0}, Lacf;-><init>(Lacb;)V

    iput-object v0, p0, Lacb;->aa:Ljava/lang/Runnable;

    .line 239
    new-instance v0, Lacg;

    invoke-direct {v0, p0}, Lacg;-><init>(Lacb;)V

    iput-object v0, p0, Lacb;->ab:Ljava/lang/Runnable;

    .line 4001
    sget-object v0, Labx;->a:[I

    invoke-virtual {p1, p2, v0, v4, v4}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[III)Landroid/content/res/TypedArray;

    move-result-object v1

    .line 4003
    invoke-virtual {p0}, Lacb;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    .line 4005
    sget v0, Labx;->c:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lacb;->j:Landroid/graphics/drawable/Drawable;

    .line 4006
    sget v0, Labx;->i:I

    .line 4007
    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lacb;->l:Landroid/graphics/drawable/Drawable;

    .line 4008
    sget v0, Labx;->d:I

    invoke-virtual {v1, v0}, Landroid/content/res/TypedArray;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lacb;->k:Landroid/graphics/drawable/Drawable;

    .line 4009
    iget-object v0, p0, Lacb;->k:Landroid/graphics/drawable/Drawable;

    if-nez v0, :cond_0

    .line 4010
    sget v0, La;->cE:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    iput-object v0, p0, Lacb;->k:Landroid/graphics/drawable/Drawable;

    .line 4012
    :cond_0
    sget v0, Labx;->g:I

    .line 4013
    invoke-virtual {v1, v0, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    iput v0, p0, Lacb;->q:I

    iput v0, p0, Lacb;->p:I

    .line 4014
    iget v0, p0, Lacb;->p:I

    if-ne v0, v5, :cond_1

    .line 4015
    sget v0, La;->cy:I

    .line 4016
    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    iput v0, p0, Lacb;->q:I

    iput v0, p0, Lacb;->p:I

    .line 4020
    :cond_1
    sget v0, La;->cA:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    .line 4021
    if-ltz v0, :cond_2

    .line 4022
    iput v0, p0, Lacb;->p:I

    .line 4024
    :cond_2
    sget v0, La;->cz:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    float-to-int v0, v0

    .line 4025
    if-ltz v0, :cond_3

    .line 4026
    iput v0, p0, Lacb;->q:I

    .line 4029
    :cond_3
    sget v0, La;->cF:I

    invoke-static {v2, v0}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    move-result-object v0

    iput-object v0, p0, Lacb;->G:Landroid/graphics/Bitmap;

    .line 4031
    invoke-virtual {p0}, Lacb;->getContext()Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v0

    sget v3, La;->cP:I

    invoke-virtual {v0, v3, v7}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, p0, Lacb;->I:Landroid/widget/TextView;

    .line 4033
    sget v0, Labx;->f:I

    invoke-virtual {v1, v0, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lacb;->m:F

    .line 4034
    iget v0, p0, Lacb;->m:F

    cmpl-float v0, v0, v8

    if-nez v0, :cond_4

    .line 4035
    sget v0, La;->cx:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lacb;->m:F

    .line 4037
    :cond_4
    sget v0, Labx;->e:I

    invoke-virtual {v1, v0, v5}, Landroid/content/res/TypedArray;->getDimensionPixelSize(II)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lacb;->n:F

    .line 4038
    iget v0, p0, Lacb;->n:F

    cmpl-float v0, v0, v8

    if-nez v0, :cond_5

    .line 4039
    sget v0, La;->cB:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDimension(I)F

    move-result v0

    iput v0, p0, Lacb;->n:F

    .line 4041
    :cond_5
    sget v0, Labx;->b:I

    .line 4042
    invoke-virtual {v1, v0, v6}, Landroid/content/res/TypedArray;->getInt(II)I

    move-result v0

    iput v0, p0, Lacb;->u:I

    .line 4043
    sget v0, Labx;->h:I

    invoke-virtual {v1, v0, v4}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    move-result v0

    iput-boolean v0, p0, Lacb;->s:Z

    .line 4045
    sget v0, La;->cM:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getInteger(I)I

    move-result v0

    iput v0, p0, Lacb;->t:I

    .line 4046
    sget v0, La;->cD:I

    invoke-virtual {v2, v0}, Landroid/content/res/Resources;->getDimensionPixelOffset(I)I

    move-result v0

    int-to-float v0, v0

    iput v0, p0, Lacb;->o:F

    .line 4048
    sget v0, Labx;->k:I

    const v3, 0x106000c

    .line 4050
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v3

    .line 4048
    invoke-virtual {v1, v0, v3}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lacb;->g:I

    .line 4052
    sget v0, Labx;->j:I

    sget v3, La;->cu:I

    .line 4054
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    move-result v2

    .line 4052
    invoke-virtual {v1, v0, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    move-result v0

    iput v0, p0, Lacb;->h:I

    .line 4056
    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 4335
    invoke-virtual {p0}, Lacb;->getPaint()Landroid/text/TextPaint;

    move-result-object v0

    .line 4337
    iget-object v1, p0, Lacb;->i:Landroid/graphics/Rect;

    invoke-virtual {v1}, Landroid/graphics/Rect;->setEmpty()V

    .line 4340
    const-string v1, "a"

    iget-object v2, p0, Lacb;->i:Landroid/graphics/Rect;

    invoke-virtual {v0, v1, v4, v6, v2}, Landroid/text/TextPaint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V

    .line 4342
    iget-object v0, p0, Lacb;->i:Landroid/graphics/Rect;

    iput v4, v0, Landroid/graphics/Rect;->left:I

    .line 4343
    iget-object v0, p0, Lacb;->i:Landroid/graphics/Rect;

    iput v4, v0, Landroid/graphics/Rect;->right:I

    .line 4345
    iget-object v0, p0, Lacb;->i:Landroid/graphics/Rect;

    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    move-result v0

    .line 286
    iput v0, p0, Lacb;->r:I

    .line 287
    new-instance v0, Landroid/widget/ListPopupWindow;

    invoke-direct {v0, p1}, Landroid/widget/ListPopupWindow;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lacb;->C:Landroid/widget/ListPopupWindow;

    .line 288
    iget-object v0, p0, Lacb;->C:Landroid/widget/ListPopupWindow;

    invoke-direct {p0, v0}, Lacb;->a(Landroid/widget/ListPopupWindow;)V

    .line 289
    new-instance v0, Landroid/widget/ListPopupWindow;

    invoke-direct {v0, p1}, Landroid/widget/ListPopupWindow;-><init>(Landroid/content/Context;)V

    iput-object v0, p0, Lacb;->D:Landroid/widget/ListPopupWindow;

    .line 290
    iget-object v0, p0, Lacb;->D:Landroid/widget/ListPopupWindow;

    invoke-direct {p0, v0}, Lacb;->a(Landroid/widget/ListPopupWindow;)V

    .line 291
    new-instance v0, Lach;

    invoke-direct {v0, p0}, Lach;-><init>(Lacb;)V

    iput-object v0, p0, Lacb;->E:Landroid/widget/AdapterView$OnItemClickListener;

    .line 304
    invoke-virtual {p0}, Lacb;->getInputType()I

    move-result v0

    const/high16 v1, 0x80000

    or-int/2addr v0, v1

    invoke-virtual {p0, v0}, Lacb;->setInputType(I)V

    .line 305
    invoke-virtual {p0, p0}, Lacb;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 306
    invoke-virtual {p0, p0}, Lacb;->setCustomSelectionActionModeCallback(Landroid/view/ActionMode$Callback;)V

    .line 307
    new-instance v0, Laci;

    invoke-direct {v0, p0}, Laci;-><init>(Lacb;)V

    iput-object v0, p0, Lacb;->y:Landroid/os/Handler;

    .line 317
    new-instance v0, Lacw;

    .line 4463
    invoke-direct {v0, p0}, Lacw;-><init>(Lacb;)V

    .line 317
    iput-object v0, p0, Lacb;->z:Landroid/text/TextWatcher;

    .line 318
    iget-object v0, p0, Lacb;->z:Landroid/text/TextWatcher;

    invoke-virtual {p0, v0}, Lacb;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 319
    new-instance v0, Landroid/view/GestureDetector;

    invoke-direct {v0, p1, p0}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object v0, p0, Lacb;->R:Landroid/view/GestureDetector;

    .line 320
    invoke-virtual {p0, p0}, Lacb;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 322
    new-instance v0, Labj;

    invoke-static {p1}, Landroid/view/LayoutInflater;->from(Landroid/content/Context;)Landroid/view/LayoutInflater;

    move-result-object v1

    invoke-direct {v0, v1, p1}, Labj;-><init>(Landroid/view/LayoutInflater;Landroid/content/Context;)V

    .line 5349
    iput-object v0, p0, Lacb;->A:Labj;

    .line 5350
    iget-object v0, p0, Lacb;->A:Labj;

    .line 6082
    iput-object p0, v0, Labj;->a:Labo;

    .line 5351
    iget-object v0, p0, Lacb;->A:Labj;

    .line 6086
    iput-object p0, v0, Labj;->b:Labp;

    .line 323
    return-void
.end method

.method private a(FF)I
    .locals 7

    .prologue
    const/16 v6, 0x20

    const/4 v4, 0x0

    const/4 v1, -0x1

    .line 1815
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0xe

    if-lt v0, v2, :cond_0

    .line 1816
    invoke-virtual {p0, p1, p2}, Lacb;->getOffsetForPosition(FF)I

    move-result v0

    .line 36829
    :goto_0
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v4

    .line 36830
    invoke-interface {v4}, Landroid/text/Editable;->length()I

    move-result v3

    .line 36833
    add-int/lit8 v2, v3, -0x1

    :goto_1
    if-ltz v2, :cond_2

    .line 36834
    invoke-interface {v4, v2}, Landroid/text/Editable;->charAt(I)C

    move-result v5

    if-ne v5, v6, :cond_2

    .line 36835
    add-int/lit8 v3, v3, -0x1

    .line 36833
    add-int/lit8 v2, v2, -0x1

    goto :goto_1

    .line 34993
    :cond_0
    invoke-virtual {p0}, Lacb;->getLayout()Landroid/text/Layout;

    move-result-object v0

    if-nez v0, :cond_1

    move v0, v1

    goto :goto_0

    .line 35008
    :cond_1
    invoke-virtual {p0}, Lacb;->getTotalPaddingLeft()I

    move-result v0

    int-to-float v0, v0

    sub-float v0, p2, v0

    .line 35010
    invoke-static {v4, v0}, Ljava/lang/Math;->max(FF)F

    move-result v0

    .line 35011
    invoke-virtual {p0}, Lacb;->getHeight()I

    move-result v2

    invoke-virtual {p0}, Lacb;->getTotalPaddingBottom()I

    move-result v3

    sub-int/2addr v2, v3

    add-int/lit8 v2, v2, -0x1

    int-to-float v2, v2

    invoke-static {v2, v0}, Ljava/lang/Math;->min(FF)F

    move-result v0

    .line 35012
    invoke-virtual {p0}, Lacb;->getScrollY()I

    move-result v2

    int-to-float v2, v2

    add-float/2addr v0, v2

    .line 35013
    invoke-virtual {p0}, Lacb;->getLayout()Landroid/text/Layout;

    move-result-object v2

    float-to-int v0, v0

    invoke-virtual {v2, v0}, Landroid/text/Layout;->getLineForVertical(I)I

    move-result v0

    .line 35999
    invoke-virtual {p0}, Lacb;->getTotalPaddingLeft()I

    move-result v2

    int-to-float v2, v2

    sub-float v2, p1, v2

    .line 36001
    invoke-static {v4, v2}, Ljava/lang/Math;->max(FF)F

    move-result v2

    .line 36002
    invoke-virtual {p0}, Lacb;->getWidth()I

    move-result v3

    invoke-virtual {p0}, Lacb;->getTotalPaddingRight()I

    move-result v4

    sub-int/2addr v3, v4

    add-int/lit8 v3, v3, -0x1

    int-to-float v3, v3

    invoke-static {v3, v2}, Ljava/lang/Math;->min(FF)F

    move-result v2

    .line 36003
    invoke-virtual {p0}, Lacb;->getScrollX()I

    move-result v3

    int-to-float v3, v3

    add-float/2addr v2, v3

    .line 35018
    invoke-virtual {p0}, Lacb;->getLayout()Landroid/text/Layout;

    move-result-object v3

    invoke-virtual {v3, v0, v2}, Landroid/text/Layout;->getOffsetForHorizontal(IF)I

    move-result v0

    goto :goto_0

    .line 36843
    :cond_2
    if-ge v0, v3, :cond_4

    .line 36846
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v3

    .line 36847
    :goto_2
    if-ltz v0, :cond_4

    .line 36855
    invoke-interface {v3, v0}, Landroid/text/Editable;->charAt(I)C

    move-result v2

    if-eq v2, v6, :cond_3

    move v2, v0

    .line 36847
    :goto_3
    if-ne v2, v1, :cond_4

    invoke-direct {p0, v0}, Lacb;->c(I)Lada;

    move-result-object v2

    if-nez v2, :cond_4

    .line 36849
    add-int/lit8 v0, v0, -0x1

    goto :goto_2

    :cond_3
    move v2, v1

    .line 36858
    goto :goto_3

    .line 1821
    :cond_4
    return v0
.end method

.method static synthetic a(Lacb;I)I
    .locals 0

    .prologue
    .line 113
    iput p1, p0, Lacb;->J:I

    return p1
.end method

.method static synthetic a(Lacb;Lacx;)Lada;
    .locals 1

    .prologue
    .line 113
    invoke-direct {p0, p1}, Lacb;->c(Lacx;)Lada;

    move-result-object v0

    return-object v0
.end method

.method static synthetic a(Lacb;)Landroid/text/TextWatcher;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lacb;->z:Landroid/text/TextWatcher;

    return-object v0
.end method

.method static synthetic a(Lacb;Landroid/text/TextWatcher;)Landroid/text/TextWatcher;
    .locals 0

    .prologue
    .line 113
    iput-object p1, p0, Lacb;->z:Landroid/text/TextWatcher;

    return-object p1
.end method

.method static synthetic a(Lacb;Lada;)Landroid/widget/ListAdapter;
    .locals 13

    .prologue
    .line 113
    .line 50777
    new-instance v0, Laby;

    invoke-virtual {p0}, Lacb;->getContext()Landroid/content/Context;

    move-result-object v1

    invoke-interface {p1}, Lada;->c()J

    move-result-wide v2

    .line 50778
    invoke-interface {p1}, Lada;->d()Ljava/lang/Long;

    move-result-object v4

    invoke-interface {p1}, Lada;->e()Ljava/lang/String;

    move-result-object v5

    invoke-interface {p1}, Lada;->f()J

    move-result-wide v6

    .line 50781
    invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v8

    check-cast v8, Laav;

    .line 50782
    iget v8, v8, Laav;->b:I

    .line 50779
    iget-object v10, p0, Lacb;->A:Labj;

    .line 50780
    invoke-direct {p0}, Lacb;->p()Landroid/graphics/drawable/StateListDrawable;

    move-result-object v11

    .line 50783
    invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v9

    check-cast v9, Laav;

    .line 50784
    const/4 v12, 0x0

    move-object v9, p0

    .line 50780
    invoke-direct/range {v0 .. v12}, Laby;-><init>(Landroid/content/Context;JLjava/lang/Long;Ljava/lang/String;JILabz;Labj;Landroid/graphics/drawable/StateListDrawable;Ls;)V

    .line 113
    return-object v0
.end method

.method static synthetic a(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .prologue
    .line 113
    .line 50797
    invoke-static {p0}, Landroid/text/util/Rfc822Tokenizer;->tokenize(Ljava/lang/CharSequence;)[Landroid/text/util/Rfc822Token;

    move-result-object v0

    .line 50798
    if-eqz v0, :cond_0

    array-length v1, v0

    if-lez v1, :cond_0

    .line 50799
    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-virtual {v0}, Landroid/text/util/Rfc822Token;->getAddress()Ljava/lang/String;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method static synthetic a(Lacb;Laco;Landroid/graphics/Bitmap;)V
    .locals 0

    .prologue
    .line 113
    invoke-direct {p0, p1, p2}, Lacb;->a(Laco;Landroid/graphics/Bitmap;)V

    return-void
.end method

.method static synthetic a(Lacb;Ljava/lang/String;)V
    .locals 3

    .prologue
    .line 113
    .line 50762
    invoke-virtual {p0}, Lacb;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "accessibility"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/accessibility/AccessibilityManager;

    .line 50763
    invoke-virtual {v0}, Landroid/view/accessibility/AccessibilityManager;->isEnabled()Z

    move-result v0

    .line 50765
    if-eqz v0, :cond_0

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x10

    if-lt v0, v1, :cond_0

    .line 50766
    invoke-virtual {p0}, Lacb;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 50767
    if-eqz v0, :cond_0

    .line 50768
    const/16 v1, 0x4000

    invoke-static {v1}, Landroid/view/accessibility/AccessibilityEvent;->obtain(I)Landroid/view/accessibility/AccessibilityEvent;

    move-result-object v1

    .line 50770
    invoke-virtual {p0, v1}, Lacb;->onInitializeAccessibilityEvent(Landroid/view/accessibility/AccessibilityEvent;)V

    .line 50771
    invoke-virtual {v1}, Landroid/view/accessibility/AccessibilityEvent;->getText()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 50772
    const/4 v2, 0x0

    invoke-virtual {v1, v2}, Landroid/view/accessibility/AccessibilityEvent;->setContentDescription(Ljava/lang/CharSequence;)V

    .line 50773
    invoke-interface {v0, p0, v1}, Landroid/view/ViewParent;->requestSendAccessibilityEvent(Landroid/view/View;Landroid/view/accessibility/AccessibilityEvent;)Z

    .line 113
    :cond_0
    return-void
.end method

.method private a(Laco;Landroid/graphics/Bitmap;)V
    .locals 9

    .prologue
    const/high16 v8, 0x40000000    # 2.0f

    const/4 v4, 0x0

    const/4 v7, 0x1

    .line 814
    new-instance v0, Landroid/graphics/Canvas;

    iget-object v1, p1, Laco;->a:Landroid/graphics/Bitmap;

    invoke-direct {v0, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 815
    new-instance v1, Landroid/graphics/RectF;

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v2

    int-to-float v2, v2

    invoke-virtual {p2}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v3

    int-to-float v3, v3

    invoke-direct {v1, v4, v4, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 816
    new-instance v2, Landroid/graphics/RectF;

    iget v3, p1, Laco;->c:F

    iget v4, p1, Laco;->d:F

    iget v5, p1, Laco;->e:F

    iget v6, p1, Laco;->f:F

    invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 10932
    new-instance v3, Landroid/graphics/Matrix;

    invoke-direct {v3}, Landroid/graphics/Matrix;-><init>()V

    .line 10935
    new-instance v4, Landroid/graphics/BitmapShader;

    sget-object v5, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    sget-object v6, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    invoke-direct {v4, p2, v5, v6}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 10936
    invoke-virtual {v3}, Landroid/graphics/Matrix;->reset()V

    .line 10939
    sget-object v5, Landroid/graphics/Matrix$ScaleToFit;->FILL:Landroid/graphics/Matrix$ScaleToFit;

    invoke-virtual {v3, v1, v2, v5}, Landroid/graphics/Matrix;->setRectToRect(Landroid/graphics/RectF;Landroid/graphics/RectF;Landroid/graphics/Matrix$ScaleToFit;)Z

    .line 10941
    invoke-virtual {v4, v3}, Landroid/graphics/BitmapShader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 10942
    iget-object v1, p0, Lacb;->v:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->reset()V

    .line 10943
    iget-object v1, p0, Lacb;->v:Landroid/graphics/Paint;

    invoke-virtual {v1, v4}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 10944
    iget-object v1, p0, Lacb;->v:Landroid/graphics/Paint;

    invoke-virtual {v1, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 10945
    iget-object v1, p0, Lacb;->v:Landroid/graphics/Paint;

    invoke-virtual {v1, v7}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 10946
    iget-object v1, p0, Lacb;->v:Landroid/graphics/Paint;

    invoke-virtual {v1, v7}, Landroid/graphics/Paint;->setDither(Z)V

    .line 10947
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    move-result v3

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v4

    div-float/2addr v4, v8

    iget-object v5, p0, Lacb;->v:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v3, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 10951
    iget-object v1, p0, Lacb;->v:Landroid/graphics/Paint;

    invoke-virtual {v1}, Landroid/graphics/Paint;->reset()V

    .line 10952
    iget-object v1, p0, Lacb;->v:Landroid/graphics/Paint;

    const/4 v3, 0x0

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 10953
    iget-object v1, p0, Lacb;->v:Landroid/graphics/Paint;

    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 10954
    iget-object v1, p0, Lacb;->v:Landroid/graphics/Paint;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 10955
    iget-object v1, p0, Lacb;->v:Landroid/graphics/Paint;

    invoke-virtual {v1, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 10956
    invoke-virtual {v2}, Landroid/graphics/RectF;->centerX()F

    move-result v1

    invoke-virtual {v2}, Landroid/graphics/RectF;->centerY()F

    move-result v3

    invoke-virtual {v2}, Landroid/graphics/RectF;->width()F

    move-result v2

    div-float/2addr v2, v8

    const/high16 v4, 0x3f000000    # 0.5f

    sub-float/2addr v2, v4

    iget-object v4, p0, Lacb;->v:Landroid/graphics/Paint;

    invoke-virtual {v0, v1, v3, v2, v4}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 10959
    iget-object v0, p0, Lacb;->v:Landroid/graphics/Paint;

    invoke-virtual {v0}, Landroid/graphics/Paint;->reset()V

    .line 819
    return-void
.end method

.method private a(Landroid/content/ClipData;)V
    .locals 12

    .prologue
    const/4 v6, 0x1

    const/4 v1, 0x0

    .line 2594
    if-nez p1, :cond_1

    .line 2637
    :cond_0
    :goto_0
    return-void

    .line 2599
    :cond_1
    invoke-virtual {p1}, Landroid/content/ClipData;->getDescription()Landroid/content/ClipDescription;

    move-result-object v0

    .line 2600
    const-string v2, "text/plain"

    invoke-virtual {v0, v2}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    const-string v2, "text/html"

    .line 2601
    invoke-virtual {v0, v2}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_5

    :cond_2
    move v0, v6

    .line 2602
    :goto_1
    if-eqz v0, :cond_0

    .line 2606
    iget-object v0, p0, Lacb;->z:Landroid/text/TextWatcher;

    invoke-virtual {p0, v0}, Lacb;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 2608
    invoke-virtual {p1}, Landroid/content/ClipData;->getDescription()Landroid/content/ClipDescription;

    move-result-object v7

    move v0, v1

    .line 2609
    :goto_2
    invoke-virtual {p1}, Landroid/content/ClipData;->getItemCount()I

    move-result v2

    if-ge v0, v2, :cond_c

    .line 2610
    invoke-virtual {v7, v0}, Landroid/content/ClipDescription;->getMimeType(I)Ljava/lang/String;

    move-result-object v2

    .line 2611
    const-string v3, "text/plain"

    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    const-string v3, "text/html"

    .line 2612
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    :cond_3
    move v2, v6

    .line 2613
    :goto_3
    if-eqz v2, :cond_b

    .line 2618
    invoke-virtual {p1, v0}, Landroid/content/ClipData;->getItemAt(I)Landroid/content/ClipData$Item;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/ClipData$Item;->getText()Ljava/lang/CharSequence;

    move-result-object v2

    .line 2619
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_b

    .line 2620
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v3

    .line 2621
    invoke-virtual {p0}, Lacb;->getSelectionStart()I

    move-result v4

    .line 2622
    invoke-virtual {p0}, Lacb;->getSelectionEnd()I

    move-result v5

    .line 2623
    if-ltz v4, :cond_4

    if-gtz v5, :cond_7

    .line 2625
    :cond_4
    invoke-interface {v3, v2}, Landroid/text/Editable;->append(Ljava/lang/CharSequence;)Landroid/text/Editable;

    .line 50698
    :goto_4
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v8

    .line 50699
    iget-object v2, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    invoke-virtual {p0}, Lacb;->getSelectionEnd()I

    move-result v3

    invoke-interface {v2, v8, v3}, Landroid/widget/MultiAutoCompleteTextView$Tokenizer;->findTokenStart(Ljava/lang/CharSequence;I)I

    move-result v5

    .line 50700
    invoke-virtual {v8, v5}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v9

    .line 50703
    const/4 v2, 0x0

    .line 50704
    new-instance v10, Ljava/util/ArrayList;

    invoke-direct {v10}, Ljava/util/ArrayList;-><init>()V

    .line 50705
    if-eqz v5, :cond_9

    move v4, v1

    move v3, v5

    .line 50707
    :goto_5
    if-eqz v3, :cond_f

    if-nez v2, :cond_f

    if-eq v3, v4, :cond_f

    .line 50709
    iget-object v2, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    invoke-interface {v2, v8, v3}, Landroid/widget/MultiAutoCompleteTextView$Tokenizer;->findTokenStart(Ljava/lang/CharSequence;I)I

    move-result v4

    .line 50710
    invoke-direct {p0, v4}, Lacb;->c(I)Lada;

    move-result-object v2

    .line 50711
    if-ne v4, v5, :cond_e

    if-nez v2, :cond_e

    move-object v11, v2

    move v2, v3

    move v3, v4

    move-object v4, v11

    .line 50715
    :goto_6
    if-eq v3, v5, :cond_9

    .line 50716
    if-eqz v4, :cond_d

    .line 50721
    :goto_7
    if-ge v2, v5, :cond_9

    .line 50722
    iget-object v3, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Landroid/widget/MultiAutoCompleteTextView$Tokenizer;->findTokenEnd(Ljava/lang/CharSequence;I)I

    move-result v3

    invoke-direct {p0, v3}, Lacb;->f(I)I

    move-result v3

    .line 50724
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-direct {p0, v2, v3, v4}, Lacb;->a(IILandroid/text/Editable;)Z

    .line 50725
    invoke-direct {p0, v2}, Lacb;->c(I)Lada;

    move-result-object v3

    .line 50726
    if-eqz v3, :cond_9

    .line 50744
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v2

    .line 50730
    invoke-interface {v2, v3}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v2

    add-int/lit8 v2, v2, 0x1

    .line 50731
    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_5
    move v0, v1

    .line 2601
    goto/16 :goto_1

    :cond_6
    move v2, v1

    .line 2612
    goto/16 :goto_3

    .line 2626
    :cond_7
    if-ne v4, v5, :cond_8

    .line 2628
    invoke-interface {v3, v4, v2}, Landroid/text/Editable;->insert(ILjava/lang/CharSequence;)Landroid/text/Editable;

    goto :goto_4

    .line 2630
    :cond_8
    invoke-interface {v3, v2, v4, v5}, Landroid/text/Editable;->append(Ljava/lang/CharSequence;II)Landroid/text/Editable;

    goto :goto_4

    .line 50737
    :cond_9
    invoke-direct {p0, v9}, Lacb;->b(Ljava/lang/CharSequence;)Z

    move-result v2

    if-eqz v2, :cond_a

    .line 50738
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v2

    .line 50739
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v9, v5}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v3

    .line 50740
    invoke-interface {v2}, Landroid/text/Editable;->length()I

    move-result v4

    invoke-direct {p0, v3, v4, v2}, Lacb;->a(IILandroid/text/Editable;)Z

    .line 50741
    invoke-direct {p0, v3}, Lacb;->c(I)Lada;

    move-result-object v2

    invoke-virtual {v10, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50692
    :cond_a
    invoke-virtual {v10}, Ljava/util/ArrayList;->size()I

    move-result v2

    if-lez v2, :cond_b

    .line 50694
    new-instance v2, Lacp;

    .line 50745
    invoke-direct {v2, p0}, Lacp;-><init>(Lacb;)V

    .line 50695
    new-array v3, v6, [Ljava/util/ArrayList;

    aput-object v10, v3, v1

    invoke-virtual {v2, v3}, Lacp;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 2609
    :cond_b
    add-int/lit8 v0, v0, 0x1

    goto/16 :goto_2

    .line 2636
    :cond_c
    iget-object v0, p0, Lacb;->y:Landroid/os/Handler;

    iget-object v1, p0, Lacb;->V:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto/16 :goto_0

    :cond_d
    move v2, v3

    goto :goto_7

    :cond_e
    move v11, v3

    move v3, v4

    move v4, v11

    goto/16 :goto_5

    :cond_f
    move-object v11, v2

    move v2, v4

    move-object v4, v11

    goto/16 :goto_6
.end method

.method private a(Landroid/widget/ListPopupWindow;)V
    .locals 1

    .prologue
    .line 326
    new-instance v0, Lacj;

    invoke-direct {v0, p0}, Lacj;-><init>(Lacb;)V

    invoke-virtual {p1, v0}, Landroid/widget/ListPopupWindow;->setOnDismissListener(Landroid/widget/PopupWindow$OnDismissListener;)V

    .line 332
    return-void
.end method

.method private a(II)Z
    .locals 1

    .prologue
    .line 1556
    iget-boolean v0, p0, Lacb;->N:Z

    if-nez v0, :cond_0

    invoke-virtual {p0}, Lacb;->hasFocus()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lacb;->enoughToFilter()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-direct {p0, p1, p2}, Lacb;->b(II)Z

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private a(IILandroid/text/Editable;)Z
    .locals 5

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 1472
    .line 28121
    invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Laav;

    .line 1473
    if-eqz v0, :cond_2

    invoke-interface {v0}, Landroid/widget/ListAdapter;->getCount()I

    move-result v0

    if-lez v0, :cond_2

    invoke-virtual {p0}, Lacb;->enoughToFilter()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 1474
    invoke-virtual {p0}, Lacb;->getSelectionEnd()I

    move-result v0

    if-ne p2, v0, :cond_2

    invoke-virtual {p0}, Lacb;->f()Z

    move-result v0

    if-nez v0, :cond_2

    .line 1478
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Lacb;->e(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 1479
    invoke-virtual {p0}, Lacb;->getListSelection()I

    move-result v0

    .line 1480
    const/4 v3, -0x1

    if-ne v0, v3, :cond_1

    .line 1482
    invoke-direct {p0, v2}, Lacb;->d(I)I

    .line 1487
    :cond_0
    :goto_0
    invoke-virtual {p0}, Lacb;->dismissDropDown()V

    move v0, v1

    .line 1519
    :goto_1
    return v0

    .line 1484
    :cond_1
    invoke-direct {p0, v0}, Lacb;->d(I)I

    goto :goto_0

    .line 1490
    :cond_2
    iget-object v0, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    invoke-interface {v0, p3, p1}, Landroid/widget/MultiAutoCompleteTextView$Tokenizer;->findTokenEnd(Ljava/lang/CharSequence;I)I

    move-result v0

    .line 1491
    invoke-interface {p3}, Landroid/text/Editable;->length()I

    move-result v3

    add-int/lit8 v4, v0, 0x1

    if-le v3, v4, :cond_4

    .line 1492
    add-int/lit8 v3, v0, 0x1

    invoke-interface {p3, v3}, Landroid/text/Editable;->charAt(I)C

    move-result v3

    .line 1493
    const/16 v4, 0x2c

    if-eq v3, v4, :cond_3

    const/16 v4, 0x3b

    if-ne v3, v4, :cond_4

    .line 1494
    :cond_3
    add-int/lit8 v0, v0, 0x1

    .line 1497
    :cond_4
    invoke-virtual {p3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, p1, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 1498
    invoke-virtual {p0}, Lacb;->clearComposingText()V

    .line 1499
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_7

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_7

    .line 1500
    invoke-direct {p0, v0}, Lacb;->c(Ljava/lang/String;)Lacx;

    move-result-object v0

    .line 1501
    if-eqz v0, :cond_5

    .line 1502
    const-string v2, ""

    invoke-static {p3, p1, p2, v2}, Landroid/text/method/QwertyKeyListener;->markAsReplaced(Landroid/text/Spannable;IILjava/lang/String;)V

    .line 1503
    invoke-direct {p0, v0}, Lacb;->d(Lacx;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 1504
    if-eqz v0, :cond_5

    if-ltz p1, :cond_5

    if-ltz p2, :cond_5

    .line 1505
    invoke-interface {p3, p1, p2, v0}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 1512
    :cond_5
    invoke-virtual {p0}, Lacb;->getSelectionEnd()I

    move-result v0

    if-ne p2, v0, :cond_6

    .line 1513
    invoke-virtual {p0}, Lacb;->dismissDropDown()V

    .line 1515
    :cond_6
    invoke-direct {p0}, Lacb;->o()V

    move v0, v1

    .line 1516
    goto :goto_1

    :cond_7
    move v0, v2

    .line 1519
    goto :goto_1
.end method

.method private b(I)I
    .locals 3

    .prologue
    .line 985
    iget v0, p0, Lacb;->m:F

    const/high16 v1, 0x40000000    # 2.0f

    iget v2, p0, Lacb;->o:F

    mul-float/2addr v1, v2

    add-float/2addr v0, v1

    .line 986
    invoke-virtual {p0}, Lacb;->getLineCount()I

    move-result v1

    sub-int/2addr v1, p1

    invoke-static {v1}, Ljava/lang/Math;->abs(I)I

    move-result v1

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-virtual {p0}, Lacb;->getPaddingBottom()I

    move-result v1

    int-to-float v1, v1

    add-float/2addr v0, v1

    float-to-int v0, v0

    neg-int v0, v0

    return v0
.end method

.method static synthetic b(Lacb;I)I
    .locals 1

    .prologue
    .line 113
    invoke-direct {p0, p1}, Lacb;->b(I)I

    move-result v0

    return v0
.end method

.method static synthetic b(Lacb;Lada;)I
    .locals 1

    .prologue
    .line 113
    invoke-direct {p0, p1}, Lacb;->b(Lada;)I

    move-result v0

    return v0
.end method

.method private b(Lada;)I
    .locals 1

    .prologue
    .line 1630
    .line 31626
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 1630
    invoke-interface {v0, p1}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method static synthetic b(Lacb;Lacx;)Lacx;
    .locals 1

    .prologue
    .line 113
    invoke-direct {p0, p1}, Lacb;->e(Lacx;)Lacx;

    move-result-object v0

    return-object v0
.end method

.method static synthetic b(Lacb;)V
    .locals 0

    .prologue
    .line 113
    invoke-direct {p0}, Lacb;->j()V

    return-void
.end method

.method private b(II)Z
    .locals 3

    .prologue
    const/4 v1, 0x1

    .line 1560
    iget-boolean v0, p0, Lacb;->N:Z

    if-eqz v0, :cond_0

    move v0, v1

    .line 1565
    :goto_0
    return v0

    .line 30626
    :cond_0
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 1564
    const-class v2, Lada;

    invoke-interface {v0, p1, p2, v2}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lada;

    .line 1565
    if-eqz v0, :cond_1

    array-length v0, v0

    if-lez v0, :cond_1

    move v0, v1

    goto :goto_0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic b(Lacb;Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 113
    invoke-direct {p0, p1}, Lacb;->e(Ljava/lang/String;)Z

    move-result v0

    return v0
.end method

.method private b(Ljava/lang/CharSequence;)Z
    .locals 4

    .prologue
    const/4 v0, 0x0

    .line 1667
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 1678
    :cond_0
    :goto_0
    return v0

    .line 1671
    :cond_1
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    move-result v1

    .line 1672
    iget-object v2, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    invoke-interface {v2, p1, v1}, Landroid/widget/MultiAutoCompleteTextView$Tokenizer;->findTokenStart(Ljava/lang/CharSequence;I)I

    move-result v2

    .line 1673
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3, v2, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    .line 1674
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_0

    .line 1675
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    invoke-virtual {v1, v2}, Ljava/lang/String;->charAt(I)C

    move-result v1

    .line 1676
    const/16 v2, 0x2c

    if-eq v1, v2, :cond_2

    const/16 v2, 0x3b

    if-ne v1, v2, :cond_0

    :cond_2
    const/4 v0, 0x1

    goto :goto_0
.end method

.method private static b(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 1284
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1285
    const/4 v0, 0x0

    .line 1289
    :goto_0
    return v0

    .line 1288
    :cond_0
    sget-object v0, Lacb;->e:Ljava/util/regex/Pattern;

    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 1289
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    goto :goto_0
.end method

.method static synthetic c(Lacb;I)I
    .locals 1

    .prologue
    .line 113
    const/4 v0, -0x1

    iput v0, p0, Lacb;->M:I

    return v0
.end method

.method private c(Lada;)I
    .locals 1

    .prologue
    .line 1634
    .line 32626
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 1634
    invoke-interface {v0, p1}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method private c(Ljava/lang/String;)Lacx;
    .locals 7

    .prologue
    const/4 v1, 0x1

    const/4 v3, 0x0

    const/4 v4, 0x0

    .line 1294
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1344
    :goto_0
    return-object v3

    .line 1297
    :cond_0
    invoke-virtual {p0}, Lacb;->f()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lacb;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 1298
    invoke-static {p1, v1}, Lacx;->b(Ljava/lang/String;Z)Lacx;

    move-result-object v3

    goto :goto_0

    .line 1300
    :cond_1
    invoke-static {p1}, Landroid/text/util/Rfc822Tokenizer;->tokenize(Ljava/lang/CharSequence;)[Landroid/text/util/Rfc822Token;

    move-result-object v0

    .line 1301
    invoke-direct {p0, p1}, Lacb;->d(Ljava/lang/String;)Z

    move-result v2

    .line 1302
    if-eqz v2, :cond_3

    if-eqz v0, :cond_3

    array-length v5, v0

    if-lez v5, :cond_3

    .line 1305
    aget-object v5, v0, v4

    invoke-virtual {v5}, Landroid/text/util/Rfc822Token;->getName()Ljava/lang/String;

    move-result-object v5

    .line 1306
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v6

    if-nez v6, :cond_2

    .line 1307
    aget-object v0, v0, v4

    invoke-virtual {v0}, Landroid/text/util/Rfc822Token;->getAddress()Ljava/lang/String;

    move-result-object v0

    invoke-static {v5, v0, v2}, Lacx;->a(Ljava/lang/String;Ljava/lang/String;Z)Lacx;

    move-result-object v3

    goto :goto_0

    .line 1310
    :cond_2
    aget-object v0, v0, v4

    invoke-virtual {v0}, Landroid/text/util/Rfc822Token;->getAddress()Ljava/lang/String;

    move-result-object v0

    .line 1311
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_3

    .line 1312
    invoke-static {v0, v2}, Lacx;->a(Ljava/lang/String;Z)Lacx;

    move-result-object v3

    goto :goto_0

    .line 1319
    :cond_3
    iget-object v0, p0, Lacb;->x:Landroid/widget/AutoCompleteTextView$Validator;

    if-eqz v0, :cond_8

    if-nez v2, :cond_8

    .line 1321
    iget-object v0, p0, Lacb;->x:Landroid/widget/AutoCompleteTextView$Validator;

    invoke-interface {v0, p1}, Landroid/widget/AutoCompleteTextView$Validator;->fixText(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 1322
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v5

    if-nez v5, :cond_4

    .line 1323
    invoke-virtual {v0, p1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v5

    if-eqz v5, :cond_5

    .line 1327
    invoke-static {v0}, Landroid/text/util/Rfc822Tokenizer;->tokenize(Ljava/lang/CharSequence;)[Landroid/text/util/Rfc822Token;

    move-result-object v3

    .line 1328
    array-length v5, v3

    if-lez v5, :cond_7

    .line 1329
    aget-object v0, v3, v4

    invoke-virtual {v0}, Landroid/text/util/Rfc822Token;->getAddress()Ljava/lang/String;

    move-result-object v0

    :goto_1
    move v2, v1

    .line 1345
    :cond_4
    :goto_2
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_6

    .line 1344
    :goto_3
    invoke-static {v0, v2}, Lacx;->a(Ljava/lang/String;Z)Lacx;

    move-result-object v3

    goto :goto_0

    :cond_5
    move-object v0, v3

    move v2, v4

    .line 1339
    goto :goto_2

    :cond_6
    move-object v0, p1

    .line 1345
    goto :goto_3

    :cond_7
    move v1, v2

    goto :goto_1

    :cond_8
    move-object v0, v3

    goto :goto_2
.end method

.method private c(I)Lada;
    .locals 6

    .prologue
    const/4 v1, 0x0

    .line 1862
    .line 37626
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 1864
    invoke-interface {v0}, Landroid/text/Spannable;->length()I

    move-result v2

    const-class v3, Lada;

    invoke-interface {v0, v1, v2, v3}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lada;

    .line 1866
    array-length v3, v0

    move v2, v1

    :goto_0
    if-ge v2, v3, :cond_1

    aget-object v1, v0, v2

    .line 1867
    invoke-direct {p0, v1}, Lacb;->b(Lada;)I

    move-result v4

    .line 1868
    invoke-direct {p0, v1}, Lacb;->c(Lada;)I

    move-result v5

    .line 1869
    if-lt p1, v4, :cond_0

    if-gt p1, v5, :cond_0

    move-object v0, v1

    .line 1873
    :goto_1
    return-object v0

    .line 1866
    :cond_0
    add-int/lit8 v1, v2, 0x1

    move v2, v1

    goto :goto_0

    .line 1873
    :cond_1
    const/4 v0, 0x0

    goto :goto_1
.end method

.method private c(Lacx;)Lada;
    .locals 23

    .prologue
    .line 963
    invoke-virtual/range {p0 .. p0}, Lacb;->getPaint()Landroid/text/TextPaint;

    move-result-object v10

    .line 964
    invoke-virtual {v10}, Landroid/text/TextPaint;->getTextSize()F

    move-result v12

    .line 965
    invoke-virtual {v10}, Landroid/text/TextPaint;->getColor()I

    move-result v13

    .line 12119
    move-object/from16 v0, p1

    iget-boolean v4, v0, Lacx;->k:Z

    .line 11911
    if-eqz v4, :cond_6

    move-object/from16 v0, p0

    iget v4, v0, Lacb;->g:I

    .line 11713
    :goto_0
    invoke-virtual {v10, v4}, Landroid/text/TextPaint;->setColor(I)V

    .line 13119
    move-object/from16 v0, p1

    iget-boolean v4, v0, Lacx;->k:Z

    .line 12907
    if-eqz v4, :cond_7

    move-object/from16 v0, p0

    iget-object v4, v0, Lacb;->j:Landroid/graphics/drawable/Drawable;

    move-object v6, v4

    .line 14119
    :goto_1
    move-object/from16 v0, p1

    iget-boolean v4, v0, Lacx;->k:Z

    .line 13916
    if-eqz v4, :cond_8

    move-object/from16 v0, p0

    iget v4, v0, Lacb;->h:I

    move v7, v4

    .line 14725
    :goto_2
    new-instance v14, Laco;

    .line 15179
    invoke-direct {v14}, Laco;-><init>()V

    .line 14727
    const/4 v15, 0x0

    .line 14728
    const/4 v8, 0x0

    .line 14736
    new-instance v16, Landroid/graphics/Rect;

    invoke-direct/range {v16 .. v16}, Landroid/graphics/Rect;-><init>()V

    .line 14737
    if-eqz v6, :cond_0

    .line 14738
    move-object/from16 v0, v16

    invoke-virtual {v6, v0}, Landroid/graphics/drawable/Drawable;->getPadding(Landroid/graphics/Rect;)Z

    .line 14744
    :cond_0
    move-object/from16 v0, p0

    iget v4, v0, Lacb;->m:F

    float-to-int v0, v4

    move/from16 v17, v0

    .line 17119
    move-object/from16 v0, p1

    iget-boolean v4, v0, Lacx;->k:Z

    .line 14747
    if-eqz v4, :cond_9

    .line 14748
    move-object/from16 v0, v16

    iget v4, v0, Landroid/graphics/Rect;->top:I

    sub-int v4, v17, v4

    move-object/from16 v0, v16

    iget v5, v0, Landroid/graphics/Rect;->bottom:I

    sub-int/2addr v4, v5

    move v11, v4

    .line 14749
    :goto_3
    const/4 v4, 0x1

    new-array v9, v4, [F

    .line 14750
    const-string v4, " "

    invoke-virtual {v10, v4, v9}, Landroid/text/TextPaint;->getTextWidths(Ljava/lang/String;[F)I

    .line 18231
    move-object/from16 v0, p1

    iget-object v4, v0, Lacx;->c:Ljava/lang/String;

    .line 18235
    move-object/from16 v0, p1

    iget-object v5, v0, Lacx;->d:Ljava/lang/String;

    .line 17910
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_1

    invoke-static {v4, v5}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v18

    if-eqz v18, :cond_2

    .line 17911
    :cond_1
    const/4 v4, 0x0

    .line 17913
    :cond_2
    invoke-static {v4}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_a

    .line 18995
    :goto_4
    invoke-virtual/range {p0 .. p0}, Lacb;->getWidth()I

    move-result v5

    invoke-virtual/range {p0 .. p0}, Lacb;->getPaddingLeft()I

    move-result v18

    sub-int v5, v5, v18

    invoke-virtual/range {p0 .. p0}, Lacb;->getPaddingRight()I

    move-result v18

    sub-int v5, v5, v18

    move-object/from16 v0, p0

    iget v0, v0, Lacb;->p:I

    move/from16 v18, v0

    sub-int v5, v5, v18

    move-object/from16 v0, p0

    iget v0, v0, Lacb;->q:I

    move/from16 v18, v0

    sub-int v5, v5, v18

    int-to-float v5, v5

    .line 14752
    int-to-float v0, v11

    move/from16 v18, v0

    sub-float v5, v5, v18

    const/16 v18, 0x0

    aget v9, v9, v18

    sub-float/2addr v5, v9

    move-object/from16 v0, v16

    iget v9, v0, Landroid/graphics/Rect;->left:I

    int-to-float v9, v9

    sub-float/2addr v5, v9

    move-object/from16 v0, v16

    iget v9, v0, Landroid/graphics/Rect;->right:I

    int-to-float v9, v9

    sub-float/2addr v5, v9

    int-to-float v9, v8

    sub-float/2addr v5, v9

    .line 19698
    move-object/from16 v0, p0

    iget v9, v0, Lacb;->n:F

    invoke-virtual {v10, v9}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 19699
    const/4 v9, 0x0

    cmpg-float v9, v5, v9

    if-gtz v9, :cond_3

    const-string v9, "RecipientEditTextView"

    const/16 v18, 0x3

    move/from16 v0, v18

    invoke-static {v9, v0}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v9

    if-eqz v9, :cond_3

    .line 19700
    new-instance v9, Ljava/lang/StringBuilder;

    const/16 v18, 0x26

    move/from16 v0, v18

    invoke-direct {v9, v0}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v18, "Max width is negative: "

    move-object/from16 v0, v18

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v9

    invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 19702
    :cond_3
    sget-object v9, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-static {v4, v10, v5, v9}, Landroid/text/TextUtils;->ellipsize(Ljava/lang/CharSequence;Landroid/text/TextPaint;FLandroid/text/TextUtils$TruncateAt;)Ljava/lang/CharSequence;

    move-result-object v5

    .line 14754
    const/4 v4, 0x0

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v9

    invoke-virtual {v10, v5, v4, v9}, Landroid/text/TextPaint;->measureText(Ljava/lang/CharSequence;II)F

    move-result v4

    float-to-int v9, v4

    .line 20119
    move-object/from16 v0, p1

    iget-boolean v4, v0, Lacx;->k:Z

    .line 14757
    if-eqz v4, :cond_c

    move-object/from16 v0, p0

    iget v4, v0, Lacb;->p:I

    .line 14760
    :goto_5
    shl-int/lit8 v18, v11, 0x1

    add-int/2addr v4, v9

    move-object/from16 v0, p0

    iget v0, v0, Lacb;->q:I

    move/from16 v19, v0

    add-int v4, v4, v19

    add-int/2addr v4, v11

    move-object/from16 v0, v16

    iget v0, v0, Landroid/graphics/Rect;->left:I

    move/from16 v19, v0

    add-int v4, v4, v19

    move-object/from16 v0, v16

    iget v0, v0, Landroid/graphics/Rect;->right:I

    move/from16 v19, v0

    add-int v4, v4, v19

    add-int/2addr v4, v8

    move/from16 v0, v18

    invoke-static {v0, v4}, Ljava/lang/Math;->max(II)I

    move-result v18

    .line 14764
    sget-object v4, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    move/from16 v0, v18

    move/from16 v1, v17

    invoke-static {v0, v1, v4}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v4

    iput-object v4, v14, Laco;->a:Landroid/graphics/Bitmap;

    .line 14765
    new-instance v4, Landroid/graphics/Canvas;

    iget-object v0, v14, Laco;->a:Landroid/graphics/Bitmap;

    move-object/from16 v19, v0

    move-object/from16 v0, v19

    invoke-direct {v4, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 14768
    if-eqz v6, :cond_d

    .line 14769
    const/4 v7, 0x0

    const/16 v19, 0x0

    move/from16 v0, v19

    move/from16 v1, v18

    move/from16 v2, v17

    invoke-virtual {v6, v7, v0, v1, v2}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 14770
    invoke-virtual {v6, v4}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 14782
    :goto_6
    invoke-direct/range {p0 .. p0}, Lacb;->k()Z

    move-result v6

    if-eqz v6, :cond_e

    .line 14783
    move-object/from16 v0, p0

    iget v6, v0, Lacb;->q:I

    move-object/from16 v0, v16

    iget v7, v0, Landroid/graphics/Rect;->left:I

    add-int/2addr v6, v7

    add-int/2addr v6, v8

    move v8, v6

    .line 14786
    :goto_7
    const/4 v6, 0x0

    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    move-result v7

    int-to-float v8, v8

    .line 20924
    move-object/from16 v0, p0

    iget v9, v0, Lacb;->r:I

    sub-int v9, v17, v9

    div-int/lit8 v9, v9, 0x2

    sub-int v9, v17, v9

    int-to-float v9, v9

    .line 14786
    invoke-virtual/range {v4 .. v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/CharSequence;IIFFLandroid/graphics/Paint;)V

    .line 14789
    if-eqz v15, :cond_4

    .line 14790
    invoke-direct/range {p0 .. p0}, Lacb;->k()Z

    move-result v5

    if-eqz v5, :cond_f

    .line 14791
    move-object/from16 v0, v16

    iget v5, v0, Landroid/graphics/Rect;->left:I

    move-object/from16 v0, p0

    iget v6, v0, Lacb;->q:I

    add-int/2addr v5, v6

    .line 14794
    :goto_8
    div-int/lit8 v6, v17, 0x2

    invoke-virtual {v15}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v7

    invoke-virtual {v7}, Landroid/graphics/Rect;->height()I

    move-result v7

    div-int/lit8 v7, v7, 0x2

    sub-int/2addr v6, v7

    .line 14795
    invoke-virtual {v15}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v7

    invoke-virtual {v7, v5, v6}, Landroid/graphics/Rect;->offsetTo(II)V

    .line 14796
    invoke-virtual {v15, v4}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V

    .line 14800
    :cond_4
    invoke-direct/range {p0 .. p0}, Lacb;->k()Z

    move-result v4

    if-eqz v4, :cond_10

    move-object/from16 v0, v16

    iget v4, v0, Landroid/graphics/Rect;->right:I

    sub-int v4, v18, v4

    sub-int/2addr v4, v11

    .line 14802
    :goto_9
    int-to-float v5, v4

    iput v5, v14, Laco;->c:F

    .line 14803
    move-object/from16 v0, v16

    iget v5, v0, Landroid/graphics/Rect;->top:I

    int-to-float v5, v5

    iput v5, v14, Laco;->d:F

    .line 14804
    add-int/2addr v4, v11

    int-to-float v4, v4

    iput v4, v14, Laco;->e:F

    .line 14805
    move-object/from16 v0, v16

    iget v4, v0, Landroid/graphics/Rect;->bottom:I

    sub-int v4, v17, v4

    int-to-float v4, v4

    iput v4, v14, Laco;->f:F

    .line 11717
    iget-boolean v4, v14, Laco;->b:Z

    if-eqz v4, :cond_5

    .line 22247
    move-object/from16 v0, p1

    iget-wide v4, v0, Lacx;->g:J

    .line 21842
    invoke-virtual/range {p0 .. p0}, Lacb;->f()Z

    move-result v6

    if-eqz v6, :cond_12

    .line 21843
    const-wide/16 v6, -0x1

    cmp-long v4, v4, v6

    if-eqz v4, :cond_11

    const/4 v4, 0x1

    .line 21847
    :goto_a
    if-eqz v4, :cond_5

    .line 21848
    invoke-virtual/range {p1 .. p1}, Lacx;->a()[B

    move-result-object v4

    .line 21851
    if-nez v4, :cond_14

    .line 23121
    invoke-super/range {p0 .. p0}, Landroid/widget/MultiAutoCompleteTextView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v4

    check-cast v4, Laav;

    .line 21853
    new-instance v5, Lacl;

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-direct {v5, v0, v1, v14}, Lacl;-><init>(Lacb;Lacx;Laco;)V

    .line 23928
    iget-object v4, v4, Laav;->k:Labr;

    move-object/from16 v0, p1

    invoke-interface {v4, v0, v5}, Labr;->a(Lacx;Labs;)V

    .line 11720
    :cond_5
    :goto_b
    iget-object v4, v14, Laco;->a:Landroid/graphics/Bitmap;

    .line 970
    new-instance v5, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual/range {p0 .. p0}, Lacb;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-direct {v5, v6, v4}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 971
    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I

    move-result v8

    invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I

    move-result v4

    invoke-virtual {v5, v6, v7, v8, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 972
    new-instance v4, Lade;

    move-object/from16 v0, p1

    invoke-direct {v4, v5, v0}, Lade;-><init>(Landroid/graphics/drawable/Drawable;Lacx;)V

    .line 974
    move-object/from16 v0, p0

    iget v5, v0, Lacb;->o:F

    .line 24025
    iput v5, v4, Ladc;->b:F

    .line 976
    invoke-virtual {v10, v12}, Landroid/text/TextPaint;->setTextSize(F)V

    .line 977
    invoke-virtual {v10, v13}, Landroid/text/TextPaint;->setColor(I)V

    .line 978
    return-object v4

    .line 11912
    :cond_6
    invoke-virtual/range {p0 .. p0}, Lacb;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    const v5, 0x106000c

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    goto/16 :goto_0

    .line 12907
    :cond_7
    move-object/from16 v0, p0

    iget-object v4, v0, Lacb;->l:Landroid/graphics/drawable/Drawable;

    move-object v6, v4

    goto/16 :goto_1

    .line 13917
    :cond_8
    invoke-virtual/range {p0 .. p0}, Lacb;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, La;->cv:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getColor(I)I

    move-result v4

    move v7, v4

    goto/16 :goto_2

    .line 14748
    :cond_9
    const/4 v4, 0x0

    move v11, v4

    goto/16 :goto_3

    .line 17915
    :cond_a
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v18

    if-nez v18, :cond_b

    move-object v4, v5

    .line 17916
    goto/16 :goto_4

    .line 17918
    :cond_b
    new-instance v18, Landroid/text/util/Rfc822Token;

    const/16 v19, 0x0

    move-object/from16 v0, v18

    move-object/from16 v1, v19

    invoke-direct {v0, v4, v5, v1}, Landroid/text/util/Rfc822Token;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual/range {v18 .. v18}, Landroid/text/util/Rfc822Token;->toString()Ljava/lang/String;

    move-result-object v4

    goto/16 :goto_4

    .line 14757
    :cond_c
    move-object/from16 v0, p0

    iget v4, v0, Lacb;->q:I

    goto/16 :goto_5

    .line 14773
    :cond_d
    move-object/from16 v0, p0

    iget-object v6, v0, Lacb;->v:Landroid/graphics/Paint;

    invoke-virtual {v6}, Landroid/graphics/Paint;->reset()V

    .line 14774
    move-object/from16 v0, p0

    iget-object v6, v0, Lacb;->v:Landroid/graphics/Paint;

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setColor(I)V

    .line 14775
    move-object/from16 v0, p0

    iget-object v6, v0, Lacb;->v:Landroid/graphics/Paint;

    const/4 v7, 0x1

    invoke-virtual {v6, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 14776
    div-int/lit8 v6, v17, 0x2

    int-to-float v6, v6

    .line 14777
    new-instance v7, Landroid/graphics/RectF;

    const/16 v19, 0x0

    const/16 v20, 0x0

    move/from16 v0, v18

    int-to-float v0, v0

    move/from16 v21, v0

    move/from16 v0, v17

    int-to-float v0, v0

    move/from16 v22, v0

    move/from16 v0, v19

    move/from16 v1, v20

    move/from16 v2, v21

    move/from16 v3, v22

    invoke-direct {v7, v0, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    move-object/from16 v0, p0

    iget-object v0, v0, Lacb;->v:Landroid/graphics/Paint;

    move-object/from16 v19, v0

    move-object/from16 v0, v19

    invoke-virtual {v4, v7, v6, v6, v0}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    goto/16 :goto_6

    .line 14784
    :cond_e
    move-object/from16 v0, v16

    iget v6, v0, Landroid/graphics/Rect;->right:I

    sub-int v6, v18, v6

    move-object/from16 v0, p0

    iget v7, v0, Lacb;->q:I

    sub-int/2addr v6, v7

    sub-int/2addr v6, v9

    sub-int/2addr v6, v8

    move v8, v6

    goto/16 :goto_7

    .line 14793
    :cond_f
    move-object/from16 v0, v16

    iget v5, v0, Landroid/graphics/Rect;->right:I

    sub-int v5, v18, v5

    .line 14792
    invoke-virtual {v15}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    move-result-object v6

    invoke-virtual {v6}, Landroid/graphics/Rect;->width()I

    move-result v6

    sub-int/2addr v5, v6

    move-object/from16 v0, p0

    iget v6, v0, Lacb;->q:I

    sub-int/2addr v5, v6

    goto/16 :goto_8

    .line 14801
    :cond_10
    move-object/from16 v0, v16

    iget v4, v0, Landroid/graphics/Rect;->left:I

    goto/16 :goto_9

    .line 21843
    :cond_11
    const/4 v4, 0x0

    goto/16 :goto_a

    .line 21844
    :cond_12
    const-wide/16 v6, -0x1

    cmp-long v6, v4, v6

    if-eqz v6, :cond_13

    const-wide/16 v6, -0x2

    cmp-long v4, v4, v6

    if-eqz v4, :cond_13

    const/4 v4, 0x1

    goto/16 :goto_a

    :cond_13
    const/4 v4, 0x0

    goto/16 :goto_a

    .line 21895
    :cond_14
    const/4 v5, 0x0

    array-length v6, v4

    invoke-static {v4, v5, v6}, Landroid/graphics/BitmapFactory;->decodeByteArray([BII)Landroid/graphics/Bitmap;

    move-result-object v4

    .line 21897
    move-object/from16 v0, p0

    invoke-direct {v0, v14, v4}, Lacb;->a(Laco;Landroid/graphics/Bitmap;)V

    goto/16 :goto_b
.end method

.method static synthetic c(Lacb;)Landroid/widget/ListPopupWindow;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lacb;->C:Landroid/widget/ListPopupWindow;

    return-object v0
.end method

.method private c(II)V
    .locals 3

    .prologue
    const/4 v0, -0x1

    .line 1569
    if-eq p1, v0, :cond_0

    if-ne p2, v0, :cond_1

    .line 1571
    :cond_0
    invoke-virtual {p0}, Lacb;->dismissDropDown()V

    .line 1589
    :goto_0
    return-void

    .line 1576
    :cond_1
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 1577
    invoke-virtual {p0, p2}, Lacb;->setSelection(I)V

    .line 1578
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v1, p1, p2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v1

    .line 1579
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 1580
    invoke-direct {p0, v1}, Lacb;->d(Ljava/lang/String;)Z

    move-result v2

    invoke-static {v1, v2}, Lacx;->a(Ljava/lang/String;Z)Lacx;

    move-result-object v1

    .line 1581
    const-string v2, ""

    invoke-static {v0, p1, p2, v2}, Landroid/text/method/QwertyKeyListener;->markAsReplaced(Landroid/text/Spannable;IILjava/lang/String;)V

    .line 1582
    invoke-direct {p0, v1}, Lacb;->d(Lacx;)Ljava/lang/CharSequence;

    move-result-object v1

    .line 1583
    invoke-virtual {p0}, Lacb;->getSelectionEnd()I

    move-result v2

    .line 1584
    if-eqz v1, :cond_2

    if-ltz p1, :cond_2

    if-ltz v2, :cond_2

    .line 1585
    invoke-interface {v0, p1, v2, v1}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 1588
    :cond_2
    invoke-virtual {p0}, Lacb;->dismissDropDown()V

    goto :goto_0
.end method

.method static synthetic c(Lacb;Lada;)V
    .locals 0

    .prologue
    .line 113
    invoke-direct {p0, p1}, Lacb;->f(Lada;)V

    return-void
.end method

.method private d(I)I
    .locals 5

    .prologue
    .line 1978
    .line 40121
    invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Laav;

    .line 1978
    invoke-virtual {v0, p1}, Laav;->a(I)Lacx;

    move-result-object v0

    invoke-direct {p0, v0}, Lacb;->e(Lacx;)Lacx;

    move-result-object v0

    .line 1979
    if-nez v0, :cond_0

    .line 1980
    const/4 v0, -0x1

    .line 1995
    :goto_0
    return v0

    .line 1982
    :cond_0
    invoke-virtual {p0}, Lacb;->clearComposingText()V

    .line 1984
    invoke-virtual {p0}, Lacb;->getSelectionEnd()I

    move-result v1

    .line 1985
    iget-object v2, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v3

    invoke-interface {v2, v3, v1}, Landroid/widget/MultiAutoCompleteTextView$Tokenizer;->findTokenStart(Ljava/lang/CharSequence;I)I

    move-result v2

    .line 1987
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v3

    .line 1988
    const-string v4, ""

    invoke-static {v3, v2, v1, v4}, Landroid/text/method/QwertyKeyListener;->markAsReplaced(Landroid/text/Spannable;IILjava/lang/String;)V

    .line 1989
    invoke-direct {p0, v0}, Lacb;->d(Lacx;)Ljava/lang/CharSequence;

    move-result-object v0

    .line 1990
    if-eqz v0, :cond_1

    if-ltz v2, :cond_1

    if-ltz v1, :cond_1

    .line 1991
    invoke-interface {v3, v2, v1, v0}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 1993
    :cond_1
    invoke-direct {p0}, Lacb;->o()V

    .line 1995
    sub-int v0, v1, v2

    goto :goto_0
.end method

.method static synthetic d(Lacb;)Lada;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lacb;->F:Lada;

    return-object v0
.end method

.method private d(Lacx;)Ljava/lang/CharSequence;
    .locals 6

    .prologue
    const/4 v0, 0x0

    .line 1923
    invoke-virtual {p0, p1}, Lacb;->a(Lacx;)Ljava/lang/String;

    move-result-object v2

    .line 1924
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1942
    :goto_0
    return-object v0

    .line 1928
    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v1

    add-int/lit8 v3, v1, -0x1

    .line 1929
    new-instance v1, Landroid/text/SpannableString;

    invoke-direct {v1, v2}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 1930
    iget-boolean v2, p0, Lacb;->N:Z

    if-nez v2, :cond_1

    .line 1932
    :try_start_0
    invoke-direct {p0, p1}, Lacb;->c(Lacx;)Lada;

    move-result-object v2

    .line 1933
    const/4 v4, 0x0

    const/16 v5, 0x21

    invoke-virtual {v1, v2, v4, v3, v5}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 1935
    invoke-virtual {v1}, Landroid/text/SpannableString;->toString()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v3}, Lada;->a(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    :cond_1
    move-object v0, v1

    .line 1942
    goto :goto_0

    .line 1936
    :catch_0
    move-exception v1

    .line 1937
    const-string v2, "RecipientEditTextView"

    invoke-virtual {v1}, Ljava/lang/NullPointerException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v2, v3, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method private d(Lada;)V
    .locals 8

    .prologue
    const/4 v1, 0x0

    const/4 v2, 0x1

    .line 2248
    invoke-direct {p0, p1}, Lacb;->e(Lada;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 2249
    invoke-interface {p1}, Lada;->b()Ljava/lang/CharSequence;

    move-result-object v1

    .line 2250
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v3

    .line 50626
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v4

    .line 2252
    invoke-interface {v4, p1}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v5

    .line 2253
    invoke-interface {v4, p1}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v0

    .line 2254
    invoke-interface {v4, p1}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 2256
    sub-int v4, v0, v5

    invoke-interface {v3}, Landroid/text/Editable;->length()I

    move-result v6

    add-int/lit8 v6, v6, -0x1

    if-ne v4, v6, :cond_0

    .line 2257
    add-int/lit8 v0, v0, 0x1

    .line 2259
    :cond_0
    invoke-interface {v3, v5, v0}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 2260
    invoke-virtual {p0, v2}, Lacb;->setCursorVisible(Z)V

    .line 2261
    invoke-interface {v3}, Landroid/text/Editable;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Lacb;->setSelection(I)V

    .line 2262
    invoke-interface {v3, v1}, Landroid/text/Editable;->append(Ljava/lang/CharSequence;)Landroid/text/Editable;

    move-object v0, v1

    .line 2263
    check-cast v0, Ljava/lang/String;

    .line 2264
    invoke-interface {v1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {p0, v1}, Lacb;->d(Ljava/lang/String;)Z

    move-result v1

    invoke-static {v0, v1}, Lacx;->a(Ljava/lang/String;Z)Lacx;

    move-result-object v0

    .line 2263
    invoke-direct {p0, v0}, Lacb;->c(Lacx;)Lada;

    move-result-object v0

    iput-object v0, p0, Lacb;->F:Lada;

    .line 2282
    :cond_1
    :goto_0
    return-void

    .line 2267
    :cond_2
    invoke-interface {p1}, Lada;->c()J

    move-result-wide v4

    const-wide/16 v6, -0x2

    cmp-long v0, v4, v6

    if-eqz v0, :cond_4

    .line 50627
    invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Laav;

    move v0, v1

    .line 2269
    :goto_1
    if-eqz v0, :cond_3

    iget-boolean v3, p0, Lacb;->N:Z

    if-nez v3, :cond_1

    .line 2272
    :cond_3
    iput-object p1, p0, Lacb;->F:Lada;

    .line 2273
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v3

    iget-object v4, p0, Lacb;->F:Lada;

    invoke-interface {v3, v4}, Landroid/text/Editable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v3

    invoke-virtual {p0, v3}, Lacb;->setSelection(I)V

    .line 2274
    invoke-virtual {p0, v1}, Lacb;->setCursorVisible(Z)V

    .line 2276
    if-eqz v0, :cond_5

    .line 2277
    iget-object v0, p0, Lacb;->D:Landroid/widget/ListPopupWindow;

    .line 50628
    iget-boolean v3, p0, Lacb;->U:Z

    if-eqz v3, :cond_1

    .line 50631
    invoke-virtual {p0}, Lacb;->getLayout()Landroid/text/Layout;

    move-result-object v3

    invoke-direct {p0, p1}, Lacb;->b(Lada;)I

    move-result v4

    invoke-virtual {v3, v4}, Landroid/text/Layout;->getLineForOffset(I)I

    move-result v3

    .line 50632
    invoke-direct {p0, v3}, Lacb;->b(I)I

    move-result v3

    .line 50635
    invoke-virtual {v0, p0}, Landroid/widget/ListPopupWindow;->setAnchorView(Landroid/view/View;)V

    .line 50636
    invoke-virtual {v0, v3}, Landroid/widget/ListPopupWindow;->setVerticalOffset(I)V

    .line 50649
    new-instance v3, Lacy;

    invoke-virtual {p0}, Lacb;->getContext()Landroid/content/Context;

    move-result-object v4

    invoke-interface {p1}, Lada;->g()Lacx;

    move-result-object v5

    iget-object v6, p0, Lacb;->A:Labj;

    .line 50650
    invoke-direct {p0}, Lacb;->p()Landroid/graphics/drawable/StateListDrawable;

    move-result-object v7

    invoke-direct {v3, v4, v5, v6, v7}, Lacy;-><init>(Landroid/content/Context;Lacx;Labj;Landroid/graphics/drawable/StateListDrawable;)V

    .line 50637
    invoke-virtual {v0, v3}, Landroid/widget/ListPopupWindow;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 50638
    new-instance v3, Lace;

    invoke-direct {v3, p0, p1}, Lace;-><init>(Lacb;Lada;)V

    invoke-virtual {v0, v3}, Landroid/widget/ListPopupWindow;->setOnItemClickListener(Landroid/widget/AdapterView$OnItemClickListener;)V

    .line 50644
    invoke-virtual {v0}, Landroid/widget/ListPopupWindow;->show()V

    .line 50645
    invoke-virtual {v0}, Landroid/widget/ListPopupWindow;->getListView()Landroid/widget/ListView;

    move-result-object v0

    .line 50646
    invoke-virtual {v0, v2}, Landroid/widget/ListView;->setChoiceMode(I)V

    .line 50647
    invoke-virtual {v0, v1, v2}, Landroid/widget/ListView;->setItemChecked(IZ)V

    goto :goto_0

    :cond_4
    move v0, v2

    .line 2268
    goto :goto_1

    .line 2279
    :cond_5
    iget-object v0, p0, Lacb;->C:Landroid/widget/ListPopupWindow;

    .line 50651
    new-instance v1, Lacn;

    invoke-direct {v1, p0, p1, v0}, Lacn;-><init>(Lacb;Lada;Landroid/widget/ListPopupWindow;)V

    const/4 v0, 0x0

    .line 50686
    invoke-virtual {v1, v0}, Lacn;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    goto/16 :goto_0
.end method

.method private d(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 1349
    iget-object v0, p0, Lacb;->x:Landroid/widget/AutoCompleteTextView$Validator;

    if-nez v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    iget-object v0, p0, Lacb;->x:Landroid/widget/AutoCompleteTextView$Validator;

    invoke-interface {v0, p1}, Landroid/widget/AutoCompleteTextView$Validator;->isValid(Ljava/lang/CharSequence;)Z

    move-result v0

    goto :goto_0
.end method

.method private e(I)Lacs;
    .locals 10

    .prologue
    const/4 v2, 0x0

    .line 2076
    iget-object v0, p0, Lacb;->I:Landroid/widget/TextView;

    invoke-virtual {v0}, Landroid/widget/TextView;->getText()Ljava/lang/CharSequence;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    aput-object v3, v1, v2

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 2077
    iget-object v0, p0, Lacb;->v:Landroid/graphics/Paint;

    invoke-virtual {p0}, Lacb;->getPaint()Landroid/text/TextPaint;

    move-result-object v3

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->set(Landroid/graphics/Paint;)V

    .line 2078
    iget-object v0, p0, Lacb;->v:Landroid/graphics/Paint;

    iget-object v3, p0, Lacb;->I:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getTextSize()F

    move-result v3

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 2079
    iget-object v0, p0, Lacb;->v:Landroid/graphics/Paint;

    iget-object v3, p0, Lacb;->I:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getCurrentTextColor()I

    move-result v3

    invoke-virtual {v0, v3}, Landroid/graphics/Paint;->setColor(I)V

    .line 2080
    iget-object v0, p0, Lacb;->v:Landroid/graphics/Paint;

    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F

    move-result v0

    float-to-int v0, v0

    iget-object v3, p0, Lacb;->I:Landroid/widget/TextView;

    invoke-virtual {v3}, Landroid/widget/TextView;->getPaddingLeft()I

    move-result v3

    add-int/2addr v0, v3

    iget-object v3, p0, Lacb;->I:Landroid/widget/TextView;

    .line 2081
    invoke-virtual {v3}, Landroid/widget/TextView;->getPaddingRight()I

    move-result v3

    add-int v8, v0, v3

    .line 2082
    iget v0, p0, Lacb;->m:F

    float-to-int v7, v0

    .line 2083
    sget-object v0, Landroid/graphics/Bitmap$Config;->ARGB_8888:Landroid/graphics/Bitmap$Config;

    invoke-static {v8, v7, v0}, Landroid/graphics/Bitmap;->createBitmap(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;

    move-result-object v9

    .line 2084
    new-instance v0, Landroid/graphics/Canvas;

    invoke-direct {v0, v9}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V

    .line 2086
    invoke-virtual {p0}, Lacb;->getLayout()Landroid/text/Layout;

    move-result-object v3

    .line 2087
    if-eqz v3, :cond_0

    .line 2088
    invoke-virtual {v3, v2}, Landroid/text/Layout;->getLineDescent(I)I

    move-result v3

    sub-int v3, v7, v3

    move v5, v3

    .line 2090
    :goto_0
    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v3

    const/4 v4, 0x0

    int-to-float v5, v5

    iget-object v6, p0, Lacb;->v:Landroid/graphics/Paint;

    invoke-virtual/range {v0 .. v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;IIFFLandroid/graphics/Paint;)V

    .line 2092
    new-instance v0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-virtual {p0}, Lacb;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    invoke-direct {v0, v1, v9}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V

    .line 2093
    invoke-virtual {v0, v2, v2, v8, v7}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 2094
    new-instance v1, Lacs;

    invoke-direct {v1, p0, v0}, Lacs;-><init>(Lacb;Landroid/graphics/drawable/Drawable;)V

    return-object v1

    :cond_0
    move v5, v7

    goto :goto_0
.end method

.method private e(Lacx;)Lacx;
    .locals 6

    .prologue
    .line 1999
    if-nez p1, :cond_1

    .line 2000
    const/4 p1, 0x0

    .line 2018
    :cond_0
    :goto_0
    return-object p1

    .line 40235
    :cond_1
    iget-object v0, p1, Lacx;->d:Ljava/lang/String;

    .line 2007
    invoke-virtual {p0}, Lacb;->f()Z

    move-result v1

    if-nez v1, :cond_2

    .line 40247
    iget-wide v2, p1, Lacx;->g:J

    .line 2007
    const-wide/16 v4, -0x2

    cmp-long v1, v2, v4

    if-nez v1, :cond_2

    .line 41231
    iget-object v1, p1, Lacx;->c:Ljava/lang/String;

    .line 42119
    iget-boolean v2, p1, Lacx;->k:Z

    .line 2008
    invoke-static {v1, v0, v2}, Lacx;->a(Ljava/lang/String;Ljava/lang/String;Z)Lacx;

    move-result-object p1

    goto :goto_0

    .line 42247
    :cond_2
    iget-wide v2, p1, Lacx;->g:J

    .line 2010
    invoke-static {v2, v3}, Lacx;->a(J)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 43231
    iget-object v1, p1, Lacx;->c:Ljava/lang/String;

    .line 2011
    invoke-static {v1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    .line 44231
    iget-object v1, p1, Lacx;->c:Ljava/lang/String;

    .line 2012
    invoke-static {v1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p0, Lacb;->x:Landroid/widget/AutoCompleteTextView$Validator;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lacb;->x:Landroid/widget/AutoCompleteTextView$Validator;

    .line 2013
    invoke-interface {v1, v0}, Landroid/widget/AutoCompleteTextView$Validator;->isValid(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_0

    .line 45119
    :cond_3
    iget-boolean v1, p1, Lacx;->k:Z

    .line 2014
    invoke-static {v0, v1}, Lacx;->a(Ljava/lang/String;Z)Lacx;

    move-result-object p1

    goto :goto_0
.end method

.method static synthetic e(Lacb;)Landroid/os/Handler;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lacb;->y:Landroid/os/Handler;

    return-object v0
.end method

.method private e(Lada;)Z
    .locals 4

    .prologue
    .line 2285
    invoke-interface {p1}, Lada;->c()J

    move-result-wide v0

    .line 2286
    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    .line 2287
    invoke-virtual {p0}, Lacb;->f()Z

    move-result v2

    if-nez v2, :cond_1

    const-wide/16 v2, -0x2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private e(Ljava/lang/String;)Z
    .locals 1

    .prologue
    .line 2459
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lacb;->x:Landroid/widget/AutoCompleteTextView$Validator;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lacb;->x:Landroid/widget/AutoCompleteTextView$Validator;

    .line 2460
    invoke-interface {v0, p1}, Landroid/widget/AutoCompleteTextView$Validator;->isValid(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method private f(I)I
    .locals 2

    .prologue
    .line 2711
    invoke-virtual {p0}, Lacb;->length()I

    move-result v0

    if-lt p1, v0, :cond_1

    .line 2723
    :cond_0
    :goto_0
    return p1

    .line 2714
    :cond_1
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    .line 2715
    const/16 v1, 0x2c

    if-eq v0, v1, :cond_2

    const/16 v1, 0x3b

    if-ne v0, v1, :cond_3

    .line 2716
    :cond_2
    add-int/lit8 p1, p1, 0x1

    .line 2720
    :cond_3
    invoke-virtual {p0}, Lacb;->length()I

    move-result v0

    if-ge p1, v0, :cond_0

    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p1}, Ljava/lang/String;->charAt(I)C

    move-result v0

    const/16 v1, 0x20

    if-ne v0, v1, :cond_0

    .line 2721
    add-int/lit8 p1, p1, 0x1

    goto :goto_0
.end method

.method static synthetic f(Lacb;)I
    .locals 1

    .prologue
    .line 113
    iget v0, p0, Lacb;->J:I

    return v0
.end method

.method private f(Lada;)V
    .locals 5

    .prologue
    const/4 v4, -0x1

    .line 2319
    invoke-direct {p0, p1}, Lacb;->b(Lada;)I

    move-result v0

    .line 2320
    invoke-direct {p0, p1}, Lacb;->c(Lada;)I

    move-result v1

    .line 2321
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v2

    .line 2322
    const/4 v3, 0x0

    iput-object v3, p0, Lacb;->F:Lada;

    .line 2323
    if-eq v0, v4, :cond_0

    if-ne v1, v4, :cond_2

    .line 2324
    :cond_0
    const-string v0, "RecipientEditTextView"

    const-string v1, "The chip doesn\'t exist or may be a chip a user was editing"

    invoke-static {v0, v1}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I

    .line 2325
    invoke-interface {v2}, Landroid/text/Editable;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Lacb;->setSelection(I)V

    .line 2326
    invoke-direct {p0}, Lacb;->n()Z

    .line 2340
    :cond_1
    :goto_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lacb;->setCursorVisible(Z)V

    .line 2341
    invoke-interface {v2}, Landroid/text/Editable;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Lacb;->setSelection(I)V

    .line 2342
    invoke-direct {p0}, Lacb;->r()V

    .line 2343
    return-void

    .line 50688
    :cond_2
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v3

    .line 2328
    invoke-interface {v3, p1}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 2329
    const-string v3, ""

    invoke-static {v2, v0, v1, v3}, Landroid/text/method/QwertyKeyListener;->markAsReplaced(Landroid/text/Spannable;IILjava/lang/String;)V

    .line 2330
    invoke-interface {v2, p1}, Landroid/text/Editable;->removeSpan(Ljava/lang/Object;)V

    .line 2332
    :try_start_0
    iget-boolean v3, p0, Lacb;->N:Z

    if-nez v3, :cond_1

    .line 2333
    invoke-interface {p1}, Lada;->g()Lacx;

    move-result-object v3

    invoke-direct {p0, v3}, Lacb;->c(Lacx;)Lada;

    move-result-object v3

    const/16 v4, 0x21

    invoke-interface {v2, v3, v0, v1, v4}, Landroid/text/Editable;->setSpan(Ljava/lang/Object;III)V
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    .line 2336
    :catch_0
    move-exception v0

    .line 2337
    const-string v1, "RecipientEditTextView"

    invoke-virtual {v0}, Ljava/lang/NullPointerException;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    goto :goto_0
.end method

.method private g(Lada;)V
    .locals 7

    .prologue
    .line 2376
    .line 50689
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v2

    .line 2377
    invoke-interface {v2, p1}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v3

    .line 2378
    invoke-interface {v2, p1}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v0

    .line 2379
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v4

    .line 2381
    iget-object v1, p0, Lacb;->F:Lada;

    if-ne p1, v1, :cond_1

    const/4 v1, 0x1

    .line 2383
    :goto_0
    if-eqz v1, :cond_0

    .line 2384
    const/4 v5, 0x0

    iput-object v5, p0, Lacb;->F:Lada;

    .line 2387
    :cond_0
    :goto_1
    if-ltz v0, :cond_2

    invoke-interface {v4}, Landroid/text/Editable;->length()I

    move-result v5

    if-ge v0, v5, :cond_2

    invoke-interface {v4, v0}, Landroid/text/Editable;->charAt(I)C

    move-result v5

    const/16 v6, 0x20

    if-ne v5, v6, :cond_2

    .line 2388
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 2381
    :cond_1
    const/4 v1, 0x0

    goto :goto_0

    .line 2390
    :cond_2
    invoke-interface {v2, p1}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 2391
    if-ltz v3, :cond_3

    if-lez v0, :cond_3

    .line 2392
    invoke-interface {v4, v3, v0}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 2394
    :cond_3
    if-eqz v1, :cond_4

    .line 2395
    invoke-virtual {p0}, Lacb;->d()V

    .line 2397
    :cond_4
    return-void
.end method

.method static synthetic g(Lacb;)[I
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lacb;->a:[I

    return-object v0
.end method

.method static synthetic h()I
    .locals 1

    .prologue
    .line 113
    sget v0, Lacb;->f:I

    return v0
.end method

.method static synthetic h(Lacb;)Landroid/view/View;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lacb;->B:Landroid/view/View;

    return-object v0
.end method

.method private i()Lada;
    .locals 3

    .prologue
    .line 429
    const/4 v0, 0x0

    .line 430
    invoke-virtual {p0}, Lacb;->e()[Lada;

    move-result-object v1

    .line 431
    if-eqz v1, :cond_0

    array-length v2, v1

    if-lez v2, :cond_0

    .line 432
    array-length v0, v1

    add-int/lit8 v0, v0, -0x1

    aget-object v0, v1, v0

    .line 434
    :cond_0
    return-object v0
.end method

.method static synthetic i(Lacb;)Landroid/graphics/Rect;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lacb;->i:Landroid/graphics/Rect;

    return-object v0
.end method

.method static synthetic j(Lacb;)Landroid/graphics/Bitmap;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lacb;->G:Landroid/graphics/Bitmap;

    return-object v0
.end method

.method private j()V
    .locals 6

    .prologue
    const-wide/16 v2, -0x1

    .line 624
    iget-object v0, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    if-nez v0, :cond_0

    .line 679
    :goto_0
    return-void

    .line 627
    :cond_0
    iget-object v0, p0, Lacb;->F:Lada;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lacb;->F:Lada;

    invoke-interface {v0}, Lada;->g()Lacx;

    move-result-object v0

    .line 10247
    iget-wide v0, v0, Lacx;->g:J

    .line 628
    :goto_1
    iget-object v4, p0, Lacb;->F:Lada;

    if-eqz v4, :cond_2

    cmp-long v2, v0, v2

    if-eqz v2, :cond_2

    .line 629
    invoke-virtual {p0}, Lacb;->f()Z

    move-result v2

    if-nez v2, :cond_2

    const-wide/16 v2, -0x2

    cmp-long v0, v0, v2

    if-eqz v0, :cond_2

    .line 630
    invoke-virtual {p0}, Lacb;->d()V

    .line 678
    :goto_2
    invoke-direct {p0}, Lacb;->q()V

    goto :goto_0

    :cond_1
    move-wide v0, v2

    .line 627
    goto :goto_1

    .line 632
    :cond_2
    invoke-virtual {p0}, Lacb;->getWidth()I

    move-result v0

    if-gtz v0, :cond_4

    .line 633
    iget-object v0, p0, Lacb;->y:Landroid/os/Handler;

    iget-object v1, p0, Lacb;->ab:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 635
    invoke-virtual {p0}, Lacb;->getVisibility()I

    move-result v0

    const/16 v1, 0x8

    if-ne v0, v1, :cond_3

    .line 638
    const/4 v0, 0x1

    iput-boolean v0, p0, Lacb;->O:Z

    goto :goto_0

    .line 645
    :cond_3
    iget-object v0, p0, Lacb;->y:Landroid/os/Handler;

    iget-object v1, p0, Lacb;->ab:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_0

    .line 651
    :cond_4
    iget v0, p0, Lacb;->L:I

    if-lez v0, :cond_6

    .line 652
    invoke-direct {p0}, Lacb;->l()V

    .line 676
    :cond_5
    :goto_3
    iget-object v0, p0, Lacb;->y:Landroid/os/Handler;

    iget-object v1, p0, Lacb;->V:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    goto :goto_2

    .line 654
    :cond_6
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 655
    invoke-virtual {p0}, Lacb;->getSelectionEnd()I

    move-result v2

    .line 656
    iget-object v0, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    invoke-interface {v0, v1, v2}, Landroid/widget/MultiAutoCompleteTextView$Tokenizer;->findTokenStart(Ljava/lang/CharSequence;I)I

    move-result v3

    .line 10626
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 658
    const-class v4, Lada;

    invoke-interface {v0, v3, v2, v4}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lada;

    .line 659
    if-eqz v0, :cond_7

    array-length v0, v0

    if-nez v0, :cond_5

    .line 660
    :cond_7
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v4

    .line 661
    iget-object v0, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    invoke-interface {v0, v4, v3}, Landroid/widget/MultiAutoCompleteTextView$Tokenizer;->findTokenEnd(Ljava/lang/CharSequence;I)I

    move-result v0

    .line 663
    invoke-interface {v4}, Landroid/text/Editable;->length()I

    move-result v5

    if-ge v0, v5, :cond_8

    invoke-interface {v4, v0}, Landroid/text/Editable;->charAt(I)C

    move-result v4

    const/16 v5, 0x2c

    if-ne v4, v5, :cond_8

    .line 664
    invoke-direct {p0, v0}, Lacb;->f(I)I

    move-result v0

    .line 668
    :cond_8
    invoke-virtual {p0}, Lacb;->getSelectionEnd()I

    move-result v4

    .line 669
    if-eq v0, v4, :cond_9

    .line 670
    invoke-direct {p0, v3, v0}, Lacb;->c(II)V

    goto :goto_3

    .line 672
    :cond_9
    invoke-direct {p0, v3, v2, v1}, Lacb;->a(IILandroid/text/Editable;)Z

    goto :goto_3
.end method

.method private k()Z
    .locals 4

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x1

    .line 827
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x11

    if-lt v0, v3, :cond_0

    .line 828
    invoke-virtual {p0}, Lacb;->getLayoutDirection()I

    move-result v0

    if-ne v0, v1, :cond_0

    move v0, v1

    .line 829
    :goto_0
    iget v3, p0, Lacb;->u:I

    if-nez v3, :cond_1

    move v3, v1

    .line 831
    :goto_1
    if-eqz v0, :cond_3

    if-nez v3, :cond_2

    :goto_2
    return v1

    :cond_0
    move v0, v2

    .line 828
    goto :goto_0

    :cond_1
    move v3, v2

    .line 829
    goto :goto_1

    :cond_2
    move v1, v2

    .line 831
    goto :goto_2

    :cond_3
    move v1, v3

    goto :goto_2
.end method

.method static synthetic k(Lacb;)Z
    .locals 1

    .prologue
    .line 113
    iget-boolean v0, p0, Lacb;->U:Z

    return v0
.end method

.method static synthetic l(Lacb;)Landroid/view/View;
    .locals 1

    .prologue
    .line 113
    const/4 v0, 0x0

    return-object v0
.end method

.method private l()V
    .locals 2

    .prologue
    .line 1114
    iget-object v0, p0, Lacb;->y:Landroid/os/Handler;

    iget-object v1, p0, Lacb;->aa:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1115
    iget-object v0, p0, Lacb;->y:Landroid/os/Handler;

    iget-object v1, p0, Lacb;->aa:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 1116
    return-void
.end method

.method static synthetic m(Lacb;)Landroid/widget/AdapterView$OnItemClickListener;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lacb;->E:Landroid/widget/AdapterView$OnItemClickListener;

    return-object v0
.end method

.method private m()Z
    .locals 1

    .prologue
    .line 1419
    const/16 v0, 0x82

    invoke-virtual {p0, v0}, Lacb;->focusSearch(I)Landroid/view/View;

    move-result-object v0

    .line 1420
    if-eqz v0, :cond_0

    .line 1421
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 1422
    const/4 v0, 0x1

    .line 1424
    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method static synthetic n(Lacb;)I
    .locals 1

    .prologue
    .line 113
    iget v0, p0, Lacb;->M:I

    return v0
.end method

.method private n()Z
    .locals 5

    .prologue
    const/4 v0, 0x0

    .line 1436
    iget-object v1, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    if-nez v1, :cond_1

    .line 1454
    :cond_0
    :goto_0
    return v0

    .line 1439
    :cond_1
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 1440
    invoke-virtual {p0}, Lacb;->getSelectionEnd()I

    move-result v2

    .line 1441
    iget-object v3, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    invoke-interface {v3, v1, v2}, Landroid/widget/MultiAutoCompleteTextView$Tokenizer;->findTokenStart(Ljava/lang/CharSequence;I)I

    move-result v3

    .line 1443
    invoke-direct {p0, v3, v2}, Lacb;->a(II)Z

    move-result v4

    if-eqz v4, :cond_0

    .line 1444
    iget-object v0, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-interface {v0, v4, v3}, Landroid/widget/MultiAutoCompleteTextView$Tokenizer;->findTokenEnd(Ljava/lang/CharSequence;I)I

    move-result v0

    .line 1447
    invoke-direct {p0, v0}, Lacb;->f(I)I

    move-result v0

    .line 1448
    invoke-virtual {p0}, Lacb;->getSelectionEnd()I

    move-result v4

    if-eq v0, v4, :cond_2

    .line 1449
    invoke-direct {p0, v3, v0}, Lacb;->c(II)V

    .line 1450
    const/4 v0, 0x1

    goto :goto_0

    .line 1452
    :cond_2
    invoke-direct {p0, v3, v2, v1}, Lacb;->a(IILandroid/text/Editable;)Z

    move-result v0

    goto :goto_0
.end method

.method static synthetic o(Lacb;)Ladc;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lacb;->H:Ladc;

    return-object v0
.end method

.method private o()V
    .locals 5

    .prologue
    .line 1525
    iget v0, p0, Lacb;->L:I

    if-lez v0, :cond_1

    .line 1553
    :cond_0
    :goto_0
    return-void

    .line 1529
    :cond_1
    invoke-virtual {p0}, Lacb;->e()[Lada;

    move-result-object v1

    .line 1530
    if-eqz v1, :cond_0

    array-length v0, v1

    if-lez v0, :cond_0

    .line 1531
    array-length v0, v1

    add-int/lit8 v0, v0, -0x1

    aget-object v2, v1, v0

    .line 1532
    const/4 v0, 0x0

    .line 1533
    array-length v3, v1

    const/4 v4, 0x1

    if-le v3, v4, :cond_2

    .line 1534
    array-length v0, v1

    add-int/lit8 v0, v0, -0x2

    aget-object v0, v1, v0

    .line 1536
    :cond_2
    const/4 v1, 0x0

    .line 28626
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v3

    .line 1537
    invoke-interface {v3, v2}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v2

    .line 1538
    if-eqz v0, :cond_4

    .line 29626
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 1539
    invoke-interface {v1, v0}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v0

    .line 1540
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 1541
    const/4 v3, -0x1

    if-eq v0, v3, :cond_0

    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v3

    add-int/lit8 v3, v3, -0x1

    if-gt v0, v3, :cond_0

    .line 1545
    invoke-interface {v1, v0}, Landroid/text/Editable;->charAt(I)C

    move-result v1

    const/16 v3, 0x20

    if-ne v1, v3, :cond_3

    .line 1546
    add-int/lit8 v0, v0, 0x1

    .line 1549
    :cond_3
    :goto_1
    if-ltz v0, :cond_0

    if-ltz v2, :cond_0

    if-ge v0, v2, :cond_0

    .line 1550
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1, v0, v2}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    goto :goto_0

    :cond_4
    move v0, v1

    goto :goto_1
.end method

.method private p()Landroid/graphics/drawable/StateListDrawable;
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 1795
    new-instance v0, Landroid/graphics/drawable/StateListDrawable;

    invoke-direct {v0}, Landroid/graphics/drawable/StateListDrawable;-><init>()V

    .line 1796
    iget-boolean v1, p0, Lacb;->s:Z

    if-nez v1, :cond_0

    .line 1797
    const/4 v1, 0x1

    new-array v1, v1, [I

    const v2, 0x10102fe

    aput v2, v1, v3

    iget-object v2, p0, Lacb;->k:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 1799
    :cond_0
    new-array v1, v3, [I

    const/4 v2, 0x0

    invoke-virtual {v0, v1, v2}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V

    .line 1800
    return-object v0
.end method

.method static synthetic p(Lacb;)Z
    .locals 1

    .prologue
    .line 113
    .line 50785
    iget v0, p0, Lacb;->L:I

    if-gtz v0, :cond_0

    iget-object v0, p0, Lacb;->Q:Ljava/util/ArrayList;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lacb;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    .line 113
    goto :goto_0
.end method

.method private q()V
    .locals 15

    .prologue
    const/16 v14, 0x21

    const/4 v5, 0x2

    const/4 v1, 0x0

    .line 2137
    iget-boolean v0, p0, Lacb;->N:Z

    if-eqz v0, :cond_4

    .line 47100
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v4

    move v0, v1

    move v3, v1

    move v2, v1

    .line 47103
    :goto_0
    if-ge v0, v5, :cond_0

    .line 47104
    iget-object v3, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    invoke-interface {v3, v4, v2}, Landroid/widget/MultiAutoCompleteTextView$Tokenizer;->findTokenEnd(Ljava/lang/CharSequence;I)I

    move-result v2

    invoke-direct {p0, v2}, Lacb;->f(I)I

    move-result v2

    .line 47103
    add-int/lit8 v0, v0, 0x1

    move v3, v2

    goto :goto_0

    :cond_0
    move v0, v1

    move v2, v1

    .line 47120
    :cond_1
    invoke-interface {v4}, Landroid/text/Editable;->length()I

    move-result v5

    if-ge v0, v5, :cond_2

    .line 47121
    iget-object v5, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    invoke-interface {v5, v4, v0}, Landroid/widget/MultiAutoCompleteTextView$Tokenizer;->findTokenEnd(Ljava/lang/CharSequence;I)I

    move-result v0

    invoke-direct {p0, v0}, Lacb;->f(I)I

    move-result v0

    .line 47122
    add-int/lit8 v2, v2, 0x1

    .line 47123
    invoke-interface {v4}, Landroid/text/Editable;->length()I

    move-result v5

    if-lt v0, v5, :cond_1

    .line 47109
    :cond_2
    add-int/lit8 v0, v2, -0x2

    invoke-direct {p0, v0}, Lacb;->e(I)Lacs;

    move-result-object v0

    .line 47110
    new-instance v2, Landroid/text/SpannableString;

    invoke-interface {v4}, Landroid/text/Editable;->length()I

    move-result v5

    invoke-interface {v4, v3, v5}, Landroid/text/Editable;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v5

    invoke-direct {v2, v5}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 47111
    invoke-virtual {v2}, Landroid/text/SpannableString;->length()I

    move-result v5

    invoke-virtual {v2, v0, v1, v5, v14}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 47112
    invoke-interface {v4}, Landroid/text/Editable;->length()I

    move-result v1

    invoke-interface {v4, v3, v1, v2}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 47113
    iput-object v0, p0, Lacb;->H:Ladc;

    .line 2192
    :cond_3
    :goto_1
    return-void

    .line 2142
    :cond_4
    iget-boolean v0, p0, Lacb;->b:Z

    if-eqz v0, :cond_3

    .line 47626
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 2145
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-interface {v2}, Landroid/text/Editable;->length()I

    move-result v2

    const-class v3, Lacs;

    invoke-interface {v0, v1, v2, v3}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ladc;

    .line 2147
    array-length v2, v0

    if-lez v2, :cond_5

    .line 48626
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v2

    .line 2148
    aget-object v0, v0, v1

    invoke-interface {v2, v0}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 2150
    :cond_5
    invoke-virtual {p0}, Lacb;->e()[Lada;

    move-result-object v4

    .line 2152
    if-eqz v4, :cond_6

    array-length v0, v4

    if-gt v0, v5, :cond_7

    .line 2153
    :cond_6
    const/4 v0, 0x0

    iput-object v0, p0, Lacb;->H:Ladc;

    goto :goto_1

    .line 49626
    :cond_7
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v5

    .line 2157
    array-length v6, v4

    .line 2158
    add-int/lit8 v7, v6, -0x2

    .line 2159
    invoke-direct {p0, v7}, Lacb;->e(I)Lacs;

    move-result-object v8

    .line 2160
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    iput-object v0, p0, Lacb;->Q:Ljava/util/ArrayList;

    .line 2163
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v9

    .line 2164
    sub-int v0, v6, v7

    move v2, v1

    move v3, v1

    :goto_2
    array-length v10, v4

    if-ge v0, v10, :cond_c

    .line 2165
    iget-object v10, p0, Lacb;->Q:Ljava/util/ArrayList;

    aget-object v11, v4, v0

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 2166
    sub-int v10, v6, v7

    if-ne v0, v10, :cond_8

    .line 2167
    aget-object v3, v4, v0

    invoke-interface {v5, v3}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v3

    .line 2169
    :cond_8
    array-length v10, v4

    add-int/lit8 v10, v10, -0x1

    if-ne v0, v10, :cond_9

    .line 2170
    aget-object v2, v4, v0

    invoke-interface {v5, v2}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v2

    .line 2172
    :cond_9
    iget-object v10, p0, Lacb;->P:Ljava/util/ArrayList;

    if-eqz v10, :cond_a

    iget-object v10, p0, Lacb;->P:Ljava/util/ArrayList;

    aget-object v11, v4, v0

    invoke-virtual {v10, v11}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_b

    .line 2173
    :cond_a
    aget-object v10, v4, v0

    invoke-interface {v5, v10}, Landroid/text/Spannable;->getSpanStart(Ljava/lang/Object;)I

    move-result v10

    .line 2174
    aget-object v11, v4, v0

    invoke-interface {v5, v11}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v11

    .line 2175
    aget-object v12, v4, v0

    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v13, v10, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v10

    invoke-interface {v12, v10}, Lada;->a(Ljava/lang/String;)V

    .line 2177
    :cond_b
    aget-object v10, v4, v0

    invoke-interface {v5, v10}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 2164
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 2179
    :cond_c
    invoke-interface {v9}, Landroid/text/Editable;->length()I

    move-result v0

    if-ge v2, v0, :cond_d

    .line 2180
    invoke-interface {v9}, Landroid/text/Editable;->length()I

    move-result v2

    .line 2182
    :cond_d
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    move-result v0

    .line 2183
    invoke-static {v3, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    .line 2184
    new-instance v3, Landroid/text/SpannableString;

    invoke-interface {v9, v2, v0}, Landroid/text/Editable;->subSequence(II)Ljava/lang/CharSequence;

    move-result-object v4

    invoke-direct {v3, v4}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 2185
    invoke-virtual {v3}, Landroid/text/SpannableString;->length()I

    move-result v4

    invoke-virtual {v3, v8, v1, v4, v14}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 2186
    invoke-interface {v9, v2, v0, v3}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 2187
    iput-object v8, p0, Lacb;->H:Ladc;

    .line 2189
    invoke-virtual {p0}, Lacb;->f()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lacb;->getLineCount()I

    move-result v0

    iget v1, p0, Lacb;->t:I

    if-le v0, v1, :cond_3

    .line 2190
    invoke-virtual {p0}, Lacb;->getLineCount()I

    move-result v0

    invoke-virtual {p0, v0}, Lacb;->setMaxLines(I)V

    goto/16 :goto_1
.end method

.method static synthetic q(Lacb;)V
    .locals 4

    .prologue
    .line 113
    .line 50786
    iget-object v0, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    if-eqz v0, :cond_1

    .line 50789
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 50790
    invoke-virtual {p0}, Lacb;->getSelectionEnd()I

    move-result v1

    .line 50791
    iget-object v2, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    invoke-interface {v2, v0, v1}, Landroid/widget/MultiAutoCompleteTextView$Tokenizer;->findTokenStart(Ljava/lang/CharSequence;I)I

    move-result v2

    .line 50792
    invoke-direct {p0, v2, v1}, Lacb;->a(II)Z

    move-result v3

    if-eqz v3, :cond_0

    .line 50793
    invoke-direct {p0, v2, v1, v0}, Lacb;->a(IILandroid/text/Editable;)Z

    .line 50795
    :cond_0
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Lacb;->setSelection(I)V

    .line 113
    :cond_1
    return-void
.end method

.method static synthetic r(Lacb;)Landroid/widget/MultiAutoCompleteTextView$Tokenizer;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    return-object v0
.end method

.method private r()V
    .locals 1

    .prologue
    .line 2362
    iget-object v0, p0, Lacb;->C:Landroid/widget/ListPopupWindow;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lacb;->C:Landroid/widget/ListPopupWindow;

    invoke-virtual {v0}, Landroid/widget/ListPopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2363
    iget-object v0, p0, Lacb;->C:Landroid/widget/ListPopupWindow;

    invoke-virtual {v0}, Landroid/widget/ListPopupWindow;->dismiss()V

    .line 2365
    :cond_0
    iget-object v0, p0, Lacb;->D:Landroid/widget/ListPopupWindow;

    if-eqz v0, :cond_1

    iget-object v0, p0, Lacb;->D:Landroid/widget/ListPopupWindow;

    invoke-virtual {v0}, Landroid/widget/ListPopupWindow;->isShowing()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 2366
    iget-object v0, p0, Lacb;->D:Landroid/widget/ListPopupWindow;

    invoke-virtual {v0}, Landroid/widget/ListPopupWindow;->dismiss()V

    .line 2368
    :cond_1
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Lacb;->setSelection(I)V

    .line 2369
    return-void
.end method

.method static synthetic s(Lacb;)Z
    .locals 1

    .prologue
    .line 113
    iget-boolean v0, p0, Lacb;->N:Z

    return v0
.end method

.method static synthetic t(Lacb;)Ljava/util/ArrayList;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lacb;->Q:Ljava/util/ArrayList;

    return-object v0
.end method

.method static synthetic u(Lacb;)Lacp;
    .locals 1

    .prologue
    .line 113
    iget-object v0, p0, Lacb;->W:Lacp;

    return-object v0
.end method

.method static synthetic v(Lacb;)F
    .locals 1

    .prologue
    .line 113
    iget v0, p0, Lacb;->o:F

    return v0
.end method


# virtual methods
.method final a(Lacx;)Ljava/lang/String;
    .locals 5

    .prologue
    const/4 v1, 0x0

    .line 1879
    .line 38231
    iget-object v0, p1, Lacx;->c:Ljava/lang/String;

    .line 38235
    iget-object v2, p1, Lacx;->d:Ljava/lang/String;

    .line 1881
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_0

    invoke-static {v0, v2}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    :cond_0
    move-object v0, v1

    .line 1885
    :cond_1
    invoke-virtual {p0}, Lacb;->f()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-static {v2}, Lacb;->b(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 1886
    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 1899
    :goto_0
    const-string v1, ","

    invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v1

    .line 1900
    iget-object v2, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    if-eqz v2, :cond_2

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 1901
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    if-ge v1, v2, :cond_2

    iget-object v1, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    .line 1902
    invoke-interface {v1, v0}, Landroid/widget/MultiAutoCompleteTextView$Tokenizer;->terminateToken(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    :cond_2
    return-object v0

    .line 1888
    :cond_3
    if-eqz v2, :cond_4

    .line 1891
    invoke-static {v2}, Landroid/text/util/Rfc822Tokenizer;->tokenize(Ljava/lang/CharSequence;)[Landroid/text/util/Rfc822Token;

    move-result-object v3

    .line 1892
    if-eqz v3, :cond_4

    array-length v4, v3

    if-lez v4, :cond_4

    .line 1893
    const/4 v2, 0x0

    aget-object v2, v3, v2

    invoke-virtual {v2}, Landroid/text/util/Rfc822Token;->getAddress()Ljava/lang/String;

    move-result-object v2

    .line 1896
    :cond_4
    new-instance v3, Landroid/text/util/Rfc822Token;

    invoke-direct {v3, v0, v2, v1}, Landroid/text/util/Rfc822Token;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1897
    invoke-virtual {v3}, Landroid/text/util/Rfc822Token;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public final a()V
    .locals 1

    .prologue
    .line 2347
    iget-object v0, p0, Lacb;->F:Lada;

    if-eqz v0, :cond_0

    .line 2348
    iget-object v0, p0, Lacb;->F:Lada;

    invoke-direct {p0, v0}, Lacb;->g(Lada;)V

    .line 2350
    :cond_0
    invoke-direct {p0}, Lacb;->r()V

    .line 2351
    return-void
.end method

.method public final a(I)V
    .locals 2

    .prologue
    .line 1805
    iget-object v0, p0, Lacb;->C:Landroid/widget/ListPopupWindow;

    invoke-virtual {v0}, Landroid/widget/ListPopupWindow;->getListView()Landroid/widget/ListView;

    move-result-object v0

    .line 1806
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/widget/ListView;->getCheckedItemCount()I

    move-result v1

    if-nez v1, :cond_0

    .line 1807
    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Landroid/widget/ListView;->setItemChecked(IZ)V

    .line 1809
    :cond_0
    iput p1, p0, Lacb;->M:I

    .line 1810
    return-void
.end method

.method final a(Lada;Lacx;)V
    .locals 8

    .prologue
    const/4 v2, 0x1

    const/4 v3, 0x0

    const/4 v7, -0x1

    .line 2405
    iget-object v0, p0, Lacb;->F:Lada;

    if-ne p1, v0, :cond_4

    move v1, v2

    .line 2406
    :goto_0
    if-eqz v1, :cond_0

    .line 2407
    const/4 v0, 0x0

    iput-object v0, p0, Lacb;->F:Lada;

    .line 2409
    :cond_0
    invoke-direct {p0, p1}, Lacb;->b(Lada;)I

    move-result v4

    .line 2410
    invoke-direct {p0, p1}, Lacb;->c(Lada;)I

    move-result v0

    .line 50690
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v5

    .line 2411
    invoke-interface {v5, p1}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 2412
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v5

    .line 2413
    invoke-direct {p0, p2}, Lacb;->d(Lacx;)Ljava/lang/CharSequence;

    move-result-object v6

    .line 2414
    if-eqz v6, :cond_2

    .line 2415
    if-eq v4, v7, :cond_1

    if-ne v0, v7, :cond_5

    .line 2416
    :cond_1
    const-string v0, "RecipientEditTextView"

    const-string v4, "The chip to replace does not exist but should."

    invoke-static {v0, v4}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 2417
    invoke-interface {v5, v3, v6}, Landroid/text/Editable;->insert(ILjava/lang/CharSequence;)Landroid/text/Editable;

    .line 2431
    :cond_2
    :goto_1
    invoke-virtual {p0, v2}, Lacb;->setCursorVisible(Z)V

    .line 2432
    if-eqz v1, :cond_3

    .line 2433
    invoke-virtual {p0}, Lacb;->d()V

    .line 2435
    :cond_3
    return-void

    :cond_4
    move v1, v3

    .line 2405
    goto :goto_0

    .line 2419
    :cond_5
    invoke-static {v6}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 2423
    :goto_2
    if-ltz v0, :cond_6

    invoke-interface {v5}, Landroid/text/Editable;->length()I

    move-result v3

    if-ge v0, v3, :cond_6

    .line 2424
    invoke-interface {v5, v0}, Landroid/text/Editable;->charAt(I)C

    move-result v3

    const/16 v7, 0x20

    if-ne v3, v7, :cond_6

    .line 2425
    add-int/lit8 v0, v0, 0x1

    goto :goto_2

    .line 2427
    :cond_6
    invoke-interface {v5, v4, v0, v6}, Landroid/text/Editable;->replace(IILjava/lang/CharSequence;)Landroid/text/Editable;

    goto :goto_1
.end method

.method public final a(Lada;)Z
    .locals 4

    .prologue
    .line 2584
    invoke-interface {p1}, Lada;->c()J

    move-result-wide v0

    .line 2585
    const-wide/16 v2, -0x1

    cmp-long v2, v0, v2

    if-eqz v2, :cond_0

    .line 2586
    invoke-virtual {p0}, Lacb;->f()Z

    move-result v2

    if-nez v2, :cond_1

    const-wide/16 v2, -0x2

    cmp-long v0, v0, v2

    if-nez v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Ljava/lang/CharSequence;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 2573
    invoke-virtual {p0}, Lacb;->getSelectionEnd()I

    move-result v0

    if-nez v0, :cond_2

    move v0, v1

    .line 2574
    :goto_0
    invoke-virtual {p0}, Lacb;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x1

    .line 2575
    if-eq v0, v2, :cond_3

    .line 2576
    invoke-interface {p1, v0}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    .line 2580
    :goto_1
    const/16 v2, 0x2c

    if-eq v0, v2, :cond_0

    const/16 v2, 0x3b

    if-ne v0, v2, :cond_1

    :cond_0
    const/4 v1, 0x1

    :cond_1
    return v1

    .line 2573
    :cond_2
    invoke-virtual {p0}, Lacb;->getSelectionEnd()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    goto :goto_0

    .line 2578
    :cond_3
    invoke-interface {p1, v2}, Ljava/lang/CharSequence;->charAt(I)C

    move-result v0

    goto :goto_1
.end method

.method public append(Ljava/lang/CharSequence;II)V
    .locals 4

    .prologue
    .line 493
    iget-object v0, p0, Lacb;->z:Landroid/text/TextWatcher;

    if-eqz v0, :cond_0

    .line 494
    iget-object v0, p0, Lacb;->z:Landroid/text/TextWatcher;

    invoke-virtual {p0, v0}, Lacb;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 496
    :cond_0
    invoke-super {p0, p1, p2, p3}, Landroid/widget/MultiAutoCompleteTextView;->append(Ljava/lang/CharSequence;II)V

    .line 497
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-static {p1}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v0

    if-lez v0, :cond_2

    .line 498
    invoke-interface {p1}, Ljava/lang/CharSequence;->toString()Ljava/lang/String;

    move-result-object v0

    .line 500
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v1

    const-string v2, ","

    invoke-virtual {v1, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_1

    .line 502
    sget-object v1, Lacb;->d:Ljava/lang/String;

    const/4 v2, 0x0

    sget-object v3, Lacb;->d:Ljava/lang/String;

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    invoke-super {p0, v1, v2, v3}, Landroid/widget/MultiAutoCompleteTextView;->append(Ljava/lang/CharSequence;II)V

    .line 503
    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    sget-object v0, Lacb;->d:Ljava/lang/String;

    invoke-static {v0}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v2

    if-eqz v2, :cond_4

    invoke-virtual {v1, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    .line 506
    :cond_1
    :goto_0
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-nez v1, :cond_2

    .line 507
    invoke-static {v0}, Landroid/text/TextUtils;->getTrimmedLength(Ljava/lang/CharSequence;)I

    move-result v1

    if-lez v1, :cond_2

    .line 508
    iget v1, p0, Lacb;->L:I

    add-int/lit8 v1, v1, 0x1

    iput v1, p0, Lacb;->L:I

    .line 509
    iget-object v1, p0, Lacb;->K:Ljava/util/ArrayList;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 514
    :cond_2
    iget v0, p0, Lacb;->L:I

    if-lez v0, :cond_3

    .line 515
    invoke-direct {p0}, Lacb;->l()V

    .line 517
    :cond_3
    iget-object v0, p0, Lacb;->y:Landroid/os/Handler;

    iget-object v1, p0, Lacb;->V:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 518
    return-void

    .line 503
    :cond_4
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/lang/String;-><init>(Ljava/lang/String;)V

    goto :goto_0
.end method

.method public final b()V
    .locals 0

    .prologue
    .line 2358
    invoke-virtual {p0}, Lacb;->dismissDropDown()V

    .line 2359
    return-void
.end method

.method public final b(Lacx;)V
    .locals 10

    .prologue
    const/4 v2, 0x0

    .line 3153
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 3154
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v1

    const-class v3, Lada;

    invoke-interface {v0, v2, v1, v3}, Landroid/text/Editable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lada;

    .line 3156
    array-length v4, v0

    move v3, v2

    :goto_0
    if-ge v3, v4, :cond_2

    aget-object v5, v0, v3

    .line 3157
    invoke-interface {v5}, Lada;->g()Lacx;

    move-result-object v1

    .line 3158
    if-eqz v1, :cond_0

    .line 50758
    iget-boolean v6, v1, Lacx;->k:Z

    .line 3158
    if-eqz v6, :cond_0

    .line 50759
    if-eqz p1, :cond_1

    iget-wide v6, v1, Lacx;->g:J

    iget-wide v8, p1, Lacx;->g:J

    cmp-long v1, v6, v8

    if-nez v1, :cond_1

    const/4 v1, 0x1

    .line 3159
    :goto_1
    if-eqz v1, :cond_0

    .line 3160
    invoke-direct {p0, v5}, Lacb;->g(Lada;)V

    .line 3156
    :cond_0
    add-int/lit8 v1, v3, 0x1

    move v3, v1

    goto :goto_0

    :cond_1
    move v1, v2

    .line 50759
    goto :goto_1

    .line 3163
    :cond_2
    return-void
.end method

.method final c()V
    .locals 15

    .prologue
    const/16 v14, 0x2c

    const/4 v5, 0x1

    const/4 v1, 0x0

    const/4 v13, 0x2

    const/4 v4, 0x0

    .line 1136
    .line 24204
    invoke-virtual {p0}, Lacb;->getWidth()I

    move-result v0

    .line 1136
    if-gtz v0, :cond_1

    .line 1199
    :cond_0
    :goto_0
    return-void

    .line 1142
    :cond_1
    iget v0, p0, Lacb;->L:I

    if-lez v0, :cond_0

    .line 1146
    iget-object v8, p0, Lacb;->K:Ljava/util/ArrayList;

    monitor-enter v8

    .line 1147
    :try_start_0
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v9

    .line 1149
    iget v0, p0, Lacb;->L:I

    const/16 v2, 0x32

    if-gt v0, v2, :cond_e

    move v7, v4

    .line 1150
    :goto_1
    iget-object v0, p0, Lacb;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v7, v0, :cond_8

    .line 1151
    iget-object v0, p0, Lacb;->K:Ljava/util/ArrayList;

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1152
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I

    move-result v10

    .line 1154
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    add-int/2addr v0, v10

    add-int/lit8 v0, v0, -0x1

    .line 1155
    if-ltz v10, :cond_4

    .line 1158
    invoke-interface {v9}, Landroid/text/Editable;->length()I

    move-result v2

    add-int/lit8 v2, v2, -0x2

    if-ge v0, v2, :cond_13

    .line 1159
    invoke-interface {v9, v0}, Landroid/text/Editable;->charAt(I)C

    move-result v2

    if-ne v2, v14, :cond_13

    .line 1160
    add-int/lit8 v0, v0, 0x1

    move v6, v0

    .line 1162
    :goto_2
    if-lt v7, v13, :cond_2

    iget-boolean v0, p0, Lacb;->b:Z

    if-nez v0, :cond_5

    :cond_2
    move v3, v5

    .line 24247
    :goto_3
    invoke-direct {p0, v10, v6}, Lacb;->b(II)Z

    move-result v0

    if-nez v0, :cond_4

    .line 24252
    invoke-virtual {v9}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, v10, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    .line 24253
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    .line 24254
    const/16 v11, 0x2c

    invoke-virtual {v2, v11}, Ljava/lang/String;->lastIndexOf(I)I

    move-result v11

    .line 24255
    const/4 v12, -0x1

    if-eq v11, v12, :cond_12

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v12

    add-int/lit8 v12, v12, -0x1

    if-ne v11, v12, :cond_12

    .line 24256
    const/4 v0, 0x0

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v11

    add-int/lit8 v11, v11, -0x1

    invoke-virtual {v2, v0, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    move-result-object v0

    move-object v2, v0

    .line 24258
    :goto_4
    invoke-direct {p0, v2}, Lacb;->c(Ljava/lang/String;)Lacx;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    move-result-object v11

    .line 24259
    if-eqz v11, :cond_4

    .line 24262
    :try_start_1
    iget-boolean v0, p0, Lacb;->N:Z

    if-nez v0, :cond_7

    .line 24263
    if-eqz v3, :cond_6

    invoke-direct {p0, v11}, Lacb;->c(Lacx;)Lada;
    :try_end_1
    .catch Ljava/lang/NullPointerException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-result-object v0

    .line 24268
    :goto_5
    const/16 v3, 0x21

    :try_start_2
    invoke-interface {v9, v0, v10, v6, v3}, Landroid/text/Editable;->setSpan(Ljava/lang/Object;III)V

    .line 24270
    if-eqz v0, :cond_4

    .line 24271
    iget-object v3, p0, Lacb;->P:Ljava/util/ArrayList;

    if-nez v3, :cond_3

    .line 24272
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    iput-object v3, p0, Lacb;->P:Ljava/util/ArrayList;

    .line 24274
    :cond_3
    invoke-interface {v0, v2}, Lada;->a(Ljava/lang/String;)V

    .line 24275
    iget-object v2, p0, Lacb;->P:Ljava/util/ArrayList;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 1165
    :cond_4
    iget v0, p0, Lacb;->L:I

    add-int/lit8 v0, v0, -0x1

    iput v0, p0, Lacb;->L:I
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 1150
    add-int/lit8 v0, v7, 0x1

    move v7, v0

    goto/16 :goto_1

    :cond_5
    move v3, v4

    .line 1162
    goto :goto_3

    .line 24263
    :cond_6
    :try_start_3
    new-instance v0, Ladb;

    invoke-direct {v0, v11}, Ladb;-><init>(Lacx;)V
    :try_end_3
    .catch Ljava/lang/NullPointerException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    goto :goto_5

    .line 24265
    :catch_0
    move-exception v0

    .line 24266
    :try_start_4
    const-string v3, "RecipientEditTextView"

    invoke-virtual {v0}, Ljava/lang/NullPointerException;->getMessage()Ljava/lang/String;

    move-result-object v11

    invoke-static {v3, v11, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    :cond_7
    move-object v0, v1

    goto :goto_5

    .line 25213
    :cond_8
    iget v0, p0, Lacb;->L:I

    if-gtz v0, :cond_b

    .line 25217
    invoke-virtual {p0}, Lacb;->e()[Lada;

    move-result-object v0

    .line 25626
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v2

    .line 25219
    if-eqz v0, :cond_b

    array-length v0, v0

    if-lez v0, :cond_b

    .line 26626
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 26070
    const/4 v3, 0x0

    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v4

    invoke-interface {v4}, Landroid/text/Editable;->length()I

    move-result v4

    const-class v5, Lacs;

    invoke-interface {v0, v3, v4, v5}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lacs;

    .line 26072
    if-eqz v0, :cond_9

    array-length v3, v0

    if-lez v3, :cond_9

    const/4 v1, 0x0

    aget-object v1, v0, v1

    .line 25221
    :cond_9
    iput-object v1, p0, Lacb;->H:Ladc;

    .line 25222
    iget-object v0, p0, Lacb;->H:Ladc;

    if-eqz v0, :cond_d

    .line 25223
    iget-object v0, p0, Lacb;->H:Ladc;

    invoke-interface {v2, v0}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v0

    .line 25227
    :goto_6
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 25228
    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v2

    .line 25229
    if-le v2, v0, :cond_b

    .line 25231
    const-string v3, "RecipientEditTextView"

    const/4 v4, 0x3

    invoke-static {v3, v4}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    move-result v3

    if-eqz v3, :cond_a

    .line 25232
    invoke-static {v1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-static {v3}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v5

    add-int/lit8 v5, v5, 0x3d

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(I)V

    const-string v5, "There were extra characters after the last tokenizable entry."

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v4

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25235
    :cond_a
    add-int/lit8 v0, v0, 0x1

    invoke-interface {v1, v0, v2}, Landroid/text/Editable;->delete(II)Landroid/text/Editable;

    .line 1172
    :cond_b
    :goto_7
    iget-object v0, p0, Lacb;->P:Ljava/util/ArrayList;

    if-eqz v0, :cond_11

    iget-object v0, p0, Lacb;->P:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_11

    iget-object v0, p0, Lacb;->P:Ljava/util/ArrayList;

    .line 1173
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    const/16 v1, 0x32

    if-gt v0, v1, :cond_11

    .line 1174
    invoke-virtual {p0}, Lacb;->hasFocus()Z

    move-result v0

    if-nez v0, :cond_c

    iget-object v0, p0, Lacb;->P:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-ge v0, v13, :cond_f

    .line 1175
    :cond_c
    new-instance v0, Lact;

    .line 27726
    invoke-direct {v0, p0}, Lact;-><init>(Lacb;)V

    .line 1175
    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lact;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 1176
    const/4 v0, 0x0

    iput-object v0, p0, Lacb;->P:Ljava/util/ArrayList;

    .line 1197
    :goto_8
    const/4 v0, 0x0

    iput v0, p0, Lacb;->L:I

    .line 1198
    iget-object v0, p0, Lacb;->K:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    .line 1199
    monitor-exit v8

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    monitor-exit v8
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    throw v0

    .line 27626
    :cond_d
    :try_start_5
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 25225
    invoke-direct {p0}, Lacb;->i()Lada;

    move-result-object v1

    invoke-interface {v0, v1}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v0

    goto :goto_6

    .line 1169
    :cond_e
    const/4 v0, 0x1

    iput-boolean v0, p0, Lacb;->N:Z

    goto :goto_7

    .line 1179
    :cond_f
    new-instance v0, Lacp;

    .line 27898
    invoke-direct {v0, p0}, Lacp;-><init>(Lacb;)V

    .line 1179
    iput-object v0, p0, Lacb;->W:Lacp;

    .line 1180
    iget-object v0, p0, Lacb;->W:Lacp;

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/util/ArrayList;

    const/4 v2, 0x0

    new-instance v3, Ljava/util/ArrayList;

    iget-object v4, p0, Lacb;->P:Ljava/util/ArrayList;

    const/4 v5, 0x0

    const/4 v6, 0x2

    .line 1181
    invoke-virtual {v4, v5, v6}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    aput-object v3, v1, v2

    .line 1180
    invoke-virtual {v0, v1}, Lacp;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 1182
    iget-object v0, p0, Lacb;->P:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-le v0, v13, :cond_10

    .line 1183
    new-instance v0, Ljava/util/ArrayList;

    iget-object v1, p0, Lacb;->P:Ljava/util/ArrayList;

    const/4 v2, 0x2

    iget-object v3, p0, Lacb;->P:Ljava/util/ArrayList;

    .line 1185
    invoke-virtual {v3}, Ljava/util/ArrayList;->size()I

    move-result v3

    .line 1184
    invoke-virtual {v1, v2, v3}, Ljava/util/ArrayList;->subList(II)Ljava/util/List;

    move-result-object v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    iput-object v0, p0, Lacb;->P:Ljava/util/ArrayList;

    .line 1189
    :goto_9
    invoke-direct {p0}, Lacb;->q()V

    goto :goto_8

    .line 1187
    :cond_10
    const/4 v0, 0x0

    iput-object v0, p0, Lacb;->P:Ljava/util/ArrayList;

    goto :goto_9

    .line 1194
    :cond_11
    const/4 v0, 0x0

    iput-object v0, p0, Lacb;->P:Ljava/util/ArrayList;

    .line 1195
    invoke-direct {p0}, Lacb;->q()V
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    goto :goto_8

    :cond_12
    move-object v2, v0

    goto/16 :goto_4

    :cond_13
    move v6, v0

    goto/16 :goto_2
.end method

.method public final d()V
    .locals 1

    .prologue
    .line 1686
    iget-object v0, p0, Lacb;->F:Lada;

    if-eqz v0, :cond_0

    .line 1687
    iget-object v0, p0, Lacb;->F:Lada;

    invoke-direct {p0, v0}, Lacb;->f(Lada;)V

    .line 1688
    const/4 v0, 0x0

    iput-object v0, p0, Lacb;->F:Lada;

    .line 1690
    :cond_0
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lacb;->setCursorVisible(Z)V

    .line 1691
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    invoke-virtual {p0, v0}, Lacb;->setSelection(I)V

    .line 1692
    return-void
.end method

.method final e()[Lada;
    .locals 4

    .prologue
    .line 2023
    .line 45626
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 2023
    const/4 v1, 0x0

    .line 2024
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v2

    invoke-interface {v2}, Landroid/text/Editable;->length()I

    move-result v2

    const-class v3, Lada;

    invoke-interface {v0, v1, v2, v3}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lada;

    .line 2025
    new-instance v1, Ljava/util/ArrayList;

    .line 2026
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 46626
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 2028
    new-instance v2, Lacd;

    invoke-direct {v2, p0, v0}, Lacd;-><init>(Lacb;Landroid/text/Spannable;)V

    invoke-static {v1, v2}, Ljava/util/Collections;->sort(Ljava/util/List;Ljava/util/Comparator;)V

    .line 2043
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v0

    new-array v0, v0, [Lada;

    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lada;

    return-object v0
.end method

.method protected final f()Z
    .locals 2

    .prologue
    const/4 v1, 0x1

    .line 3115
    .line 50755
    invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Laav;

    .line 3115
    if-eqz v0, :cond_0

    .line 50756
    invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Laav;

    .line 50757
    iget v0, v0, Laav;->b:I

    .line 3116
    if-ne v0, v1, :cond_0

    move v0, v1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final g()Laav;
    .locals 1

    .prologue
    .line 3121
    invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Laav;

    return-object v0
.end method

.method public synthetic getAdapter()Landroid/widget/ListAdapter;
    .locals 1

    .prologue
    .line 113
    .line 50760
    invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Laav;

    .line 113
    return-object v0
.end method

.method public onActionItemClicked(Landroid/view/ActionMode;Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 2048
    const/4 v0, 0x0

    return v0
.end method

.method protected onAttachedToWindow()V
    .locals 2

    .prologue
    .line 372
    invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->onAttachedToWindow()V

    .line 373
    const/4 v0, 0x1

    iput-boolean v0, p0, Lacb;->U:Z

    .line 375
    invoke-virtual {p0}, Lacb;->getDropDownAnchor()I

    move-result v0

    .line 376
    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    .line 377
    invoke-virtual {p0}, Lacb;->getRootView()Landroid/view/View;

    move-result-object v1

    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lacb;->B:Landroid/view/View;

    .line 379
    :cond_0
    return-void
.end method

.method public onCreateActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 2065
    const/4 v0, 0x0

    return v0
.end method

.method public onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;
    .locals 3

    .prologue
    .line 407
    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->onCreateInputConnection(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;

    move-result-object v1

    .line 408
    iget v0, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    and-int/lit16 v0, v0, 0xff

    .line 409
    and-int/lit8 v2, v0, 0x6

    if-eqz v2, :cond_0

    .line 411
    iget v2, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    xor-int/2addr v0, v2

    iput v0, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 413
    iget v0, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    or-int/lit8 v0, v0, 0x6

    iput v0, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 415
    :cond_0
    iget v0, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    const/high16 v2, 0x40000000    # 2.0f

    and-int/2addr v0, v2

    if-eqz v0, :cond_1

    .line 416
    iget v0, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    const v2, -0x40000001    # -1.9999999f

    and-int/2addr v0, v2

    iput v0, p1, Landroid/view/inputmethod/EditorInfo;->imeOptions:I

    .line 419
    :cond_1
    const/4 v0, 0x6

    iput v0, p1, Landroid/view/inputmethod/EditorInfo;->actionId:I

    .line 423
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x15

    if-lt v0, v2, :cond_2

    const/4 v0, 0x0

    .line 424
    :goto_0
    iput-object v0, p1, Landroid/view/inputmethod/EditorInfo;->actionLabel:Ljava/lang/CharSequence;

    .line 425
    return-object v1

    .line 424
    :cond_2
    invoke-virtual {p0}, Lacb;->getContext()Landroid/content/Context;

    move-result-object v0

    sget v2, La;->cR:I

    invoke-virtual {v0, v2}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object v0

    goto :goto_0
.end method

.method public onDestroyActionMode(Landroid/view/ActionMode;)V
    .locals 0

    .prologue
    .line 2053
    return-void
.end method

.method protected onDetachedFromWindow()V
    .locals 1

    .prologue
    .line 365
    invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->onDetachedFromWindow()V

    .line 366
    const/4 v0, 0x0

    iput-boolean v0, p0, Lacb;->U:Z

    .line 367
    invoke-direct {p0}, Lacb;->r()V

    .line 368
    return-void
.end method

.method public onDown(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 2960
    const/4 v0, 0x0

    return v0
.end method

.method public onDragEvent(Landroid/view/DragEvent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 3049
    invoke-virtual {p1}, Landroid/view/DragEvent;->getAction()I

    move-result v1

    packed-switch v1, :pswitch_data_0

    .line 3060
    :pswitch_0
    const/4 v0, 0x0

    :goto_0
    return v0

    .line 3052
    :pswitch_1
    invoke-virtual {p1}, Landroid/view/DragEvent;->getClipDescription()Landroid/content/ClipDescription;

    move-result-object v0

    const-string v1, "text/plain"

    invoke-virtual {v0, v1}, Landroid/content/ClipDescription;->hasMimeType(Ljava/lang/String;)Z

    move-result v0

    goto :goto_0

    .line 3054
    :pswitch_2
    invoke-virtual {p0}, Lacb;->requestFocus()Z

    goto :goto_0

    .line 3057
    :pswitch_3
    invoke-virtual {p1}, Landroid/view/DragEvent;->getClipData()Landroid/content/ClipData;

    move-result-object v1

    invoke-direct {p0, v1}, Lacb;->a(Landroid/content/ClipData;)V

    goto :goto_0

    .line 3049
    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_0
        :pswitch_3
        :pswitch_0
        :pswitch_2
    .end packed-switch
.end method

.method public onEditorAction(Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 391
    const/4 v1, 0x6

    if-ne p2, v1, :cond_3

    .line 392
    invoke-direct {p0}, Lacb;->n()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 402
    :cond_0
    :goto_0
    return v0

    .line 395
    :cond_1
    iget-object v1, p0, Lacb;->F:Lada;

    if-eqz v1, :cond_2

    .line 396
    invoke-virtual {p0}, Lacb;->d()V

    goto :goto_0

    .line 398
    :cond_2
    invoke-direct {p0}, Lacb;->m()Z

    move-result v1

    if-nez v1, :cond_0

    .line 402
    :cond_3
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public onFling(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    .prologue
    .line 2966
    const/4 v0, 0x0

    return v0
.end method

.method public onFocusChanged(ZILandroid/graphics/Rect;)V
    .locals 8

    .prologue
    const/4 v7, 0x0

    const/4 v3, 0x0

    .line 522
    invoke-super {p0, p1, p2, p3}, Landroid/widget/MultiAutoCompleteTextView;->onFocusChanged(ZILandroid/graphics/Rect;)V

    .line 523
    if-nez p1, :cond_1

    .line 524
    invoke-direct {p0}, Lacb;->j()V

    .line 528
    :cond_0
    :goto_0
    return-void

    .line 7682
    :cond_1
    iget-boolean v0, p0, Lacb;->b:Z

    if-eqz v0, :cond_2

    .line 7683
    const v0, 0x7fffffff

    invoke-virtual {p0, v0}, Lacb;->setMaxLines(I)V

    .line 8200
    :cond_2
    iget-object v0, p0, Lacb;->H:Ladc;

    if-eqz v0, :cond_3

    .line 8626
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 8202
    iget-object v1, p0, Lacb;->H:Ladc;

    invoke-interface {v0, v1}, Landroid/text/Spannable;->removeSpan(Ljava/lang/Object;)V

    .line 8203
    iput-object v7, p0, Lacb;->H:Ladc;

    .line 8205
    iget-object v1, p0, Lacb;->Q:Ljava/util/ArrayList;

    if-eqz v1, :cond_3

    iget-object v1, p0, Lacb;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v1

    if-lez v1, :cond_3

    .line 8207
    invoke-virtual {p0}, Lacb;->e()[Lada;

    move-result-object v1

    .line 8210
    if-eqz v1, :cond_3

    array-length v2, v1

    if-nez v2, :cond_4

    .line 7686
    :cond_3
    :goto_1
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Lacb;->setCursorVisible(Z)V

    .line 7687
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    .line 7688
    if-eqz v0, :cond_7

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v1

    if-lez v1, :cond_7

    invoke-interface {v0}, Landroid/text/Editable;->length()I

    move-result v0

    :goto_2
    invoke-virtual {p0, v0}, Lacb;->setSelection(I)V

    .line 7691
    iget-object v0, p0, Lacb;->P:Ljava/util/ArrayList;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lacb;->P:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_0

    .line 7692
    new-instance v0, Lact;

    .line 8726
    invoke-direct {v0, p0}, Lact;-><init>(Lacb;)V

    .line 7692
    new-array v1, v3, [Ljava/lang/Void;

    invoke-virtual {v0, v1}, Lact;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;

    .line 7693
    iput-object v7, p0, Lacb;->P:Ljava/util/ArrayList;

    goto :goto_0

    .line 8213
    :cond_4
    array-length v2, v1

    add-int/lit8 v2, v2, -0x1

    aget-object v1, v1, v2

    invoke-interface {v0, v1}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v0

    .line 8214
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v4

    .line 8215
    iget-object v1, p0, Lacb;->Q:Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v2, v0

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lada;

    .line 8220
    invoke-interface {v0}, Lada;->h()Ljava/lang/CharSequence;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 8225
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v6, v1, v2}, Ljava/lang/String;->indexOf(Ljava/lang/String;I)I

    move-result v2

    .line 8226
    invoke-interface {v4}, Landroid/text/Editable;->length()I

    move-result v6

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    add-int/2addr v1, v2

    invoke-static {v6, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 8228
    const/4 v6, -0x1

    if-eq v2, v6, :cond_5

    .line 8229
    const/16 v6, 0x21

    invoke-interface {v4, v0, v2, v1, v6}, Landroid/text/Editable;->setSpan(Ljava/lang/Object;III)V

    :cond_5
    move v2, v1

    .line 8232
    goto :goto_3

    .line 8233
    :cond_6
    iget-object v0, p0, Lacb;->Q:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V

    goto :goto_1

    :cond_7
    move v0, v3

    .line 7688
    goto :goto_2
.end method

.method public onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    .prologue
    .line 1957
    if-gez p3, :cond_1

    .line 1975
    :cond_0
    :goto_0
    return-void

    .line 39121
    :cond_1
    invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->getAdapter()Landroid/widget/ListAdapter;

    move-result-object v0

    check-cast v0, Laav;

    .line 1961
    invoke-virtual {v0, p3}, Laav;->a(I)Lacx;

    move-result-object v0

    .line 39227
    iget v0, v0, Lacx;->a:I

    .line 1962
    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    .line 1970
    invoke-direct {p0, p3}, Lacb;->d(I)I

    goto :goto_0
.end method

.method public onKeyDown(ILandroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    const/4 v0, 0x1

    .line 1597
    iget-object v1, p0, Lacb;->F:Lada;

    if-eqz v1, :cond_1

    const/16 v1, 0x43

    if-ne p1, v1, :cond_1

    .line 1598
    iget-object v1, p0, Lacb;->C:Landroid/widget/ListPopupWindow;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lacb;->C:Landroid/widget/ListPopupWindow;

    invoke-virtual {v1}, Landroid/widget/ListPopupWindow;->isShowing()Z

    move-result v1

    if-eqz v1, :cond_0

    .line 1599
    iget-object v1, p0, Lacb;->C:Landroid/widget/ListPopupWindow;

    invoke-virtual {v1}, Landroid/widget/ListPopupWindow;->dismiss()V

    .line 1601
    :cond_0
    iget-object v1, p0, Lacb;->F:Lada;

    invoke-direct {p0, v1}, Lacb;->g(Lada;)V

    .line 1604
    :cond_1
    sparse-switch p1, :sswitch_data_0

    .line 1621
    :cond_2
    invoke-super {p0, p1, p2}, Landroid/widget/MultiAutoCompleteTextView;->onKeyDown(ILandroid/view/KeyEvent;)Z

    move-result v0

    :cond_3
    :goto_0
    return v0

    .line 1607
    :sswitch_0
    invoke-virtual {p2}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 1608
    invoke-direct {p0}, Lacb;->n()Z

    move-result v1

    if-nez v1, :cond_3

    .line 1611
    iget-object v1, p0, Lacb;->F:Lada;

    if-eqz v1, :cond_4

    .line 1612
    invoke-virtual {p0}, Lacb;->d()V

    goto :goto_0

    .line 1614
    :cond_4
    invoke-direct {p0}, Lacb;->m()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_0

    .line 1604
    :sswitch_data_0
    .sparse-switch
        0x17 -> :sswitch_0
        0x42 -> :sswitch_0
    .end sparse-switch
.end method

.method public onKeyPreIme(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 1387
    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    iget-object v0, p0, Lacb;->F:Lada;

    if-eqz v0, :cond_0

    .line 1388
    invoke-virtual {p0}, Lacb;->d()V

    .line 1389
    const/4 v0, 0x1

    .line 1391
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/MultiAutoCompleteTextView;->onKeyPreIme(ILandroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onKeyUp(ILandroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 1404
    packed-switch p1, :pswitch_data_0

    .line 1415
    :cond_0
    :goto_0
    invoke-super {p0, p1, p2}, Landroid/widget/MultiAutoCompleteTextView;->onKeyUp(ILandroid/view/KeyEvent;)Z

    move-result v0

    return v0

    .line 1406
    :pswitch_0
    invoke-virtual {p2}, Landroid/view/KeyEvent;->hasNoModifiers()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1407
    iget-object v0, p0, Lacb;->F:Lada;

    if-eqz v0, :cond_1

    .line 1408
    invoke-virtual {p0}, Lacb;->d()V

    goto :goto_0

    .line 1410
    :cond_1
    invoke-direct {p0}, Lacb;->n()Z

    goto :goto_0

    .line 1404
    :pswitch_data_0
    .packed-switch 0x3d
        :pswitch_0
    .end packed-switch
.end method

.method public onLongPress(Landroid/view/MotionEvent;)V
    .locals 3

    .prologue
    .line 2971
    iget-object v0, p0, Lacb;->F:Lada;

    if-eqz v0, :cond_1

    .line 50749
    :cond_0
    :goto_0
    return-void

    .line 2974
    :cond_1
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v0

    .line 2975
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v1

    .line 2976
    invoke-direct {p0, v0, v1}, Lacb;->a(FF)I

    move-result v0

    .line 2977
    invoke-direct {p0, v0}, Lacb;->c(I)Lada;

    move-result-object v0

    .line 2978
    if-eqz v0, :cond_0

    .line 2984
    invoke-interface {v0}, Lada;->g()Lacx;

    move-result-object v0

    .line 50746
    iget-object v1, v0, Lacx;->d:Ljava/lang/String;

    .line 50747
    invoke-virtual {p0}, Lacb;->getContext()Landroid/content/Context;

    move-result-object v0

    .line 50748
    iget-boolean v2, p0, Lacb;->U:Z

    if-eqz v2, :cond_0

    if-eqz v0, :cond_0

    instance-of v2, v0, Landroid/app/Activity;

    if-eqz v2, :cond_0

    .line 50752
    invoke-static {v1}, Labf;->a(Ljava/lang/String;)Labf;

    move-result-object v1

    .line 50753
    check-cast v0, Landroid/app/Activity;

    invoke-virtual {v0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    move-result-object v0

    const-string v2, "chips-copy-dialog"

    invoke-virtual {v1, v0, v2}, Landroid/app/DialogFragment;->show(Landroid/app/FragmentManager;Ljava/lang/String;)V

    goto :goto_0
.end method

.method public onPrepareActionMode(Landroid/view/ActionMode;Landroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 2057
    const/4 v0, 0x0

    return v0
.end method

.method public onRestoreInstanceState(Landroid/os/Parcelable;)V
    .locals 1

    .prologue
    .line 470
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 471
    const/4 v0, 0x0

    invoke-super {p0, v0}, Landroid/widget/MultiAutoCompleteTextView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    .line 475
    :goto_0
    return-void

    .line 473
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->onRestoreInstanceState(Landroid/os/Parcelable;)V

    goto :goto_0
.end method

.method public onSaveInstanceState()Landroid/os/Parcelable;
    .locals 1

    .prologue
    .line 480
    invoke-virtual {p0}, Lacb;->d()V

    .line 481
    invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->onSaveInstanceState()Landroid/os/Parcelable;

    move-result-object v0

    return-object v0
.end method

.method public onScroll(Landroid/view/MotionEvent;Landroid/view/MotionEvent;FF)Z
    .locals 1

    .prologue
    .line 3100
    const/4 v0, 0x0

    return v0
.end method

.method public onSelectionChanged(II)V
    .locals 2

    .prologue
    .line 460
    invoke-direct {p0}, Lacb;->i()Lada;

    move-result-object v0

    .line 461
    iget-object v1, p0, Lacb;->F:Lada;

    if-nez v1, :cond_0

    if-eqz v0, :cond_0

    .line 6626
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 461
    invoke-interface {v1, v0}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v1

    if-ge p1, v1, :cond_0

    .line 7626
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v1

    .line 463
    invoke-interface {v1, v0}, Landroid/text/Spannable;->getSpanEnd(Ljava/lang/Object;)I

    move-result v0

    add-int/lit8 v0, v0, 0x1

    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-interface {v1}, Landroid/text/Editable;->length()I

    move-result v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v0

    invoke-virtual {p0, v0}, Lacb;->setSelection(I)V

    .line 465
    :cond_0
    invoke-super {p0, p1, p2}, Landroid/widget/MultiAutoCompleteTextView;->onSelectionChanged(II)V

    .line 466
    return-void
.end method

.method public onShowPress(Landroid/view/MotionEvent;)V
    .locals 0

    .prologue
    .line 3106
    return-void
.end method

.method public onSingleTapUp(Landroid/view/MotionEvent;)Z
    .locals 1

    .prologue
    .line 3111
    const/4 v0, 0x0

    return v0
.end method

.method public onSizeChanged(IIII)V
    .locals 7

    .prologue
    .line 1092
    invoke-super {p0, p1, p2, p3, p4}, Landroid/widget/MultiAutoCompleteTextView;->onSizeChanged(IIII)V

    .line 1093
    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    .line 1094
    iget v0, p0, Lacb;->L:I

    if-lez v0, :cond_1

    .line 1095
    invoke-direct {p0}, Lacb;->l()V

    .line 1101
    :cond_0
    iget-object v0, p0, Lacb;->c:Landroid/widget/ScrollView;

    if-nez v0, :cond_5

    iget-boolean v0, p0, Lacb;->S:Z

    if-nez v0, :cond_5

    .line 1102
    invoke-virtual {p0}, Lacb;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    .line 1103
    :goto_0
    if-eqz v0, :cond_3

    instance-of v1, v0, Landroid/widget/ScrollView;

    if-nez v1, :cond_3

    .line 1104
    invoke-interface {v0}, Landroid/view/ViewParent;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    .line 24120
    :cond_1
    invoke-virtual {p0}, Lacb;->e()[Lada;

    move-result-object v1

    .line 24121
    if-eqz v1, :cond_0

    .line 24123
    array-length v2, v1

    const/4 v0, 0x0

    :goto_1
    if-ge v0, v2, :cond_0

    aget-object v3, v1, v0

    .line 24124
    invoke-interface {v3}, Lada;->i()Landroid/graphics/Rect;

    move-result-object v4

    .line 24125
    invoke-virtual {p0}, Lacb;->getWidth()I

    move-result v5

    if-lez v5, :cond_2

    iget v5, v4, Landroid/graphics/Rect;->right:I

    iget v4, v4, Landroid/graphics/Rect;->left:I

    sub-int v4, v5, v4

    .line 24126
    invoke-virtual {p0}, Lacb;->getWidth()I

    move-result v5

    invoke-virtual {p0}, Lacb;->getPaddingLeft()I

    move-result v6

    sub-int/2addr v5, v6

    invoke-virtual {p0}, Lacb;->getPaddingRight()I

    move-result v6

    sub-int/2addr v5, v6

    if-le v4, v5, :cond_2

    .line 24128
    invoke-interface {v3}, Lada;->g()Lacx;

    move-result-object v4

    invoke-virtual {p0, v3, v4}, Lacb;->a(Lada;Lacx;)V

    .line 24123
    :cond_2
    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    .line 1106
    :cond_3
    if-eqz v0, :cond_4

    .line 1107
    check-cast v0, Landroid/widget/ScrollView;

    iput-object v0, p0, Lacb;->c:Landroid/widget/ScrollView;

    .line 1109
    :cond_4
    const/4 v0, 0x1

    iput-boolean v0, p0, Lacb;->S:Z

    .line 1111
    :cond_5
    return-void
.end method

.method public onTextContextMenuItem(I)Z
    .locals 2

    .prologue
    .line 2641
    const v0, 0x1020022

    if-ne p1, v0, :cond_0

    .line 2642
    invoke-virtual {p0}, Lacb;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "clipboard"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/ClipboardManager;

    .line 2644
    invoke-virtual {v0}, Landroid/content/ClipboardManager;->getPrimaryClip()Landroid/content/ClipData;

    move-result-object v0

    invoke-direct {p0, v0}, Lacb;->a(Landroid/content/ClipData;)V

    .line 2645
    const/4 v0, 0x1

    .line 2647
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->onTextContextMenuItem(I)Z

    move-result v0

    goto :goto_0
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 7

    .prologue
    const/4 v2, 0x1

    .line 1704
    invoke-virtual {p0}, Lacb;->isFocused()Z

    move-result v0

    if-nez v0, :cond_1

    .line 1706
    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v0

    .line 1738
    :cond_0
    :goto_0
    return v0

    .line 1708
    :cond_1
    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result v1

    .line 1709
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    move-result v3

    .line 1710
    const/4 v0, 0x0

    .line 1711
    iget-object v4, p0, Lacb;->F:Lada;

    if-nez v4, :cond_2

    .line 1712
    iget-object v4, p0, Lacb;->R:Landroid/view/GestureDetector;

    invoke-virtual {v4, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 1714
    :cond_2
    if-ne v3, v2, :cond_7

    .line 1715
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    move-result v4

    .line 1716
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    move-result v5

    .line 1717
    invoke-direct {p0, v4, v5}, Lacb;->a(FF)I

    move-result v4

    .line 1718
    invoke-direct {p0, v4}, Lacb;->c(I)Lada;

    move-result-object v4

    .line 1719
    if-eqz v4, :cond_6

    .line 1720
    iget-object v0, p0, Lacb;->F:Lada;

    if-eqz v0, :cond_4

    iget-object v0, p0, Lacb;->F:Lada;

    if-eq v0, v4, :cond_4

    .line 1721
    invoke-virtual {p0}, Lacb;->d()V

    .line 1722
    invoke-direct {p0, v4}, Lacb;->d(Lada;)V

    :cond_3
    :goto_1
    move v1, v2

    move v0, v2

    .line 1735
    :goto_2
    if-ne v3, v2, :cond_0

    if-nez v1, :cond_0

    .line 1736
    invoke-virtual {p0}, Lacb;->d()V

    goto :goto_0

    .line 1723
    :cond_4
    iget-object v0, p0, Lacb;->F:Lada;

    if-nez v0, :cond_5

    .line 1724
    invoke-direct {p0}, Lacb;->n()Z

    .line 1725
    invoke-direct {p0, v4}, Lacb;->d(Lada;)V

    goto :goto_1

    .line 1727
    :cond_5
    iget-object v0, p0, Lacb;->F:Lada;

    .line 34443
    invoke-interface {v0}, Lada;->a()Z

    move-result v0

    if-eqz v0, :cond_3

    .line 34444
    invoke-virtual {p0}, Lacb;->d()V

    goto :goto_1

    .line 1731
    :cond_6
    iget-object v4, p0, Lacb;->F:Lada;

    if-eqz v4, :cond_7

    iget-object v4, p0, Lacb;->F:Lada;

    invoke-direct {p0, v4}, Lacb;->e(Lada;)Z

    move-result v4

    if-eqz v4, :cond_7

    move v0, v1

    move v1, v2

    .line 1732
    goto :goto_2

    :cond_7
    move v6, v0

    move v0, v1

    move v1, v6

    goto :goto_2
.end method

.method public performFiltering(Ljava/lang/CharSequence;I)V
    .locals 4

    .prologue
    .line 1646
    invoke-direct {p0, p1}, Lacb;->b(Ljava/lang/CharSequence;)Z

    move-result v0

    .line 1647
    invoke-virtual {p0}, Lacb;->enoughToFilter()Z

    move-result v1

    if-eqz v1, :cond_0

    if-nez v0, :cond_0

    .line 1648
    invoke-virtual {p0}, Lacb;->getSelectionEnd()I

    move-result v0

    .line 1649
    iget-object v1, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    invoke-interface {v1, p1, v0}, Landroid/widget/MultiAutoCompleteTextView$Tokenizer;->findTokenStart(Ljava/lang/CharSequence;I)I

    move-result v1

    .line 33626
    invoke-virtual {p0}, Lacb;->getText()Landroid/text/Editable;

    move-result-object v2

    .line 1653
    const-class v3, Lada;

    invoke-interface {v2, v1, v0, v3}, Landroid/text/Spannable;->getSpans(IILjava/lang/Class;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lada;

    .line 1654
    if-eqz v0, :cond_1

    array-length v0, v0

    if-lez v0, :cond_1

    .line 1655
    invoke-virtual {p0}, Lacb;->dismissDropDown()V

    .line 1663
    :goto_0
    return-void

    .line 1658
    :cond_0
    if-eqz v0, :cond_1

    .line 1659
    invoke-virtual {p0}, Lacb;->dismissDropDown()V

    goto :goto_0

    .line 1662
    :cond_1
    invoke-super {p0, p1, p2}, Landroid/widget/MultiAutoCompleteTextView;->performFiltering(Ljava/lang/CharSequence;I)V

    goto :goto_0
.end method

.method public performValidation()V
    .locals 0

    .prologue
    .line 621
    return-void
.end method

.method public removeTextChangedListener(Landroid/text/TextWatcher;)V
    .locals 1

    .prologue
    .line 2454
    const/4 v0, 0x0

    iput-object v0, p0, Lacb;->z:Landroid/text/TextWatcher;

    .line 2455
    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->removeTextChangedListener(Landroid/text/TextWatcher;)V

    .line 2456
    return-void
.end method

.method protected replaceText(Ljava/lang/CharSequence;)V
    .locals 0

    .prologue
    .line 1379
    return-void
.end method

.method public setAdapter(Landroid/widget/ListAdapter;)V
    .locals 2

    .prologue
    .line 532
    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->setAdapter(Landroid/widget/ListAdapter;)V

    .line 533
    check-cast p1, Laav;

    .line 534
    new-instance v0, Lack;

    invoke-direct {v0, p0}, Lack;-><init>(Lacb;)V

    .line 8892
    iput-object v0, p1, Laav;->m:Labc;

    .line 569
    iget-object v0, p0, Lacb;->A:Labj;

    .line 9621
    iput-object v0, p1, Laav;->d:Labj;

    .line 9622
    iget-object v0, p1, Laav;->d:Labj;

    iget-object v1, p1, Laav;->a:Labw;

    .line 10078
    iput-object v1, v0, Labj;->c:Labw;

    .line 570
    return-void
.end method

.method public setDropDownAnchor(I)V
    .locals 1

    .prologue
    .line 383
    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->setDropDownAnchor(I)V

    .line 384
    const/4 v0, -0x1

    if-eq p1, v0, :cond_0

    .line 385
    invoke-virtual {p0}, Lacb;->getRootView()Landroid/view/View;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, p0, Lacb;->B:Landroid/view/View;

    .line 387
    :cond_0
    return-void
.end method

.method public setTokenizer(Landroid/widget/MultiAutoCompleteTextView$Tokenizer;)V
    .locals 1

    .prologue
    .line 1362
    iput-object p1, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    .line 1363
    iget-object v0, p0, Lacb;->w:Landroid/widget/MultiAutoCompleteTextView$Tokenizer;

    invoke-super {p0, v0}, Landroid/widget/MultiAutoCompleteTextView;->setTokenizer(Landroid/widget/MultiAutoCompleteTextView$Tokenizer;)V

    .line 1364
    return-void
.end method

.method public setValidator(Landroid/widget/AutoCompleteTextView$Validator;)V
    .locals 0

    .prologue
    .line 1368
    iput-object p1, p0, Lacb;->x:Landroid/widget/AutoCompleteTextView$Validator;

    .line 1369
    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->setValidator(Landroid/widget/AutoCompleteTextView$Validator;)V

    .line 1370
    return-void
.end method

.method public setVisibility(I)V
    .locals 2

    .prologue
    .line 3171
    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->setVisibility(I)V

    .line 3173
    const/16 v0, 0x8

    if-eq p1, v0, :cond_0

    iget-boolean v0, p0, Lacb;->O:Z

    if-eqz v0, :cond_0

    .line 3174
    const/4 v0, 0x0

    iput-boolean v0, p0, Lacb;->O:Z

    .line 3175
    iget-object v0, p0, Lacb;->y:Landroid/os/Handler;

    iget-object v1, p0, Lacb;->ab:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 3177
    :cond_0
    return-void
.end method
