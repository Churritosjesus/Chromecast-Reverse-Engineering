.class final Lbnc;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Laow;

.field private synthetic b:Lbnb;


# direct methods
.method constructor <init>(Lbnb;Laow;)V
    .locals 0

    .prologue
    .line 1066
    iput-object p1, p0, Lbnc;->b:Lbnb;

    iput-object p2, p0, Lbnc;->a:Laow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 3

    .prologue
    .line 1069
    iget-object v0, p0, Lbnc;->b:Lbnb;

    iget-object v0, v0, Lbnb;->b:Lbmu;

    .line 2069
    iget-object v0, v0, Lbmu;->g:Lbob;

    .line 1069
    iget-object v1, p0, Lbnc;->a:Laow;

    iget-object v2, p0, Lbnc;->b:Lbnb;

    iget-object v2, v2, Lbnb;->a:Lbny;

    invoke-virtual {v2}, Lbny;->c()I

    move-result v2

    invoke-interface {v0, v1, v2}, Lbob;->a(Laow;I)V

    .line 1070
    return-void
.end method
