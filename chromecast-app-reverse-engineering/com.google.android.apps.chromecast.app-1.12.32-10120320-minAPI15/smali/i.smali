.class public Li;
.super Lj;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnCancelListener;
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field private Z:Z

.field public a:I

.field private aa:I

.field private ab:Z

.field private ac:Z

.field private ad:Z

.field public b:I

.field public c:Z

.field public d:Landroid/app/Dialog;


# direct methods
.method public constructor <init>()V
    .locals 2

    .prologue
    const/4 v1, 0x1

    const/4 v0, 0x0

    .line 96
    invoke-direct {p0}, Lj;-><init>()V

    .line 85
    iput v0, p0, Li;->a:I

    .line 86
    iput v0, p0, Li;->b:I

    .line 87
    iput-boolean v1, p0, Li;->Z:Z

    .line 88
    iput-boolean v1, p0, Li;->c:Z

    .line 89
    const/4 v0, -0x1

    iput v0, p0, Li;->aa:I

    .line 97
    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    .prologue
    .line 276
    invoke-super {p0}, Lj;->a()V

    .line 277
    iget-boolean v0, p0, Li;->ad:Z

    if-nez v0, :cond_0

    iget-boolean v0, p0, Li;->ac:Z

    if-nez v0, :cond_0

    .line 281
    const/4 v0, 0x1

    iput-boolean v0, p0, Li;->ac:Z

    .line 283
    :cond_0
    return-void
.end method

.method public a(Landroid/app/Activity;)V
    .locals 1

    .prologue
    .line 266
    invoke-super {p0, p1}, Lj;->a(Landroid/app/Activity;)V

    .line 267
    iget-boolean v0, p0, Li;->ad:Z

    if-nez v0, :cond_0

    .line 270
    const/4 v0, 0x0

    iput-boolean v0, p0, Li;->ac:Z

    .line 272
    :cond_0
    return-void
.end method

.method public a(Landroid/os/Bundle;)V
    .locals 3

    .prologue
    const/4 v1, 0x1

    const/4 v2, 0x0

    .line 287
    invoke-super {p0, p1}, Lj;->a(Landroid/os/Bundle;)V

    .line 289
    iget v0, p0, Li;->C:I

    if-nez v0, :cond_1

    move v0, v1

    :goto_0
    iput-boolean v0, p0, Li;->c:Z

    .line 291
    if-eqz p1, :cond_0

    .line 292
    const-string v0, "android:style"

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Li;->a:I

    .line 293
    const-string v0, "android:theme"

    invoke-virtual {p1, v0, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Li;->b:I

    .line 294
    const-string v0, "android:cancelable"

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Li;->Z:Z

    .line 295
    const-string v0, "android:showsDialog"

    iget-boolean v1, p0, Li;->c:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z

    move-result v0

    iput-boolean v0, p0, Li;->c:Z

    .line 296
    const-string v0, "android:backStackId"

    const/4 v1, -0x1

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I

    move-result v0

    iput v0, p0, Li;->aa:I

    .line 299
    :cond_0
    return-void

    :cond_1
    move v0, v2

    .line 289
    goto :goto_0
.end method

.method public a(Lr;Ljava/lang/String;)V
    .locals 1

    .prologue
    .line 135
    const/4 v0, 0x0

    iput-boolean v0, p0, Li;->ac:Z

    .line 136
    const/4 v0, 0x1

    iput-boolean v0, p0, Li;->ad:Z

    .line 137
    invoke-virtual {p1}, Lr;->a()Laf;

    move-result-object v0

    .line 138
    invoke-virtual {v0, p0, p2}, Laf;->a(Lj;Ljava/lang/String;)Laf;

    .line 139
    invoke-virtual {v0}, Laf;->b()I

    .line 140
    return-void
.end method

.method public final a(Z)V
    .locals 3

    .prologue
    const/4 v2, 0x1

    .line 181
    iget-boolean v0, p0, Li;->ac:Z

    if-eqz v0, :cond_0

    .line 204
    :goto_0
    return-void

    .line 184
    :cond_0
    iput-boolean v2, p0, Li;->ac:Z

    .line 185
    const/4 v0, 0x0

    iput-boolean v0, p0, Li;->ad:Z

    .line 186
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    if-eqz v0, :cond_1

    .line 187
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 188
    const/4 v0, 0x0

    iput-object v0, p0, Li;->d:Landroid/app/Dialog;

    .line 190
    :cond_1
    iput-boolean v2, p0, Li;->ab:Z

    .line 191
    iget v0, p0, Li;->aa:I

    if-ltz v0, :cond_2

    .line 1669
    iget-object v0, p0, Lj;->x:Lt;

    .line 192
    iget v1, p0, Li;->aa:I

    invoke-virtual {v0, v1, v2}, Lr;->a(II)V

    .line 194
    const/4 v0, -0x1

    iput v0, p0, Li;->aa:I

    goto :goto_0

    .line 2669
    :cond_2
    iget-object v0, p0, Lj;->x:Lt;

    .line 196
    invoke-virtual {v0}, Lr;->a()Laf;

    move-result-object v0

    .line 197
    invoke-virtual {v0, p0}, Laf;->a(Lj;)Laf;

    .line 198
    if-eqz p1, :cond_3

    .line 199
    invoke-virtual {v0}, Laf;->c()I

    goto :goto_0

    .line 201
    :cond_3
    invoke-virtual {v0}, Laf;->b()I

    goto :goto_0
.end method

.method public final b(Landroid/os/Bundle;)Landroid/view/LayoutInflater;
    .locals 2

    .prologue
    .line 304
    iget-boolean v0, p0, Li;->c:Z

    if-nez v0, :cond_0

    .line 305
    invoke-super {p0, p1}, Lj;->b(Landroid/os/Bundle;)Landroid/view/LayoutInflater;

    move-result-object v0

    .line 323
    :goto_0
    return-object v0

    .line 308
    :cond_0
    invoke-virtual {p0, p1}, Li;->c(Landroid/os/Bundle;)Landroid/app/Dialog;

    move-result-object v0

    iput-object v0, p0, Li;->d:Landroid/app/Dialog;

    .line 309
    iget v0, p0, Li;->a:I

    packed-switch v0, :pswitch_data_0

    .line 319
    :goto_1
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    if-eqz v0, :cond_1

    .line 320
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getContext()Landroid/content/Context;

    move-result-object v0

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    goto :goto_0

    .line 311
    :pswitch_0
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object v0

    const/16 v1, 0x18

    invoke-virtual {v0, v1}, Landroid/view/Window;->addFlags(I)V

    .line 317
    :pswitch_1
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->requestWindowFeature(I)Z

    goto :goto_1

    .line 323
    :cond_1
    iget-object v0, p0, Li;->y:Lm;

    const-string v1, "layout_inflater"

    invoke-virtual {v0, v1}, Lm;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/LayoutInflater;

    goto :goto_0

    .line 309
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final b(Z)V
    .locals 1

    .prologue
    .line 225
    iput-boolean p1, p0, Li;->Z:Z

    .line 226
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    invoke-virtual {v0, p1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 227
    :cond_0
    return-void
.end method

.method public c(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 3

    .prologue
    .line 351
    new-instance v0, Landroid/app/Dialog;

    .line 3612
    iget-object v1, p0, Lj;->y:Lm;

    .line 4212
    iget v2, p0, Li;->b:I

    .line 351
    invoke-direct {v0, v1, v2}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V

    return-object v0
.end method

.method public d()V
    .locals 1

    .prologue
    .line 442
    invoke-super {p0}, Lj;->d()V

    .line 443
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 447
    const/4 v0, 0x1

    iput-boolean v0, p0, Li;->ab:Z

    .line 448
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 449
    const/4 v0, 0x0

    iput-object v0, p0, Li;->d:Landroid/app/Dialog;

    .line 451
    :cond_0
    return-void
.end method

.method public final d(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 369
    invoke-super {p0, p1}, Lj;->d(Landroid/os/Bundle;)V

    .line 371
    iget-boolean v0, p0, Li;->c:Z

    if-nez v0, :cond_1

    .line 392
    :cond_0
    :goto_0
    return-void

    .line 5065
    :cond_1
    iget-object v0, p0, Lj;->N:Landroid/view/View;

    .line 376
    if-eqz v0, :cond_3

    .line 377
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v1

    if-eqz v1, :cond_2

    .line 378
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "DialogFragment can not be attached to a container view"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    .line 380
    :cond_2
    iget-object v1, p0, Li;->d:Landroid/app/Dialog;

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->setContentView(Landroid/view/View;)V

    .line 382
    :cond_3
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    .line 5612
    iget-object v1, p0, Lj;->y:Lm;

    .line 382
    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setOwnerActivity(Landroid/app/Activity;)V

    .line 383
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    iget-boolean v1, p0, Li;->Z:Z

    invoke-virtual {v0, v1}, Landroid/app/Dialog;->setCancelable(Z)V

    .line 384
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V

    .line 385
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    invoke-virtual {v0, p0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 386
    if-eqz p1, :cond_0

    .line 387
    const-string v0, "android:savedDialogState"

    invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBundle(Ljava/lang/String;)Landroid/os/Bundle;

    move-result-object v0

    .line 388
    if-eqz v0, :cond_0

    .line 389
    iget-object v1, p0, Li;->d:Landroid/app/Dialog;

    invoke-virtual {v1, v0}, Landroid/app/Dialog;->onRestoreInstanceState(Landroid/os/Bundle;)V

    goto :goto_0
.end method

.method public e(Landroid/os/Bundle;)V
    .locals 2

    .prologue
    .line 405
    invoke-super {p0, p1}, Lj;->e(Landroid/os/Bundle;)V

    .line 406
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 407
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->onSaveInstanceState()Landroid/os/Bundle;

    move-result-object v0

    .line 408
    if-eqz v0, :cond_0

    .line 409
    const-string v1, "android:savedDialogState"

    invoke-virtual {p1, v1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 412
    :cond_0
    iget v0, p0, Li;->a:I

    if-eqz v0, :cond_1

    .line 413
    const-string v0, "android:style"

    iget v1, p0, Li;->a:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 415
    :cond_1
    iget v0, p0, Li;->b:I

    if-eqz v0, :cond_2

    .line 416
    const-string v0, "android:theme"

    iget v1, p0, Li;->b:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 418
    :cond_2
    iget-boolean v0, p0, Li;->Z:Z

    if-nez v0, :cond_3

    .line 419
    const-string v0, "android:cancelable"

    iget-boolean v1, p0, Li;->Z:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 421
    :cond_3
    iget-boolean v0, p0, Li;->c:Z

    if-nez v0, :cond_4

    .line 422
    const-string v0, "android:showsDialog"

    iget-boolean v1, p0, Li;->c:Z

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V

    .line 424
    :cond_4
    iget v0, p0, Li;->aa:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_5

    .line 425
    const-string v0, "android:backStackId"

    iget v1, p0, Li;->aa:I

    invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putInt(Ljava/lang/String;I)V

    .line 427
    :cond_5
    return-void
.end method

.method public final g_()V
    .locals 1

    .prologue
    .line 396
    invoke-super {p0}, Lj;->g_()V

    .line 397
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 398
    const/4 v0, 0x0

    iput-boolean v0, p0, Li;->ab:Z

    .line 399
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->show()V

    .line 401
    :cond_0
    return-void
.end method

.method public final h_()V
    .locals 1

    .prologue
    .line 431
    invoke-super {p0}, Lj;->h_()V

    .line 432
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    if-eqz v0, :cond_0

    .line 433
    iget-object v0, p0, Li;->d:Landroid/app/Dialog;

    invoke-virtual {v0}, Landroid/app/Dialog;->hide()V

    .line 435
    :cond_0
    return-void
.end method

.method public onCancel(Landroid/content/DialogInterface;)V
    .locals 0

    .prologue
    .line 355
    return-void
.end method

.method public onDismiss(Landroid/content/DialogInterface;)V
    .locals 1

    .prologue
    .line 358
    iget-boolean v0, p0, Li;->ab:Z

    if-nez v0, :cond_0

    .line 363
    const/4 v0, 0x1

    invoke-virtual {p0, v0}, Li;->a(Z)V

    .line 365
    :cond_0
    return-void
.end method
