.class public final Lwp;
.super Landroid/widget/MultiAutoCompleteTextView;
.source "PG"


# static fields
.field private static final a:[I


# instance fields
.field private b:Lte;

.field private c:Ltf;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .prologue
    .line 43
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lwp;->a:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x10100d4
        0x1010176
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 57
    sget v0, La;->w:I

    invoke-direct {p0, p1, p2, v0}, Lwp;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 58
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 61
    invoke-static {p1}, Ltc;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0, p2, p3}, Landroid/widget/MultiAutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 63
    sget-boolean v0, Ltf;->a:Z

    if-eqz v0, :cond_2

    .line 64
    invoke-virtual {p0}, Lwp;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lwp;->a:[I

    invoke-static {v0, p2, v1, p3, v3}, Lth;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lth;

    move-result-object v0

    .line 66
    invoke-virtual {v0}, Lth;->a()Ltf;

    move-result-object v1

    iput-object v1, p0, Lwp;->c:Ltf;

    .line 68
    invoke-virtual {v0, v3}, Lth;->d(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 69
    invoke-virtual {v0}, Lth;->a()Ltf;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {v0, v3, v2}, Lth;->e(II)I

    move-result v2

    invoke-virtual {v1, v2}, Ltf;->a(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    .line 70
    if-eqz v1, :cond_0

    .line 71
    invoke-direct {p0, v1}, Lwp;->a(Landroid/content/res/ColorStateList;)V

    .line 74
    :cond_0
    invoke-virtual {v0, v4}, Lth;->d(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 75
    invoke-virtual {v0, v4}, Lth;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0, v1}, Lwp;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1183
    :cond_1
    iget-object v0, v0, Lth;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 79
    :cond_2
    return-void
.end method

.method private a()V
    .locals 1

    .prologue
    .line 170
    invoke-virtual {p0}, Lwp;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 173
    iget-object v0, p0, Lwp;->b:Lte;

    if-eqz v0, :cond_0

    .line 174
    iget-object v0, p0, Lwp;->b:Lte;

    invoke-static {p0, v0}, Ltf;->a(Landroid/view/View;Lte;)V

    .line 177
    :cond_0
    return-void
.end method

.method private a(Landroid/content/res/ColorStateList;)V
    .locals 2

    .prologue
    .line 180
    if-eqz p1, :cond_1

    .line 181
    iget-object v0, p0, Lwp;->b:Lte;

    if-nez v0, :cond_0

    .line 182
    new-instance v0, Lte;

    invoke-direct {v0}, Lte;-><init>()V

    iput-object v0, p0, Lwp;->b:Lte;

    .line 184
    :cond_0
    iget-object v0, p0, Lwp;->b:Lte;

    iput-object p1, v0, Lte;->a:Landroid/content/res/ColorStateList;

    .line 185
    iget-object v0, p0, Lwp;->b:Lte;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lte;->b:Z

    .line 189
    :goto_0
    invoke-direct {p0}, Lwp;->a()V

    .line 190
    return-void

    .line 187
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lwp;->b:Lte;

    goto :goto_0
.end method


# virtual methods
.method protected final drawableStateChanged()V
    .locals 0

    .prologue
    .line 165
    invoke-super {p0}, Landroid/widget/MultiAutoCompleteTextView;->drawableStateChanged()V

    .line 166
    invoke-direct {p0}, Lwp;->a()V

    .line 167
    return-void
.end method

.method public final setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 90
    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 92
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lwp;->a(Landroid/content/res/ColorStateList;)V

    .line 93
    return-void
.end method

.method public final setBackgroundResource(I)V
    .locals 1

    .prologue
    .line 83
    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->setBackgroundResource(I)V

    .line 85
    iget-object v0, p0, Lwp;->c:Ltf;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwp;->c:Ltf;

    invoke-virtual {v0, p1}, Ltf;->a(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0}, Lwp;->a(Landroid/content/res/ColorStateList;)V

    .line 86
    return-void

    .line 85
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final setDropDownBackgroundResource(I)V
    .locals 2

    .prologue
    .line 97
    iget-object v0, p0, Lwp;->c:Ltf;

    if-eqz v0, :cond_0

    .line 98
    iget-object v0, p0, Lwp;->c:Ltf;

    .line 2166
    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ltf;->a(IZ)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 98
    invoke-virtual {p0, v0}, Lwp;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 102
    :goto_0
    return-void

    .line 100
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/MultiAutoCompleteTextView;->setDropDownBackgroundResource(I)V

    goto :goto_0
.end method
