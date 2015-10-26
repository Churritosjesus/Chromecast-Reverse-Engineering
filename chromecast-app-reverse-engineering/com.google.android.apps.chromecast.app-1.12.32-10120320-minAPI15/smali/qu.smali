.class public final Lqu;
.super Lqa;
.source "PG"

# interfaces
.implements Landroid/view/SubMenu;


# instance fields
.field public k:Lqa;

.field private l:Lqe;


# direct methods
.method public constructor <init>(Landroid/content/Context;Lqa;Lqe;)V
    .locals 0

    .prologue
    .line 38
    invoke-direct {p0, p1}, Lqa;-><init>(Landroid/content/Context;)V

    .line 40
    iput-object p2, p0, Lqu;->k:Lqa;

    .line 41
    iput-object p3, p0, Lqu;->l:Lqe;

    .line 42
    return-void
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 3

    .prologue
    .line 135
    iget-object v0, p0, Lqu;->l:Lqe;

    if-eqz v0, :cond_0

    iget-object v0, p0, Lqu;->l:Lqe;

    invoke-virtual {v0}, Lqe;->getItemId()I

    move-result v0

    .line 136
    :goto_0
    if-nez v0, :cond_1

    .line 137
    const/4 v0, 0x0

    .line 139
    :goto_1
    return-object v0

    .line 135
    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    .line 139
    :cond_1
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Lqa;->a()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    const-string v2, ":"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    goto :goto_1
.end method

.method public final a(Lqb;)V
    .locals 1

    .prologue
    .line 74
    iget-object v0, p0, Lqu;->k:Lqa;

    invoke-virtual {v0, p1}, Lqa;->a(Lqb;)V

    .line 75
    return-void
.end method

.method final a(Lqa;Landroid/view/MenuItem;)Z
    .locals 1

    .prologue
    .line 84
    invoke-super {p0, p1, p2}, Lqa;->a(Lqa;Landroid/view/MenuItem;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lqu;->k:Lqa;

    invoke-virtual {v0, p1, p2}, Lqa;->a(Lqa;Landroid/view/MenuItem;)Z

    move-result v0

    if-eqz v0, :cond_1

    :cond_0
    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_1
    const/4 v0, 0x0

    goto :goto_0
.end method

.method public final a(Lqe;)Z
    .locals 1

    .prologue
    .line 125
    iget-object v0, p0, Lqu;->k:Lqa;

    invoke-virtual {v0, p1}, Lqa;->a(Lqe;)Z

    move-result v0

    return v0
.end method

.method public final b()Z
    .locals 1

    .prologue
    .line 51
    iget-object v0, p0, Lqu;->k:Lqa;

    invoke-virtual {v0}, Lqa;->b()Z

    move-result v0

    return v0
.end method

.method public final b(Lqe;)Z
    .locals 1

    .prologue
    .line 130
    iget-object v0, p0, Lqu;->k:Lqa;

    invoke-virtual {v0, p1}, Lqa;->b(Lqe;)Z

    move-result v0

    return v0
.end method

.method public final c()Z
    .locals 1

    .prologue
    .line 61
    iget-object v0, p0, Lqu;->k:Lqa;

    invoke-virtual {v0}, Lqa;->c()Z

    move-result v0

    return v0
.end method

.method public final getItem()Landroid/view/MenuItem;
    .locals 1

    .prologue
    .line 69
    iget-object v0, p0, Lqu;->l:Lqe;

    return-object v0
.end method

.method public final k()Lqa;
    .locals 1

    .prologue
    .line 79
    iget-object v0, p0, Lqu;->k:Lqa;

    return-object v0
.end method

.method public final setHeaderIcon(I)Landroid/view/SubMenu;
    .locals 1

    .prologue
    .line 104
    .line 1807
    iget-object v0, p0, Lqa;->a:Landroid/content/Context;

    .line 104
    invoke-static {v0, p1}, Lau;->a(Landroid/content/Context;I)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    invoke-super {p0, v0}, Lqa;->a(Landroid/graphics/drawable/Drawable;)Lqa;

    .line 105
    return-object p0
.end method

.method public final setHeaderIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 0

    .prologue
    .line 99
    invoke-super {p0, p1}, Lqa;->a(Landroid/graphics/drawable/Drawable;)Lqa;

    .line 100
    return-object p0
.end method

.method public final setHeaderTitle(I)Landroid/view/SubMenu;
    .locals 1

    .prologue
    .line 114
    .line 2807
    iget-object v0, p0, Lqa;->a:Landroid/content/Context;

    .line 114
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0, p1}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v0

    invoke-super {p0, v0}, Lqa;->a(Ljava/lang/CharSequence;)Lqa;

    .line 115
    return-object p0
.end method

.method public final setHeaderTitle(Ljava/lang/CharSequence;)Landroid/view/SubMenu;
    .locals 0

    .prologue
    .line 109
    invoke-super {p0, p1}, Lqa;->a(Ljava/lang/CharSequence;)Lqa;

    .line 110
    return-object p0
.end method

.method public final setHeaderView(Landroid/view/View;)Landroid/view/SubMenu;
    .locals 6

    .prologue
    const/4 v2, 0x0

    const/4 v1, 0x0

    .line 119
    move-object v0, p0

    move v3, v1

    move-object v4, v2

    move-object v5, p1

    .line 3269
    invoke-super/range {v0 .. v5}, Lqa;->a(ILjava/lang/CharSequence;ILandroid/graphics/drawable/Drawable;Landroid/view/View;)V

    .line 120
    return-object p0
.end method

.method public final setIcon(I)Landroid/view/SubMenu;
    .locals 1

    .prologue
    .line 94
    iget-object v0, p0, Lqu;->l:Lqe;

    invoke-virtual {v0, p1}, Lqe;->setIcon(I)Landroid/view/MenuItem;

    .line 95
    return-object p0
.end method

.method public final setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/SubMenu;
    .locals 1

    .prologue
    .line 89
    iget-object v0, p0, Lqu;->l:Lqe;

    invoke-virtual {v0, p1}, Lqe;->setIcon(Landroid/graphics/drawable/Drawable;)Landroid/view/MenuItem;

    .line 90
    return-object p0
.end method

.method public final setQwertyMode(Z)V
    .locals 1

    .prologue
    .line 46
    iget-object v0, p0, Lqu;->k:Lqa;

    invoke-virtual {v0, p1}, Lqa;->setQwertyMode(Z)V

    .line 47
    return-void
.end method
