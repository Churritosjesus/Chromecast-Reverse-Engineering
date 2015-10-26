.class final Laks;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lakj;


# instance fields
.field private synthetic a:Landroid/view/View;


# direct methods
.method constructor <init>(Lakq;Landroid/view/View;)V
    .locals 0

    .prologue
    .line 99
    iput-object p2, p0, Laks;->a:Landroid/view/View;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 2

    .prologue
    .line 102
    iget-object v0, p0, Laks;->a:Landroid/view/View;

    sget v1, La;->cX:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/4 v1, 0x0

    .line 103
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 104
    return-void
.end method

.method public final b()V
    .locals 2

    .prologue
    .line 108
    iget-object v0, p0, Laks;->a:Landroid/view/View;

    sget v1, La;->cX:I

    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    const/16 v1, 0x8

    .line 109
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 110
    return-void
.end method
