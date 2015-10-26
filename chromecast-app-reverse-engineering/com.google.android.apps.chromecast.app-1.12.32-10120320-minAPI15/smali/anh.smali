.class final Lanh;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private synthetic a:Lbdm;

.field private synthetic b:I

.field private synthetic c:Ljava/lang/String;

.field private synthetic d:Land;


# direct methods
.method constructor <init>(Land;Lbdm;ILjava/lang/String;)V
    .locals 0

    .prologue
    .line 655
    iput-object p1, p0, Lanh;->d:Land;

    iput-object p2, p0, Lanh;->a:Lbdm;

    iput p3, p0, Lanh;->b:I

    iput-object p4, p0, Lanh;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 4

    .prologue
    .line 658
    iget-object v0, p0, Lanh;->d:Land;

    iget-object v1, p0, Lanh;->a:Lbdm;

    iget v2, p0, Lanh;->b:I

    iget-object v3, p0, Lanh;->c:Ljava/lang/String;

    invoke-static {v0, v1, v2, v3}, Land;->a(Land;Lbdm;ILjava/lang/String;)V

    .line 659
    return-void
.end method
