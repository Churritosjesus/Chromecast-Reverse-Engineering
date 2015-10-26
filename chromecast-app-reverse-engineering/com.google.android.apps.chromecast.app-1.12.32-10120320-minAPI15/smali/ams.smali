.class public final Lams;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnFocusChangeListener;


# instance fields
.field final synthetic a:Landroid/view/View;

.field final synthetic b:Lcom/google/android/apps/chromecast/app/MainActivity;

.field private synthetic c:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Lcom/google/android/apps/chromecast/app/MainActivity;Landroid/widget/ImageView;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 423
    iput-object p1, p0, Lams;->b:Lcom/google/android/apps/chromecast/app/MainActivity;

    iput-object p2, p0, Lams;->c:Landroid/widget/ImageView;

    iput-object p3, p0, Lams;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onFocusChange(Landroid/view/View;Z)V
    .locals 3

    .prologue
    const/4 v2, 0x0

    .line 426
    if-eqz p2, :cond_0

    .line 427
    iget-object v0, p0, Lams;->b:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->d(Lcom/google/android/apps/chromecast/app/MainActivity;)Lbah;

    move-result-object v0

    .line 1528
    iget-object v0, v0, Lbah;->a:Landroid/support/v4/widget/DrawerLayout;

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Landroid/support/v4/widget/DrawerLayout;->a(I)V

    .line 428
    iget-object v0, p0, Lams;->c:Landroid/widget/ImageView;

    sget v1, La;->eC:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 429
    iget-object v0, p0, Lams;->c:Landroid/widget/ImageView;

    new-instance v1, Lamt;

    invoke-direct {v1, p0}, Lamt;-><init>(Lams;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 436
    iget-object v0, p0, Lams;->a:Landroid/view/View;

    invoke-virtual {v0, v2}, Landroid/view/View;->setVisibility(I)V

    .line 448
    :goto_0
    return-void

    .line 438
    :cond_0
    iget-object v0, p0, Lams;->b:Lcom/google/android/apps/chromecast/app/MainActivity;

    invoke-static {v0}, Lcom/google/android/apps/chromecast/app/MainActivity;->d(Lcom/google/android/apps/chromecast/app/MainActivity;)Lbah;

    move-result-object v0

    .line 1532
    iget-object v0, v0, Lbah;->a:Landroid/support/v4/widget/DrawerLayout;

    invoke-virtual {v0, v2}, Landroid/support/v4/widget/DrawerLayout;->a(I)V

    .line 439
    iget-object v0, p0, Lams;->c:Landroid/widget/ImageView;

    sget v1, La;->eF:I

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 440
    iget-object v0, p0, Lams;->c:Landroid/widget/ImageView;

    new-instance v1, Lamu;

    invoke-direct {v1, p0}, Lamu;-><init>(Lams;)V

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 446
    iget-object v0, p0, Lams;->a:Landroid/view/View;

    const/16 v1, 0x8

    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    goto :goto_0
.end method
