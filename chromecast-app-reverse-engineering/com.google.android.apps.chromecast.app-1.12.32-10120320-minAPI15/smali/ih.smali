.class public final Lih;
.super Ljava/lang/Object;
.source "PG"


# static fields
.field public static final b:Liq;


# instance fields
.field public a:Ljava/lang/ref/WeakReference;

.field private c:Ljava/lang/Runnable;

.field private d:Ljava/lang/Runnable;

.field private e:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .prologue
    .line 645
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 646
    const/16 v1, 0x15

    if-lt v0, v1, :cond_0

    .line 647
    new-instance v0, Lip;

    invoke-direct {v0}, Lip;-><init>()V

    sput-object v0, Lih;->b:Liq;

    .line 659
    :goto_0
    return-void

    .line 648
    :cond_0
    const/16 v1, 0x13

    if-lt v0, v1, :cond_1

    .line 649
    new-instance v0, Lio;

    invoke-direct {v0}, Lio;-><init>()V

    sput-object v0, Lih;->b:Liq;

    goto :goto_0

    .line 650
    :cond_1
    const/16 v1, 0x12

    if-lt v0, v1, :cond_2

    .line 651
    new-instance v0, Lim;

    invoke-direct {v0}, Lim;-><init>()V

    sput-object v0, Lih;->b:Liq;

    goto :goto_0

    .line 652
    :cond_2
    const/16 v1, 0x10

    if-lt v0, v1, :cond_3

    .line 653
    new-instance v0, Lin;

    invoke-direct {v0}, Lin;-><init>()V

    sput-object v0, Lih;->b:Liq;

    goto :goto_0

    .line 654
    :cond_3
    const/16 v1, 0xe

    if-lt v0, v1, :cond_4

    .line 655
    new-instance v0, Lik;

    invoke-direct {v0}, Lik;-><init>()V

    sput-object v0, Lih;->b:Liq;

    goto :goto_0

    .line 657
    :cond_4
    new-instance v0, Lii;

    invoke-direct {v0}, Lii;-><init>()V

    sput-object v0, Lih;->b:Liq;

    goto :goto_0
.end method

.method constructor <init>(Landroid/view/View;)V
    .locals 1

    .prologue
    const/4 v0, 0x0

    .line 35
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object v0, p0, Lih;->c:Ljava/lang/Runnable;

    .line 28
    iput-object v0, p0, Lih;->d:Ljava/lang/Runnable;

    .line 29
    const/4 v0, -0x1

    iput v0, p0, Lih;->e:I

    .line 36
    new-instance v0, Ljava/lang/ref/WeakReference;

    invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    iput-object v0, p0, Lih;->a:Ljava/lang/ref/WeakReference;

    .line 37
    return-void
.end method

.method static synthetic a(Lih;I)I
    .locals 1

    .prologue
    .line 24
    const/4 v0, -0x1

    iput v0, p0, Lih;->e:I

    return v0
.end method

.method static synthetic a(Lih;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 24
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic b(Lih;)Ljava/lang/Runnable;
    .locals 1

    .prologue
    .line 24
    const/4 v0, 0x0

    return-object v0
.end method

.method static synthetic c(Lih;)I
    .locals 1

    .prologue
    .line 24
    iget v0, p0, Lih;->e:I

    return v0
.end method


# virtual methods
.method public final a(F)Lih;
    .locals 2

    .prologue
    .line 691
    iget-object v0, p0, Lih;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    .line 692
    sget-object v1, Lih;->b:Liq;

    invoke-interface {v1, p0, v0, p1}, Liq;->a(Lih;Landroid/view/View;F)V

    .line 694
    :cond_0
    return-object p0
.end method

.method public final a(J)Lih;
    .locals 3

    .prologue
    .line 674
    iget-object v0, p0, Lih;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    .line 675
    sget-object v1, Lih;->b:Liq;

    invoke-interface {v1, v0, p1, p2}, Liq;->a(Landroid/view/View;J)V

    .line 677
    :cond_0
    return-object p0
.end method

.method public final a(Landroid/view/animation/Interpolator;)Lih;
    .locals 2

    .prologue
    .line 814
    iget-object v0, p0, Lih;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    .line 815
    sget-object v1, Lih;->b:Liq;

    invoke-interface {v1, v0, p1}, Liq;->a(Landroid/view/View;Landroid/view/animation/Interpolator;)V

    .line 817
    :cond_0
    return-object p0
.end method

.method public final a(Liu;)Lih;
    .locals 2

    .prologue
    .line 1314
    iget-object v0, p0, Lih;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    .line 1315
    sget-object v1, Lih;->b:Liq;

    invoke-interface {v1, p0, v0, p1}, Liq;->a(Lih;Landroid/view/View;Liu;)V

    .line 1317
    :cond_0
    return-object p0
.end method

.method public final a(Liw;)Lih;
    .locals 2

    .prologue
    .line 1333
    iget-object v0, p0, Lih;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    .line 1334
    sget-object v1, Lih;->b:Liq;

    invoke-interface {v1, v0, p1}, Liq;->a(Landroid/view/View;Liw;)V

    .line 1336
    :cond_0
    return-object p0
.end method

.method public final a()V
    .locals 2

    .prologue
    .line 1048
    iget-object v0, p0, Lih;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    .line 1049
    sget-object v1, Lih;->b:Liq;

    invoke-interface {v1, p0, v0}, Liq;->a(Lih;Landroid/view/View;)V

    .line 1051
    :cond_0
    return-void
.end method

.method public final b(F)Lih;
    .locals 2

    .prologue
    .line 725
    iget-object v0, p0, Lih;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    .line 726
    sget-object v1, Lih;->b:Liq;

    invoke-interface {v1, p0, v0, p1}, Liq;->b(Lih;Landroid/view/View;F)V

    .line 728
    :cond_0
    return-object p0
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 1234
    iget-object v0, p0, Lih;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    .line 1235
    sget-object v1, Lih;->b:Liq;

    invoke-interface {v1, p0, v0}, Liq;->b(Lih;Landroid/view/View;)V

    .line 1237
    :cond_0
    return-void
.end method

.method public final c(F)Lih;
    .locals 2

    .prologue
    .line 742
    iget-object v0, p0, Lih;->a:Ljava/lang/ref/WeakReference;

    invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/view/View;

    if-eqz v0, :cond_0

    .line 743
    sget-object v1, Lih;->b:Liq;

    invoke-interface {v1, p0, v0, p1}, Liq;->c(Lih;Landroid/view/View;F)V

    .line 745
    :cond_0
    return-object p0
.end method
