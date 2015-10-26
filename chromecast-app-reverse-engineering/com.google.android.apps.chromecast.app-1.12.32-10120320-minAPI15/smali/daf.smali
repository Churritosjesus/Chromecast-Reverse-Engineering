.class public Ldaf;
.super Landroid/animation/ValueAnimator;
.source "PG"


# instance fields
.field private a:Z

.field private b:Ldah;


# direct methods
.method public constructor <init>(Lcom/google/android/libraries/view/pagingindicator/PagingIndicator;Ldah;)V
    .locals 1

    .prologue
    .line 725
    invoke-direct {p0}, Landroid/animation/ValueAnimator;-><init>()V

    .line 726
    iput-object p2, p0, Ldaf;->b:Ldah;

    .line 727
    const/4 v0, 0x0

    iput-boolean v0, p0, Ldaf;->a:Z

    .line 728
    return-void
.end method


# virtual methods
.method public final a(F)V
    .locals 1

    .prologue
    .line 731
    iget-boolean v0, p0, Ldaf;->a:Z

    if-nez v0, :cond_0

    iget-object v0, p0, Ldaf;->b:Ldah;

    invoke-virtual {v0, p1}, Ldah;->a(F)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 732
    invoke-virtual {p0}, Ldaf;->start()V

    .line 733
    const/4 v0, 0x1

    iput-boolean v0, p0, Ldaf;->a:Z

    .line 735
    :cond_0
    return-void
.end method
