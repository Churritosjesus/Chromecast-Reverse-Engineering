.class final Lbnf;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/content/DialogInterface$OnClickListener;


# instance fields
.field private synthetic a:Last;

.field private synthetic b:Lbmu;


# direct methods
.method constructor <init>(Lbmu;Last;)V
    .locals 0

    .prologue
    .line 1129
    iput-object p1, p0, Lbnf;->b:Lbmu;

    iput-object p2, p0, Lbnf;->a:Last;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/content/DialogInterface;I)V
    .locals 2

    .prologue
    .line 1133
    iget-object v0, p0, Lbnf;->b:Lbmu;

    .line 2069
    iget-object v0, v0, Lbmu;->g:Lbob;

    .line 1133
    iget-object v1, p0, Lbnf;->a:Last;

    .line 3067
    iget-object v1, v1, Last;->b:Ljava/lang/String;

    .line 1133
    invoke-interface {v0, v1}, Lbob;->a(Ljava/lang/String;)V

    .line 1134
    return-void
.end method
