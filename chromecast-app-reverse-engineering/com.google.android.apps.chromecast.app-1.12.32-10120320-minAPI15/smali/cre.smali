.class public final Lcre;
.super Ljava/lang/Object;
.source "PG"

# interfaces
.implements Lcrh;


# instance fields
.field private synthetic a:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;


# direct methods
.method public constructor <init>(Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;)V
    .locals 0

    .prologue
    .line 1165
    iput-object p1, p0, Lcre;->a:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Landroid/view/View;)Lcrg;
    .locals 3

    .prologue
    .line 1168
    new-instance v1, Lcrg;

    invoke-direct {v1}, Lcrg;-><init>()V

    .line 1169
    iput-object p1, v1, Lcrg;->b:Landroid/view/View;

    .line 1170
    sget v0, La;->hV:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Lcrg;->c:Landroid/view/View;

    .line 1171
    sget v0, La;->hY:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Lcrg;->e:Landroid/view/View;

    .line 1172
    iget-object v0, v1, Lcrg;->e:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcrg;->k:Landroid/widget/ImageView;

    .line 1173
    sget v0, La;->hS:I

    .line 1174
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcrg;->f:Landroid/widget/TextView;

    .line 1175
    sget v0, La;->hR:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcrg;->g:Landroid/widget/TextView;

    .line 1176
    sget v0, La;->ib:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcrg;->j:Landroid/widget/ImageView;

    .line 1177
    sget v0, La;->hT:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Lcom/google/android/gms/people/accountswitcherview/ExpanderView;

    iput-object v0, v1, Lcrg;->d:Lcom/google/android/gms/people/accountswitcherview/ExpanderView;

    .line 1178
    sget v0, La;->ik:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Lcrg;->a:Landroid/view/View;

    .line 1179
    iget-object v0, p0, Lcre;->a:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    sget v2, La;->hU:I

    invoke-virtual {v0, v2}, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Lcrg;->x:Landroid/view/View;

    .line 1180
    iget-object v0, p0, Lcre;->a:Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;

    invoke-static {v0}, Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;->f(Lcom/google/android/gms/people/accountswitcherview/SelectedAccountNavigationView;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 1181
    sget v0, La;->hZ:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Lcrg;->h:Landroid/view/View;

    .line 1182
    iget-object v0, v1, Lcrg;->h:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcrg;->l:Landroid/widget/ImageView;

    .line 1183
    sget v0, La;->ia:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Lcrg;->i:Landroid/view/View;

    .line 1184
    iget-object v0, v1, Lcrg;->i:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcrg;->m:Landroid/widget/ImageView;

    .line 1185
    sget v0, La;->ih:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Lcrg;->q:Landroid/view/View;

    .line 1186
    iget-object v0, v1, Lcrg;->q:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcrg;->u:Landroid/widget/ImageView;

    .line 1187
    sget v0, La;->ii:I

    .line 1188
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcrg;->r:Landroid/widget/ImageView;

    .line 1189
    sget v0, La;->ij:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Lcrg;->n:Landroid/view/View;

    .line 1190
    sget v0, La;->ig:I

    .line 1191
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcrg;->o:Landroid/widget/TextView;

    .line 1192
    sget v0, La;->if:I

    .line 1193
    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    iput-object v0, v1, Lcrg;->p:Landroid/widget/TextView;

    .line 1194
    sget v0, La;->ic:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Lcrg;->s:Landroid/view/View;

    .line 1195
    iget-object v0, v1, Lcrg;->s:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcrg;->v:Landroid/widget/ImageView;

    .line 1196
    sget v0, La;->id:I

    invoke-virtual {p1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    iput-object v0, v1, Lcrg;->t:Landroid/view/View;

    .line 1197
    iget-object v0, v1, Lcrg;->t:Landroid/view/View;

    check-cast v0, Landroid/widget/ImageView;

    iput-object v0, v1, Lcrg;->w:Landroid/widget/ImageView;

    .line 1200
    :cond_0
    return-object v1
.end method
