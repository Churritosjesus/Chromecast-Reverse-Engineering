.class public final Lwq;
.super Landroid/widget/RadioButton;
.source "PG"


# static fields
.field private static final a:[I


# instance fields
.field private b:Ltf;

.field private c:Landroid/graphics/drawable/Drawable;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .prologue
    .line 37
    const/4 v0, 0x1

    new-array v0, v0, [I

    const/4 v1, 0x0

    const v2, 0x1010107

    aput v2, v0, v1

    sput-object v0, Lwq;->a:[I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 1

    .prologue
    .line 49
    sget v0, La;->M:I

    invoke-direct {p0, p1, p2, v0}, Lwq;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 50
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 53
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/RadioButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 55
    sget-boolean v0, Ltf;->a:Z

    if-eqz v0, :cond_0

    .line 56
    invoke-virtual {p0}, Lwq;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lwq;->a:[I

    invoke-static {v0, p2, v1, p3, v2}, Lth;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lth;

    move-result-object v0

    .line 58
    invoke-virtual {v0, v2}, Lth;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    invoke-virtual {p0, v1}, Lwq;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 1183
    iget-object v1, v0, Lth;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v1}, Landroid/content/res/TypedArray;->recycle()V

    .line 61
    invoke-virtual {v0}, Lth;->a()Ltf;

    move-result-object v0

    iput-object v0, p0, Lwq;->b:Ltf;

    .line 63
    :cond_0
    return-void
.end method


# virtual methods
.method public final getCompoundPaddingLeft()I
    .locals 3

    .prologue
    .line 82
    invoke-super {p0}, Landroid/widget/RadioButton;->getCompoundPaddingLeft()I

    move-result v0

    .line 83
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x11

    if-ge v1, v2, :cond_0

    .line 86
    iget-object v1, p0, Lwq;->c:Landroid/graphics/drawable/Drawable;

    if-eqz v1, :cond_0

    .line 87
    iget-object v1, p0, Lwq;->c:Landroid/graphics/drawable/Drawable;

    invoke-virtual {v1}, Landroid/graphics/drawable/Drawable;->getIntrinsicWidth()I

    move-result v1

    add-int/2addr v0, v1

    .line 90
    :cond_0
    return v0
.end method

.method public final setButtonDrawable(I)V
    .locals 2

    .prologue
    .line 73
    iget-object v0, p0, Lwq;->b:Ltf;

    if-eqz v0, :cond_0

    .line 74
    iget-object v0, p0, Lwq;->b:Ltf;

    .line 2166
    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Ltf;->a(IZ)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 74
    invoke-virtual {p0, v0}, Lwq;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 78
    :goto_0
    return-void

    .line 76
    :cond_0
    invoke-super {p0, p1}, Landroid/widget/RadioButton;->setButtonDrawable(I)V

    goto :goto_0
.end method

.method public final setButtonDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 0

    .prologue
    .line 67
    invoke-super {p0, p1}, Landroid/widget/RadioButton;->setButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 68
    iput-object p1, p0, Lwq;->c:Landroid/graphics/drawable/Drawable;

    .line 69
    return-void
.end method
