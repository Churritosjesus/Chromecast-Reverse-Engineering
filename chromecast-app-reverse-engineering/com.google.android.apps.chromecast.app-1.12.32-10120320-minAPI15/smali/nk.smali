.class Lnk;
.super Lpr;
.source "PG"


# instance fields
.field private synthetic a:Lni;


# direct methods
.method constructor <init>(Lni;Landroid/view/Window$Callback;)V
    .locals 0

    .prologue
    .line 254
    iput-object p1, p0, Lnk;->a:Lni;

    .line 255
    invoke-direct {p0, p2}, Lpr;-><init>(Landroid/view/Window$Callback;)V

    .line 256
    return-void
.end method


# virtual methods
.method public dispatchKeyEvent(Landroid/view/KeyEvent;)Z
    .locals 1

    .prologue
    .line 260
    iget-object v0, p0, Lnk;->a:Lni;

    invoke-virtual {v0, p1}, Lni;->a(Landroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 262
    const/4 v0, 0x1

    .line 265
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Lpr;->dispatchKeyEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z
    .locals 2

    .prologue
    .line 315
    iget-object v0, p0, Lnk;->a:Lni;

    invoke-virtual {p1}, Landroid/view/KeyEvent;->getKeyCode()I

    move-result v1

    invoke-virtual {v0, v1, p1}, Lni;->a(ILandroid/view/KeyEvent;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 316
    const/4 v0, 0x1

    .line 318
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1}, Lpr;->dispatchKeyShortcutEvent(Landroid/view/KeyEvent;)Z

    move-result v0

    goto :goto_0
.end method

.method public onContentChanged()V
    .locals 0

    .prologue
    .line 325
    return-void
.end method

.method public onCreatePanelMenu(ILandroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 270
    if-nez p1, :cond_0

    instance-of v0, p2, Lqa;

    if-nez v0, :cond_0

    .line 273
    const/4 v0, 0x0

    .line 275
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Lpr;->onCreatePanelMenu(ILandroid/view/Menu;)Z

    move-result v0

    goto :goto_0
.end method

.method public onMenuOpened(ILandroid/view/Menu;)Z
    .locals 1

    .prologue
    .line 307
    iget-object v0, p0, Lnk;->a:Lni;

    invoke-virtual {v0, p1}, Lni;->d(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 308
    const/4 v0, 0x1

    .line 310
    :goto_0
    return v0

    :cond_0
    invoke-super {p0, p1, p2}, Lpr;->onMenuOpened(ILandroid/view/Menu;)Z

    move-result v0

    goto :goto_0
.end method

.method public onPanelClosed(ILandroid/view/Menu;)V
    .locals 1

    .prologue
    .line 329
    iget-object v0, p0, Lnk;->a:Lni;

    invoke-virtual {v0, p1}, Lni;->c(I)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 333
    :goto_0
    return-void

    .line 332
    :cond_0
    invoke-super {p0, p1, p2}, Lpr;->onPanelClosed(ILandroid/view/Menu;)V

    goto :goto_0
.end method

.method public onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z
    .locals 3

    .prologue
    const/4 v1, 0x0

    .line 280
    instance-of v0, p3, Lqa;

    if-eqz v0, :cond_1

    move-object v0, p3

    check-cast v0, Lqa;

    move-object v2, v0

    .line 282
    :goto_0
    if-nez p1, :cond_2

    if-nez v2, :cond_2

    move v0, v1

    .line 302
    :cond_0
    :goto_1
    return v0

    .line 280
    :cond_1
    const/4 v0, 0x0

    move-object v2, v0

    goto :goto_0

    .line 292
    :cond_2
    if-eqz v2, :cond_3

    .line 293
    const/4 v0, 0x1

    .line 2367
    iput-boolean v0, v2, Lqa;->j:Z

    .line 296
    :cond_3
    invoke-super {p0, p1, p2, p3}, Lpr;->onPreparePanel(ILandroid/view/View;Landroid/view/Menu;)Z

    move-result v0

    .line 298
    if-eqz v2, :cond_0

    .line 3367
    iput-boolean v1, v2, Lqa;->j:Z

    goto :goto_1
.end method
