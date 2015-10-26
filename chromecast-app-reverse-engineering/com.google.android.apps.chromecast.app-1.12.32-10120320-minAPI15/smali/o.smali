.class final Lo;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lq;


# instance fields
.field private synthetic a:Lm;


# direct methods
.method constructor <init>(Lm;)V
    .locals 0

    .prologue
    .line 107
    iput-object p1, p0, Lo;->a:Lm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(I)Landroid/view/View;
    .locals 1

    .prologue
    .line 111
    iget-object v0, p0, Lo;->a:Lm;

    invoke-virtual {v0, p1}, Lm;->findViewById(I)Landroid/view/View;

    move-result-object v0

    return-object v0
.end method

.method public final a()Z
    .locals 1

    .prologue
    .line 116
    iget-object v0, p0, Lo;->a:Lm;

    invoke-virtual {v0}, Lm;->getWindow()Landroid/view/Window;

    move-result-object v0

    .line 117
    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/view/Window;->peekDecorView()Landroid/view/View;

    move-result-object v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    :goto_0
    return v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
