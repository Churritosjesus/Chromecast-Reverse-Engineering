.class final Lbhl;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Landroid/widget/Spinner;


# direct methods
.method constructor <init>(Lbhf;Landroid/widget/Spinner;)V
    .locals 0

    .prologue
    .line 757
    iput-object p2, p0, Lbhl;->a:Landroid/widget/Spinner;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 761
    iget-object v0, p0, Lbhl;->a:Landroid/widget/Spinner;

    invoke-virtual {v0}, Landroid/widget/Spinner;->performClick()Z

    .line 762
    return-void
.end method
