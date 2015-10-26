.class public final Lbo;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field private static a:Lbp;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 174
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 175
    const/16 v1, 0x16

    if-lt v0, v1, :cond_0

    .line 176
    new-instance v0, Lbt;

    invoke-direct {v0}, Lbt;-><init>()V

    sput-object v0, Lbo;->a:Lbp;

    .line 186
    :goto_0
    return-void

    .line 177
    :cond_0
    const/16 v1, 0x15

    if-lt v0, v1, :cond_1

    .line 178
    new-instance v0, Lbs;

    invoke-direct {v0}, Lbs;-><init>()V

    sput-object v0, Lbo;->a:Lbp;

    goto :goto_0

    .line 179
    :cond_1
    const/16 v1, 0x13

    if-lt v0, v1, :cond_2

    .line 180
    new-instance v0, Lbr;

    invoke-direct {v0}, Lbr;-><init>()V

    sput-object v0, Lbo;->a:Lbp;

    goto :goto_0

    .line 181
    :cond_2
    const/16 v1, 0xb

    if-lt v0, v1, :cond_3

    .line 182
    new-instance v0, Lbq;

    invoke-direct {v0}, Lbq;-><init>()V

    sput-object v0, Lbo;->a:Lbp;

    goto :goto_0

    .line 184
    :cond_3
    new-instance v0, Lbp;

    invoke-direct {v0}, Lbp;-><init>()V

    sput-object v0, Lbo;->a:Lbp;

    goto :goto_0
.end method

.method public static a(Landroid/graphics/drawable/Drawable;)V
    .locals 1

    .prologue
    .line 197
    sget-object v0, Lbo;->a:Lbp;

    invoke-virtual {v0, p0}, Lbp;->a(Landroid/graphics/drawable/Drawable;)V

    .line 198
    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;FF)V
    .locals 1

    .prologue
    .line 239
    sget-object v0, Lbo;->a:Lbp;

    invoke-virtual {v0, p0, p1, p2}, Lbp;->a(Landroid/graphics/drawable/Drawable;FF)V

    .line 240
    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;I)V
    .locals 1

    .prologue
    .line 260
    sget-object v0, Lbo;->a:Lbp;

    invoke-virtual {v0, p0, p1}, Lbp;->a(Landroid/graphics/drawable/Drawable;I)V

    .line 261
    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;IIII)V
    .locals 6

    .prologue
    .line 250
    sget-object v0, Lbo;->a:Lbp;

    move-object v1, p0

    move v2, p1

    move v3, p2

    move v4, p3

    move v5, p4

    invoke-virtual/range {v0 .. v5}, Lbp;->a(Landroid/graphics/drawable/Drawable;IIII)V

    .line 251
    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V
    .locals 1

    .prologue
    .line 270
    sget-object v0, Lbo;->a:Lbp;

    invoke-virtual {v0, p0, p1}, Lbp;->a(Landroid/graphics/drawable/Drawable;Landroid/content/res/ColorStateList;)V

    .line 271
    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V
    .locals 1

    .prologue
    .line 280
    sget-object v0, Lbo;->a:Lbp;

    invoke-virtual {v0, p0, p1}, Lbp;->a(Landroid/graphics/drawable/Drawable;Landroid/graphics/PorterDuff$Mode;)V

    .line 281
    return-void
.end method

.method public static a(Landroid/graphics/drawable/Drawable;Z)V
    .locals 1

    .prologue
    .line 213
    sget-object v0, Lbo;->a:Lbp;

    invoke-virtual {v0, p0, p1}, Lbp;->a(Landroid/graphics/drawable/Drawable;Z)V

    .line 214
    return-void
.end method

.method public static b(Landroid/graphics/drawable/Drawable;)Z
    .locals 1

    .prologue
    .line 228
    sget-object v0, Lbo;->a:Lbp;

    invoke-virtual {v0, p0}, Lbp;->b(Landroid/graphics/drawable/Drawable;)Z

    move-result v0

    return v0
.end method

.method public static c(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 299
    sget-object v0, Lbo;->a:Lbp;

    invoke-virtual {v0, p0}, Lbp;->c(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    return-object v0
.end method

.method public static d(Landroid/graphics/drawable/Drawable;)Landroid/graphics/drawable/Drawable;
    .locals 1

    .prologue
    .line 313
    instance-of v0, p0, Lbu;

    if-eqz v0, :cond_0

    .line 314
    check-cast p0, Lbu;

    invoke-interface {p0}, Lbu;->a()Landroid/graphics/drawable/Drawable;

    move-result-object p0

    .line 316
    :cond_0
    return-object p0
.end method
