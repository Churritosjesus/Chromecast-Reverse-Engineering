.class final Lace;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/widget/AdapterView$OnItemClickListener;


# instance fields
.field private synthetic a:Lada;

.field private synthetic b:Lacb;


# direct methods
.method constructor <init>(Lacb;Lada;)V
    .locals 0

    .prologue
    .line 2301
    iput-object p1, p0, Lace;->b:Lacb;

    iput-object p2, p0, Lace;->a:Lada;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onItemClick(Landroid/widget/AdapterView;Landroid/view/View;IJ)V
    .locals 2

    .prologue
    .line 2304
    iget-object v0, p0, Lace;->b:Lacb;

    iget-object v1, p0, Lace;->a:Lada;

    invoke-static {v0, v1}, Lacb;->c(Lacb;Lada;)V

    .line 2305
    return-void
.end method
