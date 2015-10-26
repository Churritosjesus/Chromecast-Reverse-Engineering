.class final Lamt;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lams;


# direct methods
.method constructor <init>(Lams;)V
    .locals 0

    .prologue
    .line 429
    iput-object p1, p0, Lamt;->a:Lams;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 1

    .prologue
    .line 433
    iget-object v0, p0, Lamt;->a:Lams;

    iget-object v0, v0, Lams;->a:Landroid/view/View;

    invoke-virtual {v0}, Landroid/view/View;->callOnClick()Z

    .line 434
    return-void
.end method
