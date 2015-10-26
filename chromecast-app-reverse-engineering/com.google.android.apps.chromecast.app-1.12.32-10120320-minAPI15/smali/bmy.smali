.class final Lbmy;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Laow;

.field private synthetic b:Lboc;

.field private synthetic c:Lbmu;


# direct methods
.method constructor <init>(Lbmu;Laow;Lboc;)V
    .locals 0

    .prologue
    .line 900
    iput-object p1, p0, Lbmy;->c:Lbmu;

    iput-object p2, p0, Lbmy;->a:Laow;

    iput-object p3, p0, Lbmy;->b:Lboc;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 903
    iget-object v0, p0, Lbmy;->a:Laow;

    invoke-virtual {v0}, Laow;->l()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 904
    iget-object v0, p0, Lbmy;->c:Lbmu;

    iget-object v1, p0, Lbmy;->a:Laow;

    .line 1069
    invoke-virtual {v0, v1}, Lbmu;->a(Laow;)V

    .line 905
    iget-object v0, p0, Lbmy;->a:Laow;

    .line 1540
    iget-object v1, v0, Laow;->l:Ljava/util/List;

    iget v2, v0, Laow;->n:I

    add-int/lit8 v2, v2, 0x1

    iput v2, v0, Laow;->n:I

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 906
    const/4 v1, 0x2

    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    iget-object v3, p0, Lbmy;->a:Laow;

    invoke-virtual {v3}, Laow;->g()Ljava/lang/String;

    move-result-object v3

    aput-object v3, v1, v2

    const/4 v2, 0x1

    aput-object v0, v1, v2

    .line 907
    iget-object v1, p0, Lbmy;->b:Lboc;

    .line 2245
    iget-object v1, v1, Lboc;->y:Landroid/widget/ImageView;

    .line 907
    iget-object v2, p0, Lbmy;->a:Laow;

    invoke-virtual {v2}, Laow;->k()Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 908
    iget-object v1, p0, Lbmy;->b:Lboc;

    .line 3245
    iget-object v1, v1, Lboc;->z:Landroid/widget/ImageView;

    .line 908
    iget-object v2, p0, Lbmy;->a:Laow;

    invoke-virtual {v2}, Laow;->l()Z

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setEnabled(Z)V

    .line 909
    iget-object v1, p0, Lbmy;->c:Lbmu;

    .line 4069
    iget-object v1, v1, Lbmu;->b:Latf;

    .line 909
    iget-object v2, p0, Lbmy;->a:Laow;

    invoke-virtual {v1, v0, v2}, Latf;->a(Ljava/lang/String;Laow;)Laui;

    move-result-object v0

    .line 910
    iget-object v1, p0, Lbmy;->c:Lbmu;

    .line 5069
    iget-object v1, v1, Lbmu;->b:Latf;

    .line 910
    invoke-virtual {v1, v0}, Latf;->a(Lads;)V

    .line 914
    :cond_0
    return-void
.end method
