.class public final Lws;
.super Landroid/widget/Spinner;
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
    .line 45
    const/4 v0, 0x2

    new-array v0, v0, [I

    fill-array-data v0, :array_0

    sput-object v0, Lws;->a:[I

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
    .line 59
    sget v0, La;->P:I

    invoke-direct {p0, p1, p2, v0}, Lws;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 60
    return-void
.end method

.method private constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 5

    .prologue
    const/4 v4, 0x1

    const/4 v3, 0x0

    .line 63
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/Spinner;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 65
    sget-boolean v0, Ltf;->a:Z

    if-eqz v0, :cond_2

    .line 66
    invoke-virtual {p0}, Lws;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lws;->a:[I

    invoke-static {v0, p2, v1, p3, v3}, Lth;->a(Landroid/content/Context;Landroid/util/AttributeSet;[III)Lth;

    move-result-object v1

    .line 68
    invoke-virtual {v1, v3}, Lth;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 69
    invoke-virtual {v1}, Lth;->a()Ltf;

    move-result-object v0

    const/4 v2, -0x1

    invoke-virtual {v1, v3, v2}, Lth;->e(II)I

    move-result v2

    invoke-virtual {v0, v2}, Ltf;->a(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    .line 70
    if-eqz v0, :cond_0

    .line 71
    invoke-direct {p0, v0}, Lws;->a(Landroid/content/res/ColorStateList;)V

    .line 74
    :cond_0
    invoke-virtual {v1, v4}, Lth;->d(I)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 75
    invoke-virtual {v1, v4}, Lth;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 76
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0x10

    if-lt v0, v3, :cond_3

    .line 77
    invoke-virtual {p0, v2}, Lws;->setPopupBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 82
    :cond_1
    :goto_0
    invoke-virtual {v1}, Lth;->a()Ltf;

    move-result-object v0

    iput-object v0, p0, Lws;->c:Ltf;

    .line 1183
    iget-object v0, v1, Lth;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 85
    :cond_2
    return-void

    .line 78
    :cond_3
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v3, 0xb

    if-lt v0, v3, :cond_1

    .line 1104
    :try_start_0
    const-class v0, Landroid/widget/Spinner;

    const-string v3, "mPopup"

    invoke-virtual {v0, v3}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v0

    .line 1105
    const/4 v3, 0x1

    invoke-virtual {v0, v3}, Ljava/lang/reflect/Field;->setAccessible(Z)V

    .line 1107
    invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    .line 1109
    instance-of v3, v0, Landroid/widget/ListPopupWindow;

    if-eqz v3, :cond_1

    .line 1110
    check-cast v0, Landroid/widget/ListPopupWindow;

    invoke-virtual {v0, v2}, Landroid/widget/ListPopupWindow;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    :try_end_0
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_1

    goto :goto_0

    .line 1112
    :catch_0
    move-exception v0

    .line 1113
    invoke-virtual {v0}, Ljava/lang/NoSuchFieldException;->printStackTrace()V

    goto :goto_0

    .line 1114
    :catch_1
    move-exception v0

    .line 1115
    invoke-virtual {v0}, Ljava/lang/IllegalAccessException;->printStackTrace()V

    goto :goto_0
.end method

.method private a()V
    .locals 1

    .prologue
    .line 185
    invoke-virtual {p0}, Lws;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 188
    iget-object v0, p0, Lws;->b:Lte;

    if-eqz v0, :cond_0

    .line 189
    iget-object v0, p0, Lws;->b:Lte;

    invoke-static {p0, v0}, Ltf;->a(Landroid/view/View;Lte;)V

    .line 192
    :cond_0
    return-void
.end method

.method private a(Landroid/content/res/ColorStateList;)V
    .locals 2

    .prologue
    .line 195
    if-eqz p1, :cond_1

    .line 196
    iget-object v0, p0, Lws;->b:Lte;

    if-nez v0, :cond_0

    .line 197
    new-instance v0, Lte;

    invoke-direct {v0}, Lte;-><init>()V

    iput-object v0, p0, Lws;->b:Lte;

    .line 199
    :cond_0
    iget-object v0, p0, Lws;->b:Lte;

    iput-object p1, v0, Lte;->a:Landroid/content/res/ColorStateList;

    .line 200
    iget-object v0, p0, Lws;->b:Lte;

    const/4 v1, 0x1

    iput-boolean v1, v0, Lte;->b:Z

    .line 204
    :goto_0
    invoke-direct {p0}, Lws;->a()V

    .line 205
    return-void

    .line 202
    :cond_1
    const/4 v0, 0x0

    iput-object v0, p0, Lws;->b:Lte;

    goto :goto_0
.end method


# virtual methods
.method protected final drawableStateChanged()V
    .locals 0

    .prologue
    .line 180
    invoke-super {p0}, Landroid/widget/Spinner;->drawableStateChanged()V

    .line 181
    invoke-direct {p0}, Lws;->a()V

    .line 182
    return-void
.end method

.method public final setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 96
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 98
    const/4 v0, 0x0

    invoke-direct {p0, v0}, Lws;->a(Landroid/content/res/ColorStateList;)V

    .line 99
    return-void
.end method

.method public final setBackgroundResource(I)V
    .locals 1

    .prologue
    .line 89
    invoke-super {p0, p1}, Landroid/widget/Spinner;->setBackgroundResource(I)V

    .line 91
    iget-object v0, p0, Lws;->c:Ltf;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lws;->c:Ltf;

    invoke-virtual {v0, p1}, Ltf;->a(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    :goto_0
    invoke-direct {p0, v0}, Lws;->a(Landroid/content/res/ColorStateList;)V

    .line 92
    return-void

    .line 91
    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
