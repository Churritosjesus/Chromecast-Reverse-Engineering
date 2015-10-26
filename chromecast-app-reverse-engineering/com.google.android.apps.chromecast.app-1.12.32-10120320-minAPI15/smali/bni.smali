.class final Lbni;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Laow;

.field private synthetic b:Lbmu;


# direct methods
.method constructor <init>(Lbmu;Laow;)V
    .locals 0

    .prologue
    .line 681
    iput-object p1, p0, Lbni;->b:Lbmu;

    iput-object p2, p0, Lbni;->a:Laow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 2

    .prologue
    .line 684
    iget-object v0, p0, Lbni;->b:Lbmu;

    .line 1069
    iget-object v0, v0, Lbmu;->g:Lbob;

    .line 684
    iget-object v1, p0, Lbni;->a:Laow;

    invoke-interface {v0, v1}, Lbob;->a(Laow;)V

    .line 685
    return-void
.end method
