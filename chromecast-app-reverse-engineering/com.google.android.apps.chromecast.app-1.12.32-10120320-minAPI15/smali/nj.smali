.class final Lnj;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lmo;


# instance fields
.field private synthetic a:Lni;


# direct methods
.method constructor <init>(Lni;)V
    .locals 0

    .prologue
    .line 171
    iput-object p1, p0, Lnj;->a:Lni;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()Landroid/graphics/drawable/Drawable;
    .locals 5

    .prologue
    const/4 v4, 0x0

    .line 174
    .line 1183
    iget-object v0, p0, Lnj;->a:Lni;

    invoke-virtual {v0}, Lni;->k()Landroid/content/Context;

    move-result-object v0

    .line 174
    const/4 v1, 0x0

    const/4 v2, 0x1

    new-array v2, v2, [I

    sget v3, La;->I:I

    aput v3, v2, v4

    invoke-static {v0, v1, v2}, Lth;->a(Landroid/content/Context;Landroid/util/AttributeSet;[I)Lth;

    move-result-object v0

    .line 176
    invoke-virtual {v0, v4}, Lth;->a(I)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 2183
    iget-object v0, v0, Lth;->a:Landroid/content/res/TypedArray;

    invoke-virtual {v0}, Landroid/content/res/TypedArray;->recycle()V

    .line 178
    return-object v1
.end method

.method public final a(I)V
    .locals 1

    .prologue
    .line 203
    iget-object v0, p0, Lnj;->a:Lni;

    invoke-virtual {v0}, Lni;->a()Lmj;

    move-result-object v0

    .line 204
    if-eqz v0, :cond_0

    .line 205
    invoke-virtual {v0, p1}, Lmj;->b(I)V

    .line 207
    :cond_0
    return-void
.end method

.method public final a(Landroid/graphics/drawable/Drawable;I)V
    .locals 1

    .prologue
    .line 194
    iget-object v0, p0, Lnj;->a:Lni;

    invoke-virtual {v0}, Lni;->a()Lmj;

    move-result-object v0

    .line 195
    if-eqz v0, :cond_0

    .line 196
    invoke-virtual {v0, p1}, Lmj;->a(Landroid/graphics/drawable/Drawable;)V

    .line 197
    invoke-virtual {v0, p2}, Lmj;->b(I)V

    .line 199
    :cond_0
    return-void
.end method

.method public final b()Landroid/content/Context;
    .locals 1

    .prologue
    .line 183
    iget-object v0, p0, Lnj;->a:Lni;

    invoke-virtual {v0}, Lni;->k()Landroid/content/Context;

    move-result-object v0

    return-object v0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 188
    iget-object v0, p0, Lnj;->a:Lni;

    invoke-virtual {v0}, Lni;->a()Lmj;

    move-result-object v0

    .line 189
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lmj;->b()I

    move-result v0

    and-int/lit8 v0, v0, 0x4

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
