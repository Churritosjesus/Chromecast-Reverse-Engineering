.class public final Lwo;
.super Landroid/widget/EditText;
.source "PG"


# static fields
.field private static final a:[I


# instance fields
.field private b:Lte;

.field private c:Ltf;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 41
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x10100d4

    aput v2, v0, v1

    sput-object v0, Lwo;->a:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 54
    sget v0, La;->H:I

    invoke-direct {p0, p1, p2, v0}, Lwo;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 55
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 4

    .prologue
    const/4 v3, 0x0

    .line 58
    invoke-static {p1}, Ltc;->a(Landroid/content/Context;)Landroid/content/Context;

    move-result-object v0

    invoke-direct {p0, v0, p2, p3}, Landroid/widget/EditText;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 60
    sget-boolean v0, Ltf;->a:Z

    if-eqz v0, :cond_1

    .line 61
    invoke-virtual {p0}, Lwo;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lwo;->a:[I

    invoke-static {v0, p2, v1, p3, v3}, Lth;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lth;

    move-result-object v0

    .line 63
    invoke-virtual {v0, v3}, Lth;->d(I)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 64
    invoke-virtual {v0}, Lth;->a()Ltf;

    move-result-object v1

    const/4 v2, -0x1

    invoke-virtual {v0, v3, v2}, Lth;->e(II)I

    move-result v2

    invoke-virtual {v1, v2}, Ltf;->a(I)Landroid/content/res/ColorStateList;

    move-result-object v1

    .line 65
    if-eqz v1, :cond_0

    .line 66
    invoke-direct {p0, v1}, Lwo;->a(Landroid/content/res/ColorStateList;)V

    .line 69
    :cond_0
    invoke-virtual {v0}, Lth;->a()Ltf;

    move-result-object v1

    iput-object v1, p0, Lwo;->c:Ltf;

    .line 1183
    iget-object v0, v0, Lth;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 72
    :cond_1
    return-void
.end method

.method private a()V
    .locals 1

    .prologue
    .line 154
    invoke-virtual {p0}, Lwo;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 157
    iget-object v0, p0, Lwo;->b:Lte;

    if-eqz v0, :cond_0

    .line 158
    iget-object v0, p0, Lwo;->b:Lte;

    invoke-static {p0, v0}, Ltf;->a(Landroid/view/View;Lte;)V

    .line 161
    :cond_0
    return-void
.end method

.method private a(Landroid/content/res/ColorStateList;)V
    .locals 2

    .prologue
    .line 164
    if-eqz p1, :cond_1

    .line 165
    iget-object v0, p0, Lwo;->b:Lte;

    if-nez v0, :cond_0

    .line 166
    new-instance v0, Lte;

    invoke-direct {v0}, Lte;-><init>()V

    iput-object v0, p0, Lwo;->b:Lte;

    .line 168
    :cond_0
    iget-object v0, p0, Lwo;->b:Lte;

    iput-object p1, v0, Lte;->a:Landroid/content/res/ColorStateList;

    .line 169
    iget-object v0, p0, Lwo;->b:Lte;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lte;->b:Z

    .line 173
    :goto_0
    invoke-direct {p0}, Lwo;->a()V

    .line 174
    return-void

    .line 171
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lwo;->b:Lte;

    goto :goto_0
.end method


# virtual methods
.method protected final drawableStateChanged()V
    .locals 0

    .prologue
    .line 149
    invoke-super {p0}, Landroid/widget/EditText;->drawableStateChanged()V

    .line 150
    invoke-direct {p0}, Lwo;->a()V

    .line 151
    return-void
.end method

.method public final setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 83
    invoke-super {p0, p1}, Landroid/widget/EditText;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 85
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lwo;->a(Landroid/content/res/ColorStateList;)V

    .line 86
    return-void
.end method

.method public final setBackgroundResource(I)V
    .locals 1

    .prologue
    .line 76
    invoke-super {p0, p1}, Landroid/widget/EditText;->setBackgroundResource(I)V

    .line 78
    iget-object v0, p0, Lwo;->c:Ltf;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lwo;->c:Ltf;

    invoke-virtual {v0, p1}, Ltf;->a(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0}, Lwo;->a(Landroid/content/res/ColorStateList;)V

    .line 79
    return-void

    .line 78
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
