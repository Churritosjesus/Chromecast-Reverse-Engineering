.class public Lwk;
.super Landroid/widget/AutoCompleteTextView;
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
    .line 42
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lwk;->a:[I

    return-void

    nop

    :array_0
    .array-data 4
        0x10100d4
        0x1010176
    .end array-data
.end method

.method public constructor <init>(Landroid/content/Context;)V
    .locals 1

    .prologue
    .line 52
    const/4 v0, 0x0

    invoke-direct {p0, p1, v0}, Lwk;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 53
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 56
    sget v0, La;->w:I

    invoke-direct {p0, p1, p2, v0}, Lwk;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 57
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 60
    invoke-static {p1}, Ltc;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0, p2, p3}, Landroid/widget/AutoCompleteTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 62
    sget-boolean v0, Ltf;->a:Z

    if-eqz v0, :cond_2

    .line 63
    invoke-virtual {p0}, Lwk;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lwk;->a:[I

    invoke-static {v0, p2, v1, p3, v3}, Lth;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lth;

    move-result-object v0

    .line 65
    invoke-virtual {v0}, Lth;->a()Ltf;

    move-result-object v1

    iput-object v1, p0, Lwk;->c:Ltf;

    .line 67
    invoke-virtual {v0, v3}, Lth;->d(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 68
    invoke-virtual {v0}, Lth;->a()Ltf;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {v0, v3, v2}, Lth;->e(II)I

    move-result v2

    invoke-virtual {v1, v2}, Ltf;->a(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    .line 69
    if-eqz v1, :cond_0

    .line 70
    invoke-direct {p0, v1}, Lwk;->a(Landroid/content/res/ColorStateList;)V

    .line 73
    :cond_0
    invoke-virtual {v0, v4}, Lth;->d(I)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 74
    invoke-virtual {v0, v4}, Lth;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0, v1}, Lwk;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1183
    :cond_1
    iget-object v0, v0, Lth;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 78
    :cond_2
    return-void
.end method

.method private a()V
    .locals 1

    .prologue
    .line 165
    invoke-virtual {p0}, Lwk;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 168
    iget-object v0, p0, Lwk;->b:Lte;

    if-eqz v0, :cond_0

    .line 169
    iget-object v0, p0, Lwk;->b:Lte;

    invoke-static {p0, v0}, Ltf;->a(Landroid/view/View;Lte;)V

    .line 172
    :cond_0
    return-void
.end method

.method private a(Landroid/content/res/ColorStateList;)V
    .locals 2

    .prologue
    .line 175
    if-eqz p1, :cond_1

    .line 176
    iget-object v0, p0, Lwk;->b:Lte;

    if-nez v0, :cond_0

    .line 177
    new-instance v0, Lte;

    invoke-direct {v0}, Lte;-><init>()V

    iput-object v0, p0, Lwk;->b:Lte;

    .line 179
    :cond_0
    iget-object v0, p0, Lwk;->b:Lte;

    iput-object p1, v0, Lte;->a:Landroid/content/res/ColorStateList;

    .line 180
    iget-object v0, p0, Lwk;->b:Lte;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lte;->b:Z

    .line 184
    :goto_0
    invoke-direct {p0}, Lwk;->a()V

    .line 185
    return-void

    .line 182
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lwk;->b:Lte;

    goto :goto_0
.end method


# virtual methods
.method protected drawableStateChanged()V
    .locals 0

    .prologue
    .line 160
    invoke-super {p0}, Landroid/widget/AutoCompleteTextView;->drawableStateChanged()V

    .line 161
    invoke-direct {p0}, Lwk;->a()V

    .line 162
    return-void
.end method

.method public setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 89
    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 91
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lwk;->a(Landroid/content/res/ColorStateList;)V

    .line 92
    return-void
.end method

.method public setBackgroundResource(I)V
    .locals 1

    .prologue
    .line 82
    invoke-super {p0, p1}, Landroid/widget/AutoCompleteTextView;->setBackgroundResource(I)V

    .line 84
    iget-object v0, p0, Lwk;->c:Ltf;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwk;->c:Ltf;

    invoke-virtual {v0, p1}, Ltf;->a(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0}, Lwk;->a(Landroid/content/res/ColorStateList;)V

    .line 85
    return-void

    .line 84
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public setDropDownBackgroundResource(I)V
    .locals 2

    .prologue
    .line 96
    iget-object v0, p0, Lwk;->c:Ltf;

    .line 2166
    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ltf;->a(IZ)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 96
    invoke-virtual {p0, v0}, Lwk;->setDropDownBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 97
    return-void
.end method
