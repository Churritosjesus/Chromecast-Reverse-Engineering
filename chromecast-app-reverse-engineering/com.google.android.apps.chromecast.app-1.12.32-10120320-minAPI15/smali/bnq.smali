.class final Lbnq;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Laow;


# direct methods
.method constructor <init>(Lbmu;Laow;)V
    .locals 0

    .prologue
    .line 825
    iput-object p2, p0, Lbnq;->a:Laow;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 828
    iget-object v0, p0, Lbnq;->a:Laow;

    invoke-virtual {v0}, Laow;->b()V

    .line 829
    return-void
.end method
