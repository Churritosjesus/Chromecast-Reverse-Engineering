.class final Lasv;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field private synthetic a:Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;

.field private synthetic b:Lasu;


# direct methods
.method constructor <init>(Lasu;Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;)V
    .locals 0

    .prologue
    .line 72
    iput-object p1, p0, Lasv;->b:Lasu;

    iput-object p2, p0, Lasv;->a:Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 4

    .prologue
    .line 76
    iget-object v0, p0, Lasv;->b:Lasu;

    .line 1669
    iget-object v0, v0, Lj;->x:Lt;

    .line 76
    const-string v1, "sharedPhotosFragment"

    invoke-virtual {v0, v1}, Lr;->a(Ljava/lang/String;)Lj;

    move-result-object v0

    .line 77
    if-nez v0, :cond_0

    .line 80
    iget-object v0, p0, Lasv;->b:Lasu;

    iget-object v1, p0, Lasv;->a:Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;

    .line 81
    invoke-virtual {v1}, Lcom/google/android/apps/chromecast/app/backdrop/PeoplePickerRecipientView;->getText()Landroid/text/Editable;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-static {v0, v1}, Lasu;->a(Lasu;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v0

    .line 83
    iget-object v1, p0, Lasv;->b:Lasu;

    invoke-static {v1, v0}, Lasu;->b(Lasu;Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 84
    invoke-static {}, Lasu;->p()Ldcj;

    move-result-object v1

    invoke-static {v1, v0}, Lasx;->a(Ldcj;Ljava/lang/String;)Lasx;

    move-result-object v0

    .line 92
    :cond_0
    iget-object v1, p0, Lasv;->b:Lasu;

    .line 2669
    iget-object v1, v1, Lj;->x:Lt;

    .line 92
    invoke-virtual {v1}, Lr;->a()Laf;

    move-result-object v1

    sget v2, Lf;->bk:I

    const-string v3, "sharedPhotosFragment"

    .line 93
    invoke-virtual {v1, v2, v0, v3}, Laf;->b(ILj;Ljava/lang/String;)Laf;

    move-result-object v0

    .line 94
    const/16 v1, 0x1001

    invoke-virtual {v0, v1}, Laf;->a(I)Laf;

    .line 95
    invoke-virtual {v0}, Laf;->b()I

    .line 96
    invoke-static {}, Lape;->a()Lape;

    move-result-object v0

    new-instance v1, Lapd;

    const/16 v2, 0x4b

    invoke-direct {v1, v2}, Lapd;-><init>(I)V

    .line 98
    invoke-static {}, Lasu;->p()Ldcj;

    move-result-object v2

    iget-object v2, v2, Ldcj;->b:Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    invoke-virtual {v1, v2}, Lapd;->a(I)Lapd;

    move-result-object v1

    .line 96
    invoke-virtual {v0, v1}, Lape;->a(Lapd;)V

    .line 99
    :goto_0
    return-void

    .line 86
    :cond_1
    iget-object v0, p0, Lasv;->b:Lasu;

    .line 2612
    iget-object v0, v0, Lj;->y:Lm;

    .line 86
    invoke-virtual {v0}, Lm;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    sget v1, Lb;->bE:I

    const/4 v2, 0x0

    invoke-static {v0, v1, v2}, Landroid/widget/Toast;->makeText(Landroid/content/Context;II)Landroid/widget/Toast;

    move-result-object v0

    .line 87
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    goto :goto_0
.end method
